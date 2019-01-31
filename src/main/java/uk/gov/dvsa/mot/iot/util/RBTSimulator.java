package uk.gov.dvsa.mot.iot.util;

import uk.gov.dvsa.mot.iot.client.data.BrakeTestResult;
import uk.gov.dvsa.mot.iot.client.data.Vehicle;
import uk.gov.dvsa.mot.iot.util.builderhelpers.RBTTestConditionBuilder;
import uk.gov.dvsa.mot.iot.util.builderhelpers.RandomRBTResultBuilder;

/**
 * Roller Brake Test simulator, used only for testing and demonstration purposes
 */
public class RBTSimulator {

    private int interval = 0;

    private RBTSimulator() {
    }

    public static RBTSimulator anRBTSimulator(){
        return new RBTSimulator();
    }

    public static RBTTestCase parseRBTTestCase(String testCase){
        RBTTestCase rbtTestCase = null;
        try {
            rbtTestCase = RBTTestCase.valueOf(testCase);
        } catch (IllegalArgumentException iae){
            System.out.println("ERROR: " + testCase + " not recognised");
        }
        return rbtTestCase;
    }

    public RBTSimulator withInterval(int interval){
        this.interval = interval;
        return this;
    }

    public BrakeTestResult simulateTest(Vehicle vehicle, RBTTestCase rbtTestCase) {

        displayBanner();

        displayWorkOrderReceived();

        displayVehicleDetails(vehicle);

        displayStartTest();

        BrakeTestResult brakeTestResult = getBrakeTestResult(rbtTestCase);

        pause(interval);

        displayServiceBrake();

        pause(interval);
        displayFrontAxle();
        pause(interval);
        testing();
        results(brakeTestResult.getFrontService().getNearside(), brakeTestResult.getFrontService().getOffside());

        displayRearAxle();
        pause(interval);
        testing();
        results(brakeTestResult.getRearService().getNearside(), brakeTestResult.getRearService().getOffside());

        displayParkingBrake();

        pause(interval);
        testing();
        results(brakeTestResult.getRearParking().getNearside(), brakeTestResult.getRearParking().getOffside());

        pause(interval);
        displayEndTest();

        displaySendingResults();

        displayTestResults(vehicle, brakeTestResult);

        return brakeTestResult;

    }

    private void displayBanner(){
        System.out.println("\n" +
                " ______   _   _   _____    ___  \n" +
                " |  _  \\ | | | | /  ___|  / _ \\ \n" +
                " | | | | | | | | \\ `--.  / /_\\ \\\n" +
                " | | | | | | | |  `--. \\ |  _  |\n" +
                " | |/ /  \\ \\_/ / /\\__/ / | | | |\n" +
                " |___/    \\___/  \\____/  \\_| |_/\n");

        System.out.println("" +
                "  ____  ____ _____   ____  _                 _       _             \n" +
                " |  _ \\| __ )_   _| / ___|(_)_ __ ___  _   _| | __ _| |_ ___  _ __ \n" +
                " | |_) |  _ \\ | |   \\___ \\| | '_ ` _ \\| | | | |/ _` | __/ _ \\| '__|\n" +
                " |  _ <| |_) || |    ___) | | | | | | | |_| | | (_| | || (_) | |   \n" +
                " |_| \\_\\____/ |_|   |____/|_|_| |_| |_|\\__,_|_|\\__,_|\\__\\___/|_|   \n" +
                "                                                                   \n");
    }

    private void displayWorkOrderReceived(){
        System.out.println("\n" +
                " __      __       _    ___         _           ___            _            _ \n" +
                " \\ \\    / /__ _ _| |__/ _ \\ _ _ __| |___ _ _  | _ \\___ __ ___(_)_ _____ __| |\n" +
                "  \\ \\/\\/ / _ \\ '_| / / (_) | '_/ _` / -_) '_| |   / -_) _/ -_) \\ V / -_) _` |\n" +
                "   \\_/\\_/\\___/_| |_\\_\\\\___/|_| \\__,_\\___|_|   |_|_\\___\\__\\___|_|\\_/\\___\\__,_|\n" +
                "                                                                             \n");
    }

    private void displayStartTest(){
        System.out.println("\n" +
                "  ___ _____ _   ___ _____ ___ _  _  ___   _____ ___ ___ _____ \n" +
                " / __|_   _/_\\ | _ \\_   _|_ _| \\| |/ __| |_   _| __/ __|_   _|\n" +
                " \\__ \\ | |/ _ \\|   / | |  | || .` | (_ |   | | | _|\\__ \\ | |  \n" +
                " |___/ |_/_/ \\_\\_|_\\ |_| |___|_|\\_|\\___|   |_| |___|___/ |_|  \n" +
                "                                                              \n");
    }

    private void displayEndTest(){
        System.out.println("\n" +
                "  ___ _  _ ___    _____ ___ ___ _____ \n" +
                " | __| \\| |   \\  |_   _| __/ __|_   _|\n" +
                " | _|| .` | |) |   | | | _|\\__ \\ | |  \n" +
                " |___|_|\\_|___/    |_| |___|___/ |_|  \n" +
                "                                      \n");
    }

    private void displayFrontAxle(){
        System.out.println("\n" +
                "  ___            _       _        _     \n" +
                " | __| _ ___ _ _| |_    /_\\  __ _| |___ \n" +
                " | _| '_/ _ \\ ' \\  _|  / _ \\ \\ \\ / / -_)\n" +
                " |_||_| \\___/_||_\\__| /_/ \\_\\/_\\_\\_\\___|\n" +
                "                                        \n");
    }

    private void displayRearAxle(){
        System.out.println("\n" +
                "  ___                  _        _     \n" +
                " | _ \\___ __ _ _ _    /_\\  __ _| |___ \n" +
                " |   / -_) _` | '_|  / _ \\ \\ \\ / / -_)\n" +
                " |_|_\\___\\__,_|_|   /_/ \\_\\/_\\_\\_\\___|\n" +
                "                                      \n");
    }

    private void displayServiceBrake(){
        System.out.println("\n" +
                "  ___              _          ___          _       \n" +
                " / __| ___ _ ___ _(_)__ ___  | _ )_ _ __ _| |_____ \n" +
                " \\__ \\/ -_) '_\\ V / / _/ -_) | _ \\ '_/ _` | / / -_)\n" +
                " |___/\\___|_|  \\_/|_\\__\\___| |___/_| \\__,_|_\\_\\___|\n" +
                "                                                   \n");
    }

    private void displayParkingBrake(){
        System.out.println("\n" +
                "  ___          _   _             ___          _       \n" +
                " | _ \\__ _ _ _| |_(_)_ _  __ _  | _ )_ _ __ _| |_____ \n" +
                " |  _/ _` | '_| / / | ' \\/ _` | | _ \\ '_/ _` | / / -_)\n" +
                " |_| \\__,_|_| |_\\_\\_|_||_\\__, | |___/_| \\__,_|_\\_\\___|\n" +
                "                         |___/                        \n");
    }

    private void displaySendingResults(){
        System.out.println("\n" +
                "  ___              _ _             ___             _ _      \n" +
                " / __| ___ _ _  __| (_)_ _  __ _  | _ \\___ ____  _| | |_ ___\n" +
                " \\__ \\/ -_) ' \\/ _` | | ' \\/ _` | |   / -_|_-< || | |  _(_-<\n" +
                " |___/\\___|_||_\\__,_|_|_||_\\__, | |_|_\\___/__/\\_,_|_|\\__/__/\n" +
                "                           |___/                            \n");
    }

    private void displayVehicleDetails(Vehicle vehicle){
        System.out.println("Vehicle: ");
        System.out.println(" " + vehicle.getMake()
                + " " + vehicle.getModel()
                + "   Reg: " + vehicle.getVrm()
        );
    }

    private void displayTestResults(Vehicle vehicle, BrakeTestResult brakeTestResult){
        System.out.println("ROLLER BRAKE TEST RESULTS:");
        System.out.println();
        displayVehicleDetails(vehicle);
        System.out.println("Presented Weight: ");
        System.out.println(" " + brakeTestResult.getVehicleWeightKg() + "kg");
        System.out.println("Service Brake:");
        results(brakeTestResult.getFrontService().getNearside(), brakeTestResult.getFrontService().getOffside());
        results(brakeTestResult.getRearService().getNearside(), brakeTestResult.getRearService().getOffside());
        System.out.println("Parking Brake:");
        results(brakeTestResult.getRearParking().getNearside(), brakeTestResult.getRearParking().getOffside());
        System.out.println();
        System.out.println("Result: PASS");
        System.out.println();
    }

    private void results(int ns, int os){
        System.out.println(" Nearside: " + ns + " Offside: " + os);
    }

    private void testing(){
        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            pause(interval);
        }
    }

    private void pause(int interval){
        try{
            Thread.sleep(interval);
        } catch (InterruptedException ie){
            // Do Nothing
        }
    }

    private BrakeTestResult getBrakeTestResult(RBTTestCase rbtTestCase){
        BrakeTestResult brakeTestResult = null;
        if(rbtTestCase != null) {
            switch (rbtTestCase) {
                case SERVICEBRAKEPASS:
                    brakeTestResult = RBTTestConditionBuilder.aBrakeTestConditionBuilder().withServiceBrakePass().build();
                    break;
                case SERVICEBRAKEFAILURE:
                    brakeTestResult = RBTTestConditionBuilder.aBrakeTestConditionBuilder().withServiceBrakeFailure().build();
                    break;
                case SERVICEBRAKEDANGEROUSFAILURE:
                    brakeTestResult = RBTTestConditionBuilder.aBrakeTestConditionBuilder().withServiceBrakeDangerousFailure().build();
                    break;
                case SERVICEBRAKEIMBALANCEFAILURE:
                    brakeTestResult = RBTTestConditionBuilder.aBrakeTestConditionBuilder().withServiceBrakeImbalanceFailure().build();
                    break;
                case SERVICEBRAKEIMBALANCEDANGEROUSFAILURE:
                    brakeTestResult = RBTTestConditionBuilder.aBrakeTestConditionBuilder().withServiceBrakeImbalanceDangerousFailure().build();
                    break;
                case PARKINGBRAKEFAILURE:
                    brakeTestResult = RBTTestConditionBuilder.aBrakeTestConditionBuilder().withParkingBrakeFailure().build();
                    break;
                case PARKINGBRAKEDANGEROUSFAILURE:
                    brakeTestResult = RBTTestConditionBuilder.aBrakeTestConditionBuilder().withParkingBrakeDangerousFailure().build();
                    break;
                case PARKINGBRAKEPASS:
                    brakeTestResult = RBTTestConditionBuilder.aBrakeTestConditionBuilder().withParkingBrakePass().build();
                    break;
                case SERVICEBRAKEIMBALANCEFAILUREPARKINGBRAKEFAILURE:
                    brakeTestResult = RBTTestConditionBuilder.aBrakeTestConditionBuilder().withServiceBrakeImbalanceFailureParkingBrakeFailure().build();
                    break;
                case SERVICEBRAKEPARKINGBRAKEPASS:
                    brakeTestResult = RBTTestConditionBuilder.aBrakeTestConditionBuilder().withServiceBrakeParkingBrakePass().build();
                    break;
            }
        } else {
            brakeTestResult = RandomRBTResultBuilder.aRandomRBTResult().build();
        }

        return brakeTestResult;
    }

    public enum RBTTestCase {
        SERVICEBRAKEPASS,
        SERVICEBRAKEFAILURE,
        SERVICEBRAKEDANGEROUSFAILURE,
        SERVICEBRAKEIMBALANCEFAILURE,
        SERVICEBRAKEIMBALANCEDANGEROUSFAILURE,
        PARKINGBRAKEFAILURE,
        PARKINGBRAKEDANGEROUSFAILURE,
        PARKINGBRAKEPASS,
        SERVICEBRAKEIMBALANCEFAILUREPARKINGBRAKEFAILURE,
        SERVICEBRAKEPARKINGBRAKEPASS
    }
}
