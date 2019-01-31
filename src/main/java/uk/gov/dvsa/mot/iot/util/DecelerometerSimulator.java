package uk.gov.dvsa.mot.iot.util;

import uk.gov.dvsa.mot.iot.client.data.BrakeTestResult;
import uk.gov.dvsa.mot.iot.client.data.Vehicle;
import uk.gov.dvsa.mot.iot.util.builderhelpers.BrakeTestResultBuilder;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecelerometerSimulator {

    private DecelerometerSimulator() {
    }

    public static DecelerometerSimulator aDecelerometerSimulator(){
        return new DecelerometerSimulator();
    }

    public BrakeTestResult simulateTest(Vehicle vehicle) {
        return BrakeTestResultBuilder.aBrakeTestResult()
                .withParkingBrakeTestType(BrakeTestResult.BrakeTestType.DECELEROMETER)
                .withParkingBrakeEfficiency(generateRandomValue(50, 80))
                .withServiceBrakeTestType(BrakeTestResult.BrakeTestType.DECELEROMETER)
                .withServiceBrakeEfficiency(generateRandomValue(70, 90))
                .withVehicleWeightType(null).withBrakeLineType(null)
                .build();
    }

    private BigDecimal generateRandomValue(int min, int max) {
        return new BigDecimal(min + Math.random() * (max - min)).setScale(1, RoundingMode.CEILING);
    }
}
