package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.EmissionsTestResult;

import java.math.BigDecimal;

public final class EmissionsTestResultBuilder {
    private EmissionsTestResult.FuelType fuelType;
    private Integer engineOilTemperature;
    private Boolean visibleSmoke;
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

    private EmissionsTestResultBuilder() {
    }

    public static EmissionsTestResultBuilder anEmissionsTestResult() {
        return new EmissionsTestResultBuilder();
    }

    public EmissionsTestResultBuilder withFuelType(EmissionsTestResult.FuelType fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public EmissionsTestResultBuilder withEngineOilTemperature(Integer engineOilTemperature) {
        this.engineOilTemperature = engineOilTemperature;
        return this;
    }

    public EmissionsTestResultBuilder withVisibleSmoke(Boolean visibleSmoke) {
        this.visibleSmoke = visibleSmoke;
        return this;
    }

    public EmissionsTestResultBuilder withCatalyst(Boolean catalyst) {
        this.catalyst = catalyst;
        return this;
    }

    public EmissionsTestResultBuilder withIdleRPM(Integer idleRPM) {
        this.idleRPM = idleRPM;
        return this;
    }

    public EmissionsTestResultBuilder withIdleCO(BigDecimal idleCO) {
        this.idleCO = idleCO;
        return this;
    }

    public EmissionsTestResultBuilder withFastIdleRPM(Integer fastIdleRPM) {
        this.fastIdleRPM = fastIdleRPM;
        return this;
    }

    public EmissionsTestResultBuilder withFastIdleCO(BigDecimal fastIdleCO) {
        this.fastIdleCO = fastIdleCO;
        return this;
    }

    public EmissionsTestResultBuilder withFastIdleHC(Integer fastIdleHC) {
        this.fastIdleHC = fastIdleHC;
        return this;
    }

    public EmissionsTestResultBuilder withFastIdleLambda(BigDecimal fastIdleLambda) {
        this.fastIdleLambda = fastIdleLambda;
        return this;
    }

    public EmissionsTestResultBuilder withTurbo(Boolean turbo) {
        this.turbo = turbo;
        return this;
    }

    public EmissionsTestResultBuilder withOpacity(BigDecimal opacity) {
        this.opacity = opacity;
        return this;
    }

    public EmissionsTestResult build() {
        EmissionsTestResult emissionsTestResult = new EmissionsTestResult();
        emissionsTestResult.setFuelType(fuelType);
        emissionsTestResult.setEngineOilTemperature(engineOilTemperature);
        emissionsTestResult.setVisibleSmoke(visibleSmoke);
        emissionsTestResult.setCatalyst(catalyst);
        emissionsTestResult.setIdleRPM(idleRPM);
        emissionsTestResult.setIdleCO(idleCO);
        emissionsTestResult.setFastIdleRPM(fastIdleRPM);
        emissionsTestResult.setFastIdleCO(fastIdleCO);
        emissionsTestResult.setFastIdleHC(fastIdleHC);
        emissionsTestResult.setFastIdleLambda(fastIdleLambda);
        emissionsTestResult.setTurbo(turbo);
        emissionsTestResult.setOpacity(opacity);
        return emissionsTestResult;
    }
}
