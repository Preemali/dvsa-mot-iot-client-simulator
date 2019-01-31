package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.BrakeEffort;
import uk.gov.dvsa.mot.iot.client.data.BrakeTestResult;

public class RBTTestConditionBuilder {

    private BrakeTestResultBuilder brakeTestResultBuilder;

    private RBTTestConditionBuilder() {
    }

    public static RBTTestConditionBuilder aBrakeTestConditionBuilder(){
        return new RBTTestConditionBuilder();
    }

    /**
     * Service brake, pass
     * Verify that when the RBT populates values so that the service brake efficiency is >58%, this is still regarded as a pass.
     * @return car weight is 1000kg and values are 90, 90 (axle 1), 200, 200 (axle 2), 300, 300 (parking brake)
     */
    public RBTTestConditionBuilder withServiceBrakePass(){
        brakeTestResultBuilder = createTestResult(
                1000,
                90, 90,
                200, 200,
                300, 300);
        return this;
    }

    /**
     * Service brake, failure
     * Verify that when the RBT populates values for the service brake with efficiency <58% then this is still regarded as a failure.
     * @return car weight is 1000kg and values are 100, 100 (axle 1), 100, 100 (axle 2), 300, 300 (parking brake)
     */
    public RBTTestConditionBuilder withServiceBrakeFailure(){
        brakeTestResultBuilder = createTestResult(
                1000,
                100, 100,
                100, 100,
                300, 300);
        return this;
    }

    /**
     * Service brake, dangerous fail
     * Verify that when the RBT populates values so that the service braking efficiency is 0% then this is still regarded as a dangerous fail.
     * @return car weight is 1000kg and the values are 0, 0 (axle 1), 0, 0 (axle 2), 300, 300 (parking brake)
     */
    public RBTTestConditionBuilder withServiceBrakeDangerousFailure(){
        brakeTestResultBuilder = createTestResult(
                1000,
                0, 0,
                0, 0,
                300, 300);
        return this;
    }

    /**
     * Service brake, imbalance fail
     * Verify that when the RBT populates values for the service brake which has has an imbalance of >30% across an axle
     * (but not over 50%), this is still regarded as a failure.
     * @return car weight is 1000kg and brake values from RBT are 300, 207 (axle 1), 250, 250 (axle 2), 300, 300 (parking brake)
     */
    public RBTTestConditionBuilder withServiceBrakeImbalanceFailure(){
        brakeTestResultBuilder = createTestResult(
                1000,
                300, 207,
                250, 250,
                300, 300);
        return this;
    }

    /**
     * Service brake imbalance dangerous fail
     * Verify that when the RBT populates values for the service brake which has has an imbalance of >50% across an axle,
     * this is still regarded as a fail.
     * @return car weight is 1000kg and brake values from RBT are 300, 140 (axle 1), 250, 250 (axle 2), 300, 300 (parking brake)
     */
    public RBTTestConditionBuilder withServiceBrakeImbalanceDangerousFailure(){
        brakeTestResultBuilder = createTestResult(
                1000,
                300, 140,
                250, 250,
                300, 300);
        return this;
    }

    /**
     * Parking brake failure
     * Verify that when the RBT populates values for the parking brake which meets an efficiency of <16% this is still regarded as a failure.
     * @return car weight is 1000kg and the values by RBT are 250, 250 (axle 1), 250, 250 (axle 2), 78 and 78 (parking brake) 
     */
    public RBTTestConditionBuilder withParkingBrakeFailure(){
        brakeTestResultBuilder = createTestResult(
                1000,
                250, 250,
                250, 250,
                78, 78);
        return this;
    }

    /**
     * Parking brake dangerous failure
     * Verify that when the RBT populates values for the parking brake which are at 0%, then this is still regarded as a dangerous failure.
     * @return car weight is 1000kg and the values passed by RBT are 250, 250 (axle 1), 250, 250 (axle 2) and parking brake 1, 1. 
     */
    public RBTTestConditionBuilder withParkingBrakeDangerousFailure(){
        brakeTestResultBuilder = createTestResult(
                1000,
                250, 250,
                250, 250,
                1, 1);
        return this;
    }

    /**
     * Parking brake pass
     * Verify that when the RBT populates values for the parking brake which are over 16% then this is still regarded as a pass.
     * @return car weight is 1000kg and values passed by RBT are 250, 250 (axle 1), 250, 250 (axle 2) and parking brake values 80, 80. 
     */
    public RBTTestConditionBuilder withParkingBrakePass(){
        brakeTestResultBuilder = createTestResult(
                1000,
                250, 250,
                250, 250,
                80, 80);
        return this;
    }

    /**
     * Service brake failure, service brake imbalance failure and parking brake fail
     * Verify that when the RBT populates values so the service brake efficiency is <58%, and the service brake imbalance
     * is >30 but <50 and the parking brake efficiency is <16% (but not 0%) then the service brake efficiency, brake imbalance
     * and parking brake efficiency will all be failures.
     * @return Car weight is 1000kg and values passed by RBT are 130, 70 (axle 1), 100, 100 (axle 2), 50, 50 (parking brake)
     */
    public RBTTestConditionBuilder withServiceBrakeImbalanceFailureParkingBrakeFailure(){
        brakeTestResultBuilder = createTestResult(
                1000,
                130, 70,
                100, 100,
                50, 50);
        return this;
    }

    /**
     * Service brake, imbalance and parking brake all pass - happy path
     * Verify that when the RBT populates values so that parking brake efficiency is >58%, service brake imbalance is <30
     * and parking brake efficiency is >16% then these will all pass.
     * @return Car weight is 1000kg, and values passed by RBT are 150, 150 (axle 1), 150, 150 (axle 2), 200, 200 (parking brake)
     */
    public RBTTestConditionBuilder withServiceBrakeParkingBrakePass(){
        brakeTestResultBuilder = createTestResult(
                1000,
                150, 150,
                150, 150,
                200, 200);
        return this;
    }

    public BrakeTestResult build(){
        return brakeTestResultBuilder.build();
    }

    private BrakeTestResultBuilder createTestResult(int vehicleWeight,
                                                    int nearSideFront, int offSideFront,
                                                    int nearSideRear, int offSideRear,
                                                    int nearSideParking, int offSideParking){

        BrakeEffort serviceBrakeFront = BrakeEffortBuilder.aBrakeEffort()
                .withAxleNumber(1)
                .withNearside(nearSideFront)
                .withOffside(offSideFront)
                .build();

        BrakeEffort serviceBrakeRear = BrakeEffortBuilder.aBrakeEffort()
                .withAxleNumber(2)
                .withNearside(nearSideRear)
                .withOffside(offSideRear)
                .build();

        BrakeEffort parkingBrakeRear = BrakeEffortBuilder.aBrakeEffort()
                .withAxleNumber(2)
                .withNearside(nearSideParking)
                .withOffside(offSideParking)
                .build();

        return BrakeTestResultBuilder.aBrakeTestResult()
                .withVehicleWeightKg(vehicleWeight)
                .withServiceBrakeEfforts(serviceBrakeFront)
                .withServiceBrakeEfforts(serviceBrakeRear)
                .withParkingBrakeEfforts(parkingBrakeRear);
    }
}
