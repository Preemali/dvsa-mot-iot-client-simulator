package uk.gov.dvsa.mot.iot;

import uk.gov.dvsa.mot.iot.client.IotService;
import uk.gov.dvsa.mot.iot.client.MessageListener;
import uk.gov.dvsa.mot.iot.client.data.BrakeTestResult;
import uk.gov.dvsa.mot.iot.client.data.EmissionsTestResult;
import uk.gov.dvsa.mot.iot.client.data.OBDTestResult;
import uk.gov.dvsa.mot.iot.client.data.WorkOrder;
import uk.gov.dvsa.mot.iot.util.DecelerometerSimulator;
import uk.gov.dvsa.mot.iot.util.EGASimulator;
import uk.gov.dvsa.mot.iot.util.OBDSimulator;
import uk.gov.dvsa.mot.iot.util.RBTSimulator;

/**
 * This Equipment Simulator is designed to allow the development and testing of the MOT Testing Service (MTS)
 * without the need for real equipment to be in place.
 * It can also be used as a reference implementation for equipment manufacturers to understand how they could
 * create an IoT client to connect their equipment to the MTS connected equipment API. Although it is written
 * in Java, there is no requirement for equipment manufacturers to also use this programming language.
 */
public class ConnectedEquipmentSimulator implements MessageListener {

    //TODO: Update clientXX.properties to match property file issued by DVSA
    private static String PROPERTY_FILE = "clientXX.properties";
    private IotService iotService;
    private boolean rbtTest;
    private boolean decelTest;
    private boolean obdTest;
    private boolean egaTest;
    private RBTSimulator.RBTTestCase rbtTestCase;
    private EGASimulator.EGATestCase egaTestCase;

    @Override
    public void onMessage(WorkOrder workOrder) {
        OBDTestResult obdTestResult = null;
        if (obdTest){
            obdTestResult = OBDSimulator.anObdSimulator().simulateTest(workOrder.getVehicle());
        }

        BrakeTestResult brakeTestResult = null;
        if (rbtTest){
            brakeTestResult = RBTSimulator.anRBTSimulator().simulateTest(workOrder.getVehicle(), rbtTestCase);
        } else if (decelTest){
            brakeTestResult = DecelerometerSimulator.aDecelerometerSimulator().simulateTest(workOrder.getVehicle());
        }

        EmissionsTestResult emissionsTestResult = null;
        if(egaTest){
            emissionsTestResult = EGASimulator.anEGASimulator().simulateTest(workOrder.getVehicle(), egaTestCase);
        }

        workOrder.setObdTestResult(obdTestResult);
        workOrder.setBrakeTestResult(brakeTestResult);
        workOrder.setEmissionsTestResult(emissionsTestResult);

        iotService.publish(workOrder);
    }

    private void setRbtTest(boolean rbtTest) {
        this.rbtTest = rbtTest;
    }

    private void setDecelTest(boolean decelTest) {
        this.decelTest = decelTest;
    }

    private void setObdTest(boolean obdTest) {
        this.obdTest = obdTest;
    }

    public void setEgaTest(boolean egaTest) {
        this.egaTest = egaTest;
    }

    public void setRbtTestCase(RBTSimulator.RBTTestCase rbtTestCase) {
        this.rbtTestCase = rbtTestCase;
    }

    public void setEgaTestCase(EGASimulator.EGATestCase egaTestCase) {
        this.egaTestCase = egaTestCase;
    }

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Usage: ConnectedEquipmentSimulator <args>");
            System.out.println("valid <args> are OBD, RBT, EGA, DECEL & ALL");
            return;
        }

        boolean rbt = false;
        boolean obd = false;
        boolean ega = false;
        boolean decel = false;
        RBTSimulator.RBTTestCase rbtTestCase = null;
        EGASimulator.EGATestCase egaTestCase = null;

        for(String arg: args){
            if(arg.toUpperCase().equals("RBT")){
                rbt = true;
            } else if (arg.toUpperCase().equals("OBD")) {
                obd = true;
            } else if(arg.toUpperCase().equals("EGA")) {
                ega = true;
            } else if(arg.toUpperCase().equals("DECEL")) {
                decel = true;
            } else if (arg.toUpperCase().equals("ALL")){
                rbt = true;
                obd = true;
                ega = true;
            } else if (arg.endsWith(".properties")){
                PROPERTY_FILE = arg;
            } else {
                if(rbt){
                    rbtTestCase = RBTSimulator.parseRBTTestCase(arg.toUpperCase());
                } else if (ega)
                {
                    egaTestCase =  EGASimulator.parseEGATestCase(arg.toUpperCase());
                }
            }
        }

        ConnectedEquipmentSimulator connectedEquipmentSimulator = new ConnectedEquipmentSimulator();
        connectedEquipmentSimulator.setObdTest(obd);
        connectedEquipmentSimulator.setRbtTest(rbt);
        connectedEquipmentSimulator.setEgaTest(ega);
        connectedEquipmentSimulator.setDecelTest(decel);
        connectedEquipmentSimulator.setRbtTestCase(rbtTestCase);
        connectedEquipmentSimulator.setEgaTestCase(egaTestCase);
        connectedEquipmentSimulator.start();
    }

    private void start() {
        if(rbtTest){
            System.out.println("RBT Simulator");
            if(rbtTestCase != null){
                System.out.println("RBT Test Case: " + rbtTestCase.toString());
            }
        } else if(decelTest){
            System.out.println("Decelerometer Simulator");
        }
        if(obdTest){
            System.out.println("OBD Simulator");
        }
        if(egaTest){
            System.out.println("EGA Simulator");
        }
        iotService = new IotService(this, PROPERTY_FILE);
    }
}
