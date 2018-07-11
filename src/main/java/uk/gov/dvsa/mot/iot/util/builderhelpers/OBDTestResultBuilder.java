package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.OBDTestResult;

import java.util.List;

public final class OBDTestResultBuilder {
    private OBDTestResult.IgnitionType ignitionType;
    private OBDTestResult.MonitorStatus misfireMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus fuelSystemMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus componentsMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus catalystMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus heatedCatalystMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus evaporativeSystemMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus secondaryAirSystemMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus oxygenSensorMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus oxygenSensorHeaterMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus egrSystemMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus nmhcCatalystMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus noxScrAftertreatmentMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus boostPressureMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus exhaustGasSensorMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private OBDTestResult.MonitorStatus pmFilterMonitorStatus = OBDTestResult.MonitorStatus.NOT_AVAILABLE;
    private int dtcCount;
    private List<String> dtcs;
    private boolean isMilOn;
    private String vin;

    private OBDTestResultBuilder() {
    }

    public static OBDTestResultBuilder anOBDTestResult() {
        return new OBDTestResultBuilder();
    }

    public OBDTestResultBuilder withVin(String vin){
        this.vin = vin;
        return this;
    }

    public OBDTestResultBuilder withIsMilOn(boolean isMilOn){
        this.isMilOn = isMilOn;
        return this;
    }

    public OBDTestResultBuilder withIgnitionType(OBDTestResult.IgnitionType ignitionType) {
        this.ignitionType = ignitionType;
        return this;
    }

    public OBDTestResultBuilder withMisfireMonitorStatus(OBDTestResult.MonitorStatus misfireMonitorStatus) {
        this.misfireMonitorStatus = misfireMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withFuelSystemMonitorStatus(OBDTestResult.MonitorStatus fuelSystemMonitorStatus) {
        this.fuelSystemMonitorStatus = fuelSystemMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withComponentsMonitorStatus(OBDTestResult.MonitorStatus componentsMonitorStatus) {
        this.componentsMonitorStatus = componentsMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withCatalystMonitorStatus(OBDTestResult.MonitorStatus catalystMonitorStatus) {
        this.catalystMonitorStatus = catalystMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withHeatedCatalystMonitorStatus(OBDTestResult.MonitorStatus heatedCatalystMonitorStatus) {
        this.heatedCatalystMonitorStatus = heatedCatalystMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withEvaporativeSystemMonitorStatus(OBDTestResult.MonitorStatus evaporativeSystemMonitorStatus) {
        this.evaporativeSystemMonitorStatus = evaporativeSystemMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withSecondaryAirSystemMonitorStatus(OBDTestResult.MonitorStatus secondaryAirSystemMonitorStatus) {
        this.secondaryAirSystemMonitorStatus = secondaryAirSystemMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withOxygenSensorMonitorStatus(OBDTestResult.MonitorStatus oxygenSensorMonitorStatus) {
        this.oxygenSensorMonitorStatus = oxygenSensorMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withOxygenSensorHeaterMonitorStatus(OBDTestResult.MonitorStatus oxygenSensorHeaterMonitorStatus) {
        this.oxygenSensorHeaterMonitorStatus = oxygenSensorHeaterMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withEgrSystemMonitorStatus(OBDTestResult.MonitorStatus egrSystemMonitorStatus) {
        this.egrSystemMonitorStatus = egrSystemMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withNmhcCatalystMonitorStatus(OBDTestResult.MonitorStatus nmhcCatalystMonitorStatus) {
        this.nmhcCatalystMonitorStatus = nmhcCatalystMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withNoxScrAftertreatmentMonitorStatus(OBDTestResult.MonitorStatus noxScrAftertreatmentMonitorStatus) {
        this.noxScrAftertreatmentMonitorStatus = noxScrAftertreatmentMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withBoostPressureMonitorStatus(OBDTestResult.MonitorStatus boostPressureMonitorStatus) {
        this.boostPressureMonitorStatus = boostPressureMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withExhaustGasSensorMonitorStatus(OBDTestResult.MonitorStatus exhaustGasSensorMonitorStatus) {
        this.exhaustGasSensorMonitorStatus = exhaustGasSensorMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withPmFilterMonitorStatus(OBDTestResult.MonitorStatus pmFilterMonitorStatus) {
        this.pmFilterMonitorStatus = pmFilterMonitorStatus;
        return this;
    }

    public OBDTestResultBuilder withDtcCount(int dtcCount) {
        this.dtcCount = dtcCount;
        return this;
    }

    public OBDTestResultBuilder withDtcs(List<String> dtcs) {
        this.dtcs = dtcs;
        return this;
    }

    public OBDTestResult build() {
        OBDTestResult oBDTestResult = new OBDTestResult();
        oBDTestResult.setIgnitionType(ignitionType);
        oBDTestResult.setMisfireMonitorStatus(misfireMonitorStatus);
        oBDTestResult.setFuelSystemMonitorStatus(fuelSystemMonitorStatus);
        oBDTestResult.setComponentsMonitorStatus(componentsMonitorStatus);
        oBDTestResult.setCatalystMonitorStatus(catalystMonitorStatus);
        oBDTestResult.setHeatedCatalystMonitorStatus(heatedCatalystMonitorStatus);
        oBDTestResult.setEvaporativeSystemMonitorStatus(evaporativeSystemMonitorStatus);
        oBDTestResult.setSecondaryAirSystemMonitorStatus(secondaryAirSystemMonitorStatus);
        oBDTestResult.setOxygenSensorMonitorStatus(oxygenSensorMonitorStatus);
        oBDTestResult.setOxygenSensorHeaterMonitorStatus(oxygenSensorHeaterMonitorStatus);
        oBDTestResult.setEgrSystemMonitorStatus(egrSystemMonitorStatus);
        oBDTestResult.setNmhcCatalystMonitorStatus(nmhcCatalystMonitorStatus);
        oBDTestResult.setNoxScrAftertreatmentMonitorStatus(noxScrAftertreatmentMonitorStatus);
        oBDTestResult.setBoostPressureMonitorStatus(boostPressureMonitorStatus);
        oBDTestResult.setExhaustGasSensorMonitorStatus(exhaustGasSensorMonitorStatus);
        oBDTestResult.setPmFilterMonitorStatus(pmFilterMonitorStatus);
        oBDTestResult.setDtcCount(dtcCount);
        oBDTestResult.setDtcs(dtcs);
        oBDTestResult.setMilOn(isMilOn);
        oBDTestResult.setVin(vin);
        return oBDTestResult;
    }
}
