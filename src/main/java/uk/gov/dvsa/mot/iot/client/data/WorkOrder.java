package uk.gov.dvsa.mot.iot.client.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkOrder {

    private String siteNumber;

    private Long testNumber;

    private State workOrderState;

    private Vehicle vehicle;

    private BrakeTestResult brakeTestResult;

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

    public Long getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(Long testNumber) {
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

    public BrakeEffort getFrontService(){
        return getBrakeTestResult().getServiceBrakeEfforts().get(0);
    }

    public BrakeEffort getRearService() {
        return getBrakeTestResult().getServiceBrakeEfforts().get(1);
    }

    public BrakeEffort getRearParking(){
        return getBrakeTestResult().getParkingBrakeEfforts().get(0);
    }

    public enum State {
        NEW,
        COMPLETE,
        CANCELLED
    }
}
