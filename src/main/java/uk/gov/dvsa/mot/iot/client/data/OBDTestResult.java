package uk.gov.dvsa.mot.iot.client.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * On Board Diagnostic Test Results
 * see https://en.wikipedia.org/wiki/OBD-II_PIDs for definition of Parameter IDs
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OBDTestResult {
    /**
     * Vehicle odometer reading in miles
     */
    private String odometer;

    /**
     * Vehicle Identification Number
     */
    private String vin;

    /**
     * Is the MIL lamp illuminated?
     */
    private boolean milOn;

    /**
     * List of confirmed emissions-related DTCs
     */
    private List<String> dtcs;

    /**
     * Number of confirmed emissions-related DTCs available for display.
     */
    private int dtcCount;

    /**
     * SPARK = Spark ignition monitors supported (e.g. Otto or Wankel engines)
     * COMPRESSION = Compression ignition monitors supported (e.g. Diesel engines)
     */
    private IgnitionType ignitionType;

    /**
     * Continuous Monitor - Misfire
     */
    private MonitorStatus misfireMonitorStatus;

    /**
     * Continuous Monitor - Fuel System
     */
    private MonitorStatus fuelSystemMonitorStatus;

    /**
     * Continuous Monitor - Component
     */
    private MonitorStatus componentsMonitorStatus;

    /**
     * Periodic Spark Ignition Monitor - Catalyst (CAT)
     */
    private MonitorStatus catalystMonitorStatus;

    /**
     * Periodic Spark Ignition Monitor - Heated Catalyst
     */
    private MonitorStatus heatedCatalystMonitorStatus;

    /**
     * Periodic Spark Ignition Monitor - Evaporative (EVAP) System
     */
    private MonitorStatus evaporativeSystemMonitorStatus;

    /**
     * Periodic Spark Ignition Monitor - Secondary Air System
     */
    private MonitorStatus secondaryAirSystemMonitorStatus;

    /**
     * Periodic Spark Ignition Monitor - Oxygen (O2) Sensor
     */
    private MonitorStatus oxygenSensorMonitorStatus;

    /**
     * Periodic Spark Ignition Monitor - Oxygen Sensor Heater
     */
    private MonitorStatus oxygenSensorHeaterMonitorStatus;

    /**
     * Periodic Spark OR Compression Ignition Monitor - EGR (Exhaust Gas Recirculation) and/or VVT System
     */
    private MonitorStatus egrSystemMonitorStatus;

    /**
     * Periodic Compression Ignition Monitor - NMHC (Non-Methane HydroCarbons) Catalyst
     */
    private MonitorStatus nmhcCatalystMonitorStatus;

    /**
     * Periodic Compression Ignition Monitor - NOx/SCR Aftertreatment
     */
    private MonitorStatus noxScrAftertreatmentMonitorStatus;

    /**
     * Periodic Compression Ignition Monitor - Boost Pressure
     */
    private MonitorStatus boostPressureMonitorStatus;

    /**
     * Periodic Compression Ignition Monitor - Exhaust Gas Sensor
     */
    private MonitorStatus exhaustGasSensorMonitorStatus;

    /**
     * Periodic Compression Ignition Monitor - PM Filter
     */
    private MonitorStatus pmFilterMonitorStatus;

    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public IgnitionType getIgnitionType() {
        return ignitionType;
    }

    public void setIgnitionType(IgnitionType ignitionType) {
        this.ignitionType = ignitionType;
    }

    public MonitorStatus getMisfireMonitorStatus() {
        return misfireMonitorStatus;
    }

    public void setMisfireMonitorStatus(MonitorStatus misfireMonitorStatus) {
        this.misfireMonitorStatus = misfireMonitorStatus;
    }

    public MonitorStatus getFuelSystemMonitorStatus() {
        return fuelSystemMonitorStatus;
    }

    public void setFuelSystemMonitorStatus(MonitorStatus fuelSystemMonitorStatus) {
        this.fuelSystemMonitorStatus = fuelSystemMonitorStatus;
    }

    public MonitorStatus getComponentsMonitorStatus() {
        return componentsMonitorStatus;
    }

    public void setComponentsMonitorStatus(MonitorStatus componentsMonitorStatus) {
        this.componentsMonitorStatus = componentsMonitorStatus;
    }

    public MonitorStatus getCatalystMonitorStatus() {
        return catalystMonitorStatus;
    }

    public void setCatalystMonitorStatus(MonitorStatus catalystMonitorStatus) {
        this.catalystMonitorStatus = catalystMonitorStatus;
    }

    public MonitorStatus getHeatedCatalystMonitorStatus() {
        return heatedCatalystMonitorStatus;
    }

    public void setHeatedCatalystMonitorStatus(MonitorStatus heatedCatalystMonitorStatus) {
        this.heatedCatalystMonitorStatus = heatedCatalystMonitorStatus;
    }

    public MonitorStatus getEvaporativeSystemMonitorStatus() {
        return evaporativeSystemMonitorStatus;
    }

    public void setEvaporativeSystemMonitorStatus(MonitorStatus evaporativeSystemMonitorStatus) {
        this.evaporativeSystemMonitorStatus = evaporativeSystemMonitorStatus;
    }

    public MonitorStatus getSecondaryAirSystemMonitorStatus() {
        return secondaryAirSystemMonitorStatus;
    }

    public void setSecondaryAirSystemMonitorStatus(MonitorStatus secondaryAirSystemMonitorStatus) {
        this.secondaryAirSystemMonitorStatus = secondaryAirSystemMonitorStatus;
    }

    public MonitorStatus getOxygenSensorMonitorStatus() {
        return oxygenSensorMonitorStatus;
    }

    public void setOxygenSensorMonitorStatus(MonitorStatus oxygenSensorMonitorStatus) {
        this.oxygenSensorMonitorStatus = oxygenSensorMonitorStatus;
    }

    public MonitorStatus getOxygenSensorHeaterMonitorStatus() {
        return oxygenSensorHeaterMonitorStatus;
    }

    public void setOxygenSensorHeaterMonitorStatus(MonitorStatus oxygenSensorHeaterMonitorStatus) {
        this.oxygenSensorHeaterMonitorStatus = oxygenSensorHeaterMonitorStatus;
    }

    public MonitorStatus getEgrSystemMonitorStatus() {
        return egrSystemMonitorStatus;
    }

    public void setEgrSystemMonitorStatus(MonitorStatus egrSystemMonitorStatus) {
        this.egrSystemMonitorStatus = egrSystemMonitorStatus;
    }

    public MonitorStatus getNmhcCatalystMonitorStatus() {
        return nmhcCatalystMonitorStatus;
    }

    public void setNmhcCatalystMonitorStatus(MonitorStatus nmhcCatalystMonitorStatus) {
        this.nmhcCatalystMonitorStatus = nmhcCatalystMonitorStatus;
    }

    public MonitorStatus getNoxScrAftertreatmentMonitorStatus() {
        return noxScrAftertreatmentMonitorStatus;
    }

    public void setNoxScrAftertreatmentMonitorStatus(MonitorStatus noxScrAftertreatmentMonitorStatus) {
        this.noxScrAftertreatmentMonitorStatus = noxScrAftertreatmentMonitorStatus;
    }

    public MonitorStatus getBoostPressureMonitorStatus() {
        return boostPressureMonitorStatus;
    }

    public void setBoostPressureMonitorStatus(MonitorStatus boostPressureMonitorStatus) {
        this.boostPressureMonitorStatus = boostPressureMonitorStatus;
    }

    public MonitorStatus getExhaustGasSensorMonitorStatus() {
        return exhaustGasSensorMonitorStatus;
    }

    public void setExhaustGasSensorMonitorStatus(MonitorStatus exhaustGasSensorMonitorStatus) {
        this.exhaustGasSensorMonitorStatus = exhaustGasSensorMonitorStatus;
    }

    public MonitorStatus getPmFilterMonitorStatus() {
        return pmFilterMonitorStatus;
    }

    public void setPmFilterMonitorStatus(MonitorStatus pmFilterMonitorStatus) {
        this.pmFilterMonitorStatus = pmFilterMonitorStatus;
    }

    public boolean getMilOn() {
        return milOn;
    }

    public void setMilOn(boolean MILOn) {
        milOn = MILOn;
    }

    public int getDtcCount() {
        return dtcCount;
    }

    public void setDtcCount(int dtcCount) {
        this.dtcCount = dtcCount;
    }

    public List<String> getDtcs() {
        return dtcs;
    }

    public void setDtcs(List<String> dtcs) {
        this.dtcs = dtcs;
    }

    public enum MonitorStatus {
        OK,
        NOT_READY,
        NOT_AVAILABLE
    }

    public enum IgnitionType {
        SPARK,
        COMPRESSION
    }
}
