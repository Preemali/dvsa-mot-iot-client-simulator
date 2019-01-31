package uk.gov.dvsa.mot.iot.util;

import uk.gov.dvsa.mot.iot.client.data.EmissionsTestResult;
import uk.gov.dvsa.mot.iot.client.data.Vehicle;
import uk.gov.dvsa.mot.iot.util.builderhelpers.EGATestResultBuilder;

public class EGASimulator {

    private EGASimulator() {
    }

    public static EGASimulator anEGASimulator(){
        return new EGASimulator();
    }

    public static EGATestCase parseEGATestCase(String testCase){
        EGATestCase egaTestCase = null;
        try {
            egaTestCase = EGATestCase.valueOf(testCase);
        } catch (IllegalArgumentException iae){
            System.out.println("ERROR: " + testCase + " not recognised");
        }
        return egaTestCase;
    }

    public EmissionsTestResult simulateTest(Vehicle vehicle, EGATestCase egaTestCase){

        EmissionsTestResult emissionsTestResult = getTestResult(egaTestCase);

        displayBanner();
        pause(500);

        displayWorkOrderReceived();
        displayVehicleDetails(vehicle);
        pause(500);

        displayStartTest();
        pause(500);

        displayTesting();
        testing();

        displayTestResults(vehicle, emissionsTestResult);

        displayEndTest();

        return emissionsTestResult;
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
                "  _____ ____    _      ____  _                 _       _             \n" +
                " | ____/ ___|  / \\    / ___|(_)_ __ ___  _   _| | __ _| |_ ___  _ __ \n" +
                " |  _|| |  _  / _ \\   \\___ \\| | '_ ` _ \\| | | | |/ _` | __/ _ \\| '__|\n" +
                " | |__| |_| |/ ___ \\   ___) | | | | | | | |_| | | (_| | || (_) | |   \n" +
                " |_____\\____/_/   \\_\\ |____/|_|_| |_| |_|\\__,_|_|\\__,_|\\__\\___/|_|   \n" +
                "                                                                     \n");
    }

    private void displayWorkOrderReceived(){
        System.out.println("\n" +
                " __      __       _    ___         _           ___            _            _ \n" +
                " \\ \\    / /__ _ _| |__/ _ \\ _ _ __| |___ _ _  | _ \\___ __ ___(_)_ _____ __| |\n" +
                "  \\ \\/\\/ / _ \\ '_| / / (_) | '_/ _` / -_) '_| |   / -_) _/ -_) \\ V / -_) _` |\n" +
                "   \\_/\\_/\\___/_| |_\\_\\\\___/|_| \\__,_\\___|_|   |_|_\\___\\__\\___|_|\\_/\\___\\__,_|\n" +
                "                                                                             \n");
    }

    private void displayVehicleDetails(Vehicle vehicle){
        System.out.println("Vehicle: ");
        System.out.println(" " + vehicle.getMake()
                + " " + vehicle.getModel()
                + "   Reg: " + vehicle.getVrm()
        );
    }

    private void displayStartTest(){
        System.out.println("\n" +
                "  ___ _____ _   ___ _____ ___ _  _  ___   _____ ___ ___ _____ \n" +
                " / __|_   _/_\\ | _ \\_   _|_ _| \\| |/ __| |_   _| __/ __|_   _|\n" +
                " \\__ \\ | |/ _ \\|   / | |  | || .` | (_ |   | | | _|\\__ \\ | |  \n" +
                " |___/ |_/_/ \\_\\_|_\\ |_| |___|_|\\_|\\___|   |_| |___|___/ |_|  \n" +
                "                                                              \n");
    }

    private void displayTesting(){
        System.out.println("\n" +
                "  _____         _   _             \n" +
                " |_   _|__  ___| |_(_)_ __   __ _ \n" +
                "   | |/ _ \\/ __| __| | '_ \\ / _` |\n" +
                "   | |  __/\\__ \\ |_| | | | | (_| |\n" +
                "   |_|\\___||___/\\__|_|_| |_|\\__, |\n" +
                "                            |___/ \n");
    }

    private void displayEndTest(){
        System.out.println("\n" +
                "  ___ _  _ ___    _____ ___ ___ _____ \n" +
                " | __| \\| |   \\  |_   _| __/ __|_   _|\n" +
                " | _|| .` | |) |   | | | _|\\__ \\ | |  \n" +
                " |___|_|\\_|___/    |_| |___|___/ |_|  \n" +
                "                                      \n");
    }

    private void displayTestResults(Vehicle vehicle, EmissionsTestResult emissionsTestResult){
        System.out.println("EGA TEST RESULTS:");
        System.out.println();
        displayVehicleDetails(vehicle);
        System.out.println("Engine Temp: " + emissionsTestResult.getEngineTempValue());
        System.out.println("Overall Test Result " + emissionsTestResult.getOverallTestResult());
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

    private EmissionsTestResult getTestResult(EGATestCase egaTestCase){
        EmissionsTestResult emissionsTestResult = null;

        if(egaTestCase != null) {
            switch(egaTestCase){
                case SPARKBET:
                    emissionsTestResult = EGATestResultBuilder.anEGATestResultBuilder().withSparkBET().build();
                    break;
                case SPARKCAT:
                    emissionsTestResult = EGATestResultBuilder.anEGATestResultBuilder().withSparkCAT().build();
                    break;
                case SPARKNONCAT:
                    emissionsTestResult = EGATestResultBuilder.anEGATestResultBuilder().withSparkNonCAT().build();
                    break;
                case COMPRESSIONTURBO:
                    emissionsTestResult = EGATestResultBuilder.anEGATestResultBuilder().withCompressionTurbo().build();
                    break;
                case COMPRESSIONFASTPASS:
                    emissionsTestResult = EGATestResultBuilder.anEGATestResultBuilder().withCompressionFastPass().build();
                    break;
            }
        }

        return emissionsTestResult;
    }

    public enum EGATestCase {
        SPARKBET,
        SPARKCAT,
        SPARKNONCAT,
        COMPRESSIONFASTPASS,
        COMPRESSIONTURBO
    }

}
