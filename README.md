# dvsa-mot-iot-client-simulator
The purpose of this code is only to demonstrate and test the DVSA IoT API used to connect garage test equipment used for
the MOT Inspection such as Roller Brake Testers (RBT), Onboard Diagnostics (OBD), Exhaust Gas Analysers (EGA) etc.

It is NOT intended for production use.

To use, first obtain the necessary files to replace the dummy rbt-simulator* files, then run ConnectedEquipmentSimulator.

A Demo of the RBT Simulator being used with PostMan can be found at https://www.youtube.com/watch?v=P7RDE0PJdik

### Project Overview and HLD

An initial High Level Design for the new service that will he hosted in the DVSA AWS cloud along with the UK MOT Service.

![High Level Design](/etc/C2V-HLD.jpeg)

The IoT service has an internal private ReST API used by the MOT application and a public IoT MQTT API used by the MOT Test 
Stations to connect their test equipment and send the results directly to the DVSA rather than keying them in manually
during the MOT Test.

The data is transmitted in JSON format and samples of the [Request](etc/WorkOrderRequest.json) and [Response](etc/WorkOrderResponse.json) 
for a Roller Brake Test are provided
