package uk.gov.dvsa.mot.iot.util;

import uk.gov.dvsa.mot.iot.client.data.OBDTestResult;
import uk.gov.dvsa.mot.iot.client.data.Vehicle;
import uk.gov.dvsa.mot.iot.util.builderhelpers.RandomOBDTestResultBuilder;

public class OBDSimulator {

    private OBDSimulator() {
    }

    public static OBDSimulator anObdSimulator() {
        return new OBDSimulator();
    }

    public OBDTestResult simulateTest(Vehicle vehicle) {
        OBDTestResult obdTestResult = RandomOBDTestResultBuilder.aRandomOBDTestResult().build();

        displayBanner();
        pause(500);

        displayWorkOrderReceived();
        displayVehicleDetails(vehicle);
        pause(500);

        displayStartTest();
        pause(500);

        displayConnecting();
        testing();

        displayReadingData();
        testing();

        displayEndTest();
        displayTestResults(vehicle, obdTestResult);

        return obdTestResult;
    }

    private void displayBanner(){
        System.out.println("\n" +
                " ______   _   _   _____    ___  \n" +
                " |  _  \\ | | | | /  ___|  / _ \\ \n" +
                " | | | | | | | | \\ `--.  / /_\\ \\\n" +
                " | | | | | | | |  `--. \\ |  _  |\n" +
                " | |/ /  \\ \\_/ / /\\__/ / | | | |\n" +
                " |___/    \\___/  \\____/  \\_| |_/\n");

        System.out.println("\n" +
                "   ___  ____  ____    ____  _                 _       _             \n" +
                "  / _ \\| __ )|  _ \\  / ___|(_)_ __ ___  _   _| | __ _| |_ ___  _ __ \n" +
                " | | | |  _ \\| | | | \\___ \\| | '_ ` _ \\| | | | |/ _` | __/ _ \\| '__|\n" +
                " | |_| | |_) | |_| |  ___) | | | | | | | |_| | | (_| | || (_) | |   \n" +
                "  \\___/|____/|____/  |____/|_|_| |_| |_|\\__,_|_|\\__,_|\\__\\___/|_|   \n" +
                "                                                                    \n");

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

    private void displayConnecting(){
        System.out.println("\n" +
                "   ____                            _   _               _                    _     _      _      \n" +
                "  / ___|___  _ __  _ __   ___  ___| |_(_)_ __   __ _  | |_ ___   __   _____| |__ (_) ___| | ___ \n" +
                " | |   / _ \\| '_ \\| '_ \\ / _ \\/ __| __| | '_ \\ / _` | | __/ _ \\  \\ \\ / / _ \\ '_ \\| |/ __| |/ _ \\\n" +
                " | |__| (_) | | | | | | |  __/ (__| |_| | | | | (_| | | || (_) |  \\ V /  __/ | | | | (__| |  __/\n" +
                "  \\____\\___/|_| |_|_| |_|\\___|\\___|\\__|_|_| |_|\\__, |  \\__\\___/    \\_/ \\___|_| |_|_|\\___|_|\\___|\n" +
                "                                               |___/                                            \n");
    }

    private void displayReadingData(){
        System.out.println("\n" +
                "  ____                _ _                   _       _        \n" +
                " |  _ \\ ___  __ _  __| (_)_ __   __ _    __| | __ _| |_ __ _ \n" +
                " | |_) / _ \\/ _` |/ _` | | '_ \\ / _` |  / _` |/ _` | __/ _` |\n" +
                " |  _ <  __/ (_| | (_| | | | | | (_| | | (_| | (_| | || (_| |\n" +
                " |_| \\_\\___|\\__,_|\\__,_|_|_| |_|\\__, |  \\__,_|\\__,_|\\__\\__,_|\n" +
                "                                |___/                        \n");
    }

    private void displayVehicleDetails(Vehicle vehicle){
        System.out.println("Vehicle: ");
        System.out.println(" " + vehicle.getMake()
                + " " + vehicle.getModel()
                + "   Reg: " + vehicle.getVrm()
        );
    }

    private void displayTestResults(Vehicle vehicle, OBDTestResult obdTestResult){
        System.out.println("OBD TEST RESULTS:");
        System.out.println();
        displayVehicleDetails(vehicle);

        System.out.println("VIN: " + obdTestResult.getVin());
        System.out.println("Readiness Monitors: All OK");
        System.out.println("No of DTCs: " + obdTestResult.getDtcCount());
        if(obdTestResult.getDtcCount() > 0){
            System.out.println("DTCs: " + String.join(", ", obdTestResult.getDtcs()));

            System.out.println();
            System.out.println("Result: FAIL");
        } else {
            System.out.println();
            System.out.println("Result: PASS");
        }

        System.out.println();
    }

    private void testing(){
        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            pause(500);
        }
    }

    private void pause(int interval){
        try{
            Thread.sleep(interval);
        } catch (InterruptedException ie){
            // Do Nothing
        }
    }

}
