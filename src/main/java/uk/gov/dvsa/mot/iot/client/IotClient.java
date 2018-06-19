package uk.gov.dvsa.mot.iot.client;

import com.amazonaws.services.iot.client.AWSIotMqttClient;

import java.security.KeyStore;

public class IotClient extends AWSIotMqttClient {


    public IotClient(String clientEndpoint, String clientId, KeyStore keyStore, String keyPassword) {
        super(clientEndpoint, clientId, keyStore, keyPassword);
    }

    public IotClient(String clientEndpoint, String clientId, String awsAccessKeyId, String awsSecretAccessKey) {
        super(clientEndpoint, clientId, awsAccessKeyId, awsSecretAccessKey);
    }

    public IotClient(String clientEndpoint, String clientId, String awsAccessKeyId, String awsSecretAccessKey, String sessionToken) {
        super(clientEndpoint, clientId, awsAccessKeyId, awsSecretAccessKey, sessionToken);
    }


}
