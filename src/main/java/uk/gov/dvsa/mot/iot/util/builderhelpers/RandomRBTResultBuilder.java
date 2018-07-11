package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.BrakeEffort;
import uk.gov.dvsa.mot.iot.client.data.BrakeTestResult;

import java.util.Random;

public class RandomRBTResultBuilder {

    private RandomRBTResultBuilder() {
    }

    public static RandomRBTResultBuilder aRandomRBTResult() {
        return new RandomRBTResultBuilder();
    }

    public BrakeTestResult build() {
        BrakeEffort serviceBrakeFront = BrakeEffortBuilder.aBrakeEffort()
                .withAxleNumber(1)
                .withNearside(generateValue(490, 510))
                .withNearsideLock(false)
                .withOffside(generateValue(490, 510))
                .withOffsideLock(false)
                .build();

        BrakeEffort serviceBrakeRear = BrakeEffortBuilder.aBrakeEffort()
                .withAxleNumber(2)
                .withNearside(generateValue(390, 410))
                .withNearsideLock(false)
                .withOffside(generateValue(390, 410))
                .withOffsideLock(false)
                .build();

        BrakeEffort parkingBrakeRear = BrakeEffortBuilder.aBrakeEffort()
                .withAxleNumber(2)
                .withNearside(generateValue(390, 410))
                .withNearsideLock(false)
                .withOffside(generateValue(390, 410))
                .withOffsideLock(false)
                .build();

        return BrakeTestResultBuilder.aBrakeTestResult()
                .withServiceBrakeTestType(BrakeTestResult.BrakeTestType.ROLLER)
                .withVehicleWeightKg(generateValue(1500, 1600))
                .withVehicleWeightType(BrakeTestResult.VehicleWeightType.PRESENTED)
                .withServiceBrakeEfforts(serviceBrakeFront)
                .withServiceBrakeEfforts(serviceBrakeRear)
                .withParkingBrakeTestType(BrakeTestResult.BrakeTestType.ROLLER)
                .withParkingBrakeEfforts(parkingBrakeRear)
                .build();
    }

    private int generateValue(int low, int high) {
        return new Random().nextInt(high - low) + low;
    }
}
