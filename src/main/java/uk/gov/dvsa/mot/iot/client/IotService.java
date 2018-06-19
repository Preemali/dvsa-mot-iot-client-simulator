package uk.gov.dvsa.mot.iot.client;

import com.amazonaws.services.iot.client.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import uk.gov.dvsa.mot.iot.client.data.WorkOrder;
import uk.gov.dvsa.mot.iot.util.IotUtil;

import java.io.IOException;
import java.util.logging.Logger;

public class IotService {
    private static final Logger LOGGER = Logger.getLogger(IotService.class.getName());

    private String clientId;
    private String topicOut;
    private String topicIn;

    private AWSIotMqttClient awsIotClient;
    private MessageListener messageListener;
    private ObjectMapper objectMapper = new ObjectMapper();
    private final AWSIotQos topicQOS = AWSIotQos.QOS1;

    public IotService(MessageListener messageListener, String propertyFile) {
        assert messageListener != null;

        this.messageListener = messageListener;
        initClient(propertyFile);
    }

    public void publish(WorkOrder workOrder) {
        try {
            String json = objectMapper.writeValueAsString(workOrder);
            publish(json, topicOut);
        } catch (JsonProcessingException e) {
            LOGGER.severe("Error Processing JSON");
        }
    }

    public void publish(String msg, String topic) {
        try {
            AWSIotMessage message = new AWSIotMessage(topic, topicQOS, msg);
            awsIotClient.publish(message);
            LOGGER.info("Sent Message: " + msg + " on topic " + topic);
        } catch (AWSIotException e) {
            LOGGER.severe("Error publishing to Topic " + topic);
        } catch (Throwable e) {
            LOGGER.severe("**** ERROR **** " + e.getMessage());
        }
    }

    private void initClient(String propertyFile) {
        IotUtil iotUtil = IotUtil.getInstance(propertyFile);
        String clientEndpoint = iotUtil.getConfig("clientEndpoint");
        clientId = iotUtil.getConfig("clientId");

        topicIn = "mot/in/" + clientId;
        topicOut = "mot/out/" + clientId;

        String certificateFile = iotUtil.getConfig("certificateFile");
        String privateKeyFile = iotUtil.getConfig("privateKeyFile");

        if (awsIotClient == null && certificateFile != null && privateKeyFile != null) {
            String algorithm = iotUtil.getConfig("keyAlgorithm");

            IotUtil.KeyStorePasswordPair pair = iotUtil.getKeyStorePasswordPair(certificateFile, privateKeyFile, algorithm);

            awsIotClient = new AWSIotMqttClient(clientEndpoint, clientId, pair.keyStore, pair.keyPassword);
        }

        if (awsIotClient == null) {
            String awsAccessKeyId = iotUtil.getConfig("awsAccessKeyId");
            String awsSecretAccessKey = iotUtil.getConfig("awsSecretAccessKey");
            String sessionToken = iotUtil.getConfig("sessionToken");

            if (awsAccessKeyId != null && awsSecretAccessKey != null) {
                awsIotClient = new AWSIotMqttClient(clientEndpoint, clientId, awsAccessKeyId, awsSecretAccessKey,
                        sessionToken);
            }
        }

        if (awsIotClient == null) {
            LOGGER.severe("Failed to construct client due to missing certificate or credentials.");
            throw new IllegalArgumentException("Failed to construct client due to missing certificate or credentials.");
        }

        try {
            awsIotClient.connect();
            awsIotClient.subscribe(new TopicListener(topicIn, topicQOS), false);
            LOGGER.fine("Subscribed to topic " + topicIn);

        } catch (AWSIotException e) {
            LOGGER.severe("Failed to connect to Iot and subscribe to Topic " + topicIn);
        }
    }

    class TopicListener extends AWSIotTopic {

        TopicListener(String topic, AWSIotQos qos) {
            super(topic, qos);
        }

        @Override
        public void onMessage(AWSIotMessage message) {
            try {
                String json = message.getStringPayload();
                LOGGER.info("Received Message: " + json);
                WorkOrder workOrder = objectMapper.readValue(json, WorkOrder.class);
                messageListener.onMessage(workOrder);
            } catch (IOException e) {
                LOGGER.fine("Error " + e.getMessage() + " processing message " + message.getStringPayload());
            }
        }
    }

}
