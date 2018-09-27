package uk.gov.dvsa.mot.iot.client.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmissionsTestResult {

    private FuelType fuelType;

    private Integer engineOilTemperature;
    private Boolean visibleSmoke;           //TODO Can this be entered before or during test?

    /* Petrol & LPG */
    private Boolean catalyst;
    private Integer idleRPM;
    private BigDecimal idleCO;

    private Integer fastIdleRPM;
    private BigDecimal fastIdleCO;
    private Integer fastIdleHC;
    private BigDecimal fastIdleLambda;

    /* Diesel */
    private Boolean turbo;
    private BigDecimal opacity;

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getEngineOilTemperature() {
        return engineOilTemperature;
    }

    public void setEngineOilTemperature(Integer engineOilTemperature) {
        this.engineOilTemperature = engineOilTemperature;
    }

    public Boolean getVisibleSmoke() {
        return visibleSmoke;
    }

    public void setVisibleSmoke(Boolean visibleSmoke) {
        this.visibleSmoke = visibleSmoke;
    }

    public Boolean getCatalyst() {
        return catalyst;
    }

    public void setCatalyst(Boolean catalyst) {
        this.catalyst = catalyst;
    }

    public Integer getIdleRPM() {
        return idleRPM;
    }

    public void setIdleRPM(Integer idleRPM) {
        this.idleRPM = idleRPM;
    }

    public BigDecimal getIdleCO() {
        return idleCO;
    }

    public void setIdleCO(BigDecimal idleCO) {
        this.idleCO = idleCO;
    }

    public Integer getFastIdleRPM() {
        return fastIdleRPM;
    }

    public void setFastIdleRPM(Integer fastIdleRPM) {
        this.fastIdleRPM = fastIdleRPM;
    }

    public BigDecimal getFastIdleCO() {
        return fastIdleCO;
    }

    public void setFastIdleCO(BigDecimal fastIdleCO) {
        this.fastIdleCO = fastIdleCO;
    }

    public Integer getFastIdleHC() {
        return fastIdleHC;
    }

    public void setFastIdleHC(Integer fastIdleHC) {
        this.fastIdleHC = fastIdleHC;
    }

    public BigDecimal getFastIdleLambda() {
        return fastIdleLambda;
    }

    public void setFastIdleLambda(BigDecimal fastIdleLambda) {
        this.fastIdleLambda = fastIdleLambda;
    }

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }

    public BigDecimal getOpacity() {
        return opacity;
    }

    public void setOpacity(BigDecimal opacity) {
        this.opacity = opacity;
    }

    public enum FuelType{
        PETROL,
        DIESEL,
        LPG
    }
}
