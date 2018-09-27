package uk.gov.dvsa.mot.iot;

import uk.gov.dvsa.mot.iot.client.IotService;
import uk.gov.dvsa.mot.iot.client.MessageListener;
import uk.gov.dvsa.mot.iot.client.data.BrakeTestResult;
import uk.gov.dvsa.mot.iot.client.data.EmissionsTestResult;
import uk.gov.dvsa.mot.iot.client.data.OBDTestResult;
import uk.gov.dvsa.mot.iot.client.data.WorkOrder;
import uk.gov.dvsa.mot.iot.util.EGASimulator;
import uk.gov.dvsa.mot.iot.util.OBDSimulator;
import uk.gov.dvsa.mot.iot.util.RBTSimulator;

public class ConnectedEquipmentSimulator implements MessageListener {

    //TODO: Update clientXX.properties to match property file issued by DVSA
    private static String PROPERTY_FILE = "clientXX.properties";
    private IotService iotService;
    private boolean rbtTest;
    private boolean obdTest;
    private boolean egaTest;

    @Override
    public void onMessage(WorkOrder workOrder) {
        OBDTestResult obdTestResult = null;
        if (obdTest){
            obdTestResult = OBDSimulator.anObdSimulator().simulateTest(workOrder.getVehicle());
        }

        BrakeTestResult brakeTestResult = null;
        if (rbtTest){
            brakeTestResult = RBTSimulator.anRBTSimulator().simulateTest(workOrder.getVehicle());
        }

        EmissionsTestResult emissionsTestResult = null;
        if(egaTest){
            emissionsTestResult = EGASimulator.anEGASimulator().simulateTest(workOrder.getVehicle());
        }

        workOrder.setWorkOrderState(WorkOrder.State.COMPLETE);
        workOrder.setObdTestResult(obdTestResult);
        workOrder.setBrakeTestResult(brakeTestResult);
        workOrder.setEmissionsTestResult(emissionsTestResult);

        iotService.publish(workOrder);
    }

    private void setRbtTest(boolean rbtTest) {
        this.rbtTest = rbtTest;
    }

    private void setObdTest(boolean obdTest) {
        this.obdTest = obdTest;
    }

    public void setEgaTest(boolean egaTest) {
        this.egaTest = egaTest;
    }

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Usage: ConnectedEquipmentSimulator <args>");
            System.out.println("valid <args> are OBD, RBT, EGA & ALL");
            return;
        }

        boolean rbt = false;
        boolean obd = false;
        boolean ega = false;

        for(String arg: args){
            if(arg.toUpperCase().equals("RBT")){
                rbt = true;
            } else if (arg.toUpperCase().equals("OBD")) {
                obd = true;
            } else if(arg.toUpperCase().equals("EGA")){
                ega = true;
            } else if (arg.toUpperCase().equals("ALL")){
                rbt = true;
                obd = true;
                ega = true;
            } else if (arg.endsWith(".properties")){
                PROPERTY_FILE = arg;
            }
        }

        ConnectedEquipmentSimulator connectedEquipmentSimulator = new ConnectedEquipmentSimulator();
        connectedEquipmentSimulator.setObdTest(obd);
        connectedEquipmentSimulator.setRbtTest(rbt);
        connectedEquipmentSimulator.setEgaTest(ega);
        connectedEquipmentSimulator.start();
    }

    private void start() {
        if(rbtTest){
            System.out.println("RBT Simulator");
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
