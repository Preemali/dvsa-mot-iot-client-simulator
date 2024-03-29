package uk.gov.dvsa.mot.iot.client.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrder {

    private String siteNumber;

    private String testNumber;

    private State workOrderState;

    private Vehicle vehicle;

    private BrakeTestResult brakeTestResult;

    private OBDTestResult obdTestResult;

    private EmissionsTestResult emissionsTestResult;

    public WorkOrder() {
        setWorkOrderState(State.NEW);
    }

    public WorkOrder(State workOrderState) {
        this.workOrderState = workOrderState;
    }

    public String getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(String siteNumber) {
        this.siteNumber = siteNumber;
    }

    public State getWorkOrderState() {
        return workOrderState;
    }

    public void setWorkOrderState(State workOrderState) {
        this.workOrderState = workOrderState;
    }

    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public BrakeTestResult getBrakeTestResult() {
        return brakeTestResult;
    }

    public void setBrakeTestResult(BrakeTestResult brakeTestResult) {
        this.brakeTestResult = brakeTestResult;
    }

    public OBDTestResult getObdTestResult() {
        return obdTestResult;
    }

    public void setObdTestResult(OBDTestResult obdTestResult) {
        this.obdTestResult = obdTestResult;
    }

    public EmissionsTestResult getEmissionsTestResult() {
        return emissionsTestResult;
    }

    public void setEmissionsTestResult(EmissionsTestResult emissionsTestResult) {
        this.emissionsTestResult = emissionsTestResult;
    }

    public enum State {
        NEW,
        COMPLETE,
        CANCELLED
    }
}
