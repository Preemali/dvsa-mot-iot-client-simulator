package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.BrakeTestResult;
import uk.gov.dvsa.mot.iot.client.data.Vehicle;
import uk.gov.dvsa.mot.iot.client.data.WorkOrder;

public final class WorkOrderBuilder {
    private String siteNumber;
    private Long testNumber;
    private WorkOrder.State workOrderState;
    private Vehicle vehicle;
    private BrakeTestResult brakeTestResult;

    private WorkOrderBuilder() {
    }

    public static WorkOrderBuilder aWorkOrder() {
        return new WorkOrderBuilder();
    }

    public WorkOrderBuilder withSiteNumber(String siteNumber) {
        this.siteNumber = siteNumber;
        return this;
    }

    public WorkOrderBuilder withTestNumber(Long testNumber) {
        this.testNumber = testNumber;
        return this;
    }

    public WorkOrderBuilder withWorkOrderState(WorkOrder.State workOrderState) {
        this.workOrderState = workOrderState;
        return this;
    }

    public WorkOrderBuilder withVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public WorkOrderBuilder withBrakeTestResult(BrakeTestResult brakeTestResult) {
        this.brakeTestResult = brakeTestResult;
        return this;
    }

    public WorkOrder build() {
        WorkOrder workOrder = new WorkOrder();
        workOrder.setSiteNumber(siteNumber);
        workOrder.setTestNumber(testNumber);
        workOrder.setWorkOrderState(workOrderState);
        workOrder.setVehicle(vehicle);
        workOrder.setBrakeTestResult(brakeTestResult);
        return workOrder;
    }

}
