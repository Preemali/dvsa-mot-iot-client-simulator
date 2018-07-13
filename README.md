# dvsa-mot-iot-client-simulator
The purpose of this code is only to demonstrate and test the DVSA IoT API used to connect garage test equipment used for
the MOT Inspection such as Roller Brake Testers (RBT), Onboard Diagnostics (OBD), Exhaust Gas Analysers (EGA) etc.

It is only for reference and is NOT intended for production use.

Whilst this reference implementation is written in Java, there is no expectation or requirement to use this programming language in your own code. 
The only practical limitation is to use a programming language that has an Amazon SDK available, see https://aws.amazon.com/tools/ for details.

To use, first obtain the necessary files to replace the dummy rbt-simulator* files. The issued files will be named clientXX* where XX is a sequential number. 
Copy the clientXX.cert.pem, clientXX.private.key and clientXX.public.key to your <ProjectRoot> directory and clientXX.properties 
to <ProjectRoot>/src/main/resources/uk/gov/dvsa/mot/iot/util. Update the PROPERTY_FILE attribute in uk.gov.dvsa.mot.iot.ConnectedEquipmentSimulator 
to match the issued property file name and then run ConnectedEquipmentSimulator.

A Demo of the RBT Simulator being used with PostMan can be found at https://www.youtube.com/watch?v=P7RDE0PJdik

### Project Overview and HLD

An initial High Level Design for the new service that will he hosted in the DVSA AWS cloud along with the UK MOT Service.

![High Level Design](/etc/C2V-HLD.jpeg)

The IoT service has an internal private ReST API used by the MOT application and a public IoT MQTT API used by the MOT Test 
Stations to connect their test equipment and send the results directly to the DVSA rather than keying them in manually
during the MOT Test.

The data is transmitted in JSON format and samples of the [Request](etc/WorkOrderRequest.json) and [Response](etc/WorkOrderResponse.json) 
for a Roller Brake Test are provided

### Data Flow

1. MOT Tester logs onto MOT Testing System (MTS) to start MOT test.
2. Tester enters Vehicle Registration and VIN to find Vehicle to be tested.
3. Tester clicks 'Start'.

   At this point the MTS system will send the Vehicle Details to the Test Center equipment as a JSON [Request](etc/WorkOrderRequest.json) message.
   
4. Tester begins MOT inspection.
5. Tester goes to connected equipment and selects Vehicle that has been sent from MTS in step above.
6. Equipment performs test and generate test results.

   Repeat for each piece of connected equipment (RBT, EGA, OBD etc)
   
7. Test results are combined and sent to MTS as a JSON [Response](etc/WorkOrderResponse.json) message.
8. Tester completes visual inspection of vehicle and returns to MTS to enter test results.
9. Tester resumes test and data from connected equipment (RBT) is already present in MTS.
10. Complete test.

