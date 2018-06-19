package uk.gov.dvsa.mot.iot.client.data;

import java.util.ArrayList;
import java.util.List;

public class BrakeTestResult {

    private BrakeTestType serviceBrakeTestType;
    private BrakeTestType parkingBrakeTestType;
    private VehicleWeightType vehicleWeightType;
    private Integer vehicleWeightKg;
    private BrakeLineType brakeLineType = BrakeLineType.DUAL;
    private List<BrakeEffort> serviceBrakeEfforts;
    private List<BrakeEffort> parkingBrakeEfforts;

    public BrakeTestType getServiceBrakeTestType() {
        return serviceBrakeTestType;
    }

    public void setServiceBrakeTestType(BrakeTestType serviceBrakeTestType) {
        this.serviceBrakeTestType = serviceBrakeTestType;
    }

    public BrakeTestType getParkingBrakeTestType() {
        return parkingBrakeTestType;
    }

    public void setParkingBrakeTestType(BrakeTestType parkingBrakeTestType) {
        this.parkingBrakeTestType = parkingBrakeTestType;
    }

    public VehicleWeightType getVehicleWeightType() {
        return vehicleWeightType;
    }

    public void setVehicleWeightType(VehicleWeightType vehicleWeightType) {
        this.vehicleWeightType = vehicleWeightType;
    }

    public Integer getVehicleWeightKg() {
        return vehicleWeightKg;
    }

    public void setVehicleWeightKg(Integer vehicleWeightKg) {
        this.vehicleWeightKg = vehicleWeightKg;
    }

    public BrakeLineType getBrakeLineType() {
        return brakeLineType;
    }

    public void setBrakeLineType(BrakeLineType brakeLineType) {
        this.brakeLineType = brakeLineType;
    }

    public List<BrakeEffort> getServiceBrakeEfforts() {
        return serviceBrakeEfforts;
    }

    public void setServiceBrakeEfforts(List<BrakeEffort> serviceBrakeEfforts) {
        this.serviceBrakeEfforts = serviceBrakeEfforts;
    }

    public void addServiceBrakeEffort(BrakeEffort serviceBrakeEffort) {
        if (this.serviceBrakeEfforts == null) {
            this.serviceBrakeEfforts = new ArrayList<>();
        }
        this.serviceBrakeEfforts.add(serviceBrakeEffort);
    }

    public List<BrakeEffort> getParkingBrakeEfforts() {
        return parkingBrakeEfforts;
    }

    public void setParkingBrakeEfforts(List<BrakeEffort> parkingBrakeEfforts) {
        this.parkingBrakeEfforts = parkingBrakeEfforts;
    }

    public void addParkingBrakeEffort(BrakeEffort parkingBrakeEffort) {
        if (this.parkingBrakeEfforts == null) {
            this.parkingBrakeEfforts = new ArrayList<>();
        }
        this.parkingBrakeEfforts.add(parkingBrakeEffort);
    }

    public enum BrakeTestType {
        ROLLER,
        DECELEROMETER
    }

    public enum VehicleWeightType {
        MANUFACTURER,
        PRESENTED
    }

    public enum BrakeLineType {
        DUAL,
        SINGLE
    }
}