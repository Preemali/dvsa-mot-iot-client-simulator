package uk.gov.dvsa.mot.iot.util;

import uk.gov.dvsa.mot.iot.client.data.BrakeEffort;
import uk.gov.dvsa.mot.iot.client.data.BrakeTestResult;
import uk.gov.dvsa.mot.iot.client.data.WorkOrder;
import uk.gov.dvsa.mot.iot.util.builderhelpers.BrakeEffortBuilder;
import uk.gov.dvsa.mot.iot.util.builderhelpers.BrakeTestResultBuilder;
import uk.gov.dvsa.mot.iot.util.builderhelpers.WorkOrderBuilder;

import java.util.Random;

public class RandomRBTResultBuilder {

    private WorkOrder workOrderRequest;

    private RandomRBTResultBuilder() {
    }

    public static RandomRBTResultBuilder aRandomRBTResult() {
        return new RandomRBTResultBuilder();
    }

    public RandomRBTResultBuilder withWorkOrderRequest(WorkOrder workOrderRequest) {
        this.workOrderRequest = workOrderRequest;
        return this;
    }

    public WorkOrder build() {
        return buildRandomBrakeTestResults(this.workOrderRequest);
    }

    private WorkOrder buildRandomBrakeTestResults(WorkOrder workOrder){
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

        BrakeTestResult brakeTestResult = BrakeTestResultBuilder.aBrakeTestResult()
                .withServiceBrakeTestType(BrakeTestResult.BrakeTestType.ROLLER)
                .withVehicleWeightKg(generateValue(1500, 1600))
                .withVehicleWeightType(BrakeTestResult.VehicleWeightType.PRESENTED)
                .withServiceBrakeEfforts(serviceBrakeFront)
                .withServiceBrakeEfforts(serviceBrakeRear)
                .withParkingBrakeTestType(BrakeTestResult.BrakeTestType.ROLLER)
                .withParkingBrakeEfforts(parkingBrakeRear)
                .build();

        WorkOrder workOrderResponse = WorkOrderBuilder.aWorkOrder()
                .withSiteNumber(workOrder.getSiteNumber())
                .withTestNumber(workOrder.getTestNumber())
                .withWorkOrderState(WorkOrder.State.COMPLETE)
                .withVehicle(workOrder.getVehicle())
                .withBrakeTestResult(brakeTestResult)
                .build();

        return workOrderResponse;
    }

    private int generateValue(int low, int high) {
        return new Random().nextInt(high - low) + low;
    }
}
