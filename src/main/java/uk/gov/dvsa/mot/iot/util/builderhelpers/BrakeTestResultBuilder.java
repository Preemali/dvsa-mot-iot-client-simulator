package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.BrakeEffort;
import uk.gov.dvsa.mot.iot.client.data.BrakeTestResult;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public final class BrakeTestResultBuilder {
    private BrakeTestResult.BrakeTestType serviceBrakeTestType;
    private BrakeTestResult.BrakeTestType parkingBrakeTestType;
    private BrakeTestResult.VehicleWeightType vehicleWeightType;
    private Integer vehicleWeightKg;
    private List<BrakeEffort> serviceBrakeEfforts;
    private List<BrakeEffort> parkingBrakeEfforts;

    private BrakeTestResultBuilder() {
    }

    public static BrakeTestResultBuilder aBrakeTestResult() {
        return new BrakeTestResultBuilder();
    }

    public BrakeTestResultBuilder withServiceBrakeTestType(BrakeTestResult.BrakeTestType serviceBrakeTestType) {
        this.serviceBrakeTestType = serviceBrakeTestType;
        return this;
    }

    public BrakeTestResultBuilder withParkingBrakeTestType(BrakeTestResult.BrakeTestType parkingBrakeTestType) {
        this.parkingBrakeTestType = parkingBrakeTestType;
        return this;
    }

    public BrakeTestResultBuilder withVehicleWeightType(BrakeTestResult.VehicleWeightType vehicleWeightType) {
        this.vehicleWeightType = vehicleWeightType;
        return this;
    }

    public BrakeTestResultBuilder withVehicleWeightKg(Integer vehicleWeightKg) {
        this.vehicleWeightKg = vehicleWeightKg;
        return this;
    }

    public BrakeTestResultBuilder withServiceBrakeEfforts(BrakeEffort serviceBrakeEffort) {
        if(isNull(this.serviceBrakeEfforts)){
            this.serviceBrakeEfforts = new ArrayList<>(2);
        }
        this.serviceBrakeEfforts.add(serviceBrakeEffort);
        return this;
    }

    public BrakeTestResultBuilder withParkingBrakeEfforts(BrakeEffort parkingBrakeEffort) {
        if(isNull(this.parkingBrakeEfforts)){
            this.parkingBrakeEfforts = new ArrayList<>(1);
        }
        this.parkingBrakeEfforts.add(parkingBrakeEffort);
        return this;
    }

    public BrakeTestResult build() {
        BrakeTestResult brakeTestResult = new BrakeTestResult();
        brakeTestResult.setServiceBrakeTestType(serviceBrakeTestType);
        brakeTestResult.setParkingBrakeTestType(parkingBrakeTestType);
        brakeTestResult.setVehicleWeightType(vehicleWeightType);
        brakeTestResult.setVehicleWeightKg(vehicleWeightKg);
        brakeTestResult.setServiceBrakeEfforts(serviceBrakeEfforts);
        brakeTestResult.setParkingBrakeEfforts(parkingBrakeEfforts);
        return brakeTestResult;
    }
}
