package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.CompressionTestResult;
import uk.gov.dvsa.mot.iot.client.data.EmissionsTestResult;

import java.math.BigDecimal;

public final class CompressionTestResultBuilder {
    private CompressionTestResult.TestType testType;
    /* Absorption coefficient */
    private BigDecimal testLimitApplied;
    private BigDecimal fas1Value;
    private Integer fas1RPM;
    private BigDecimal fas2Value;
    private Integer fas2RPM;
    private BigDecimal fas3Value;
    private Integer fas3RPM;
    private BigDecimal fas4Value;
    private Integer fas4RPM;
    private BigDecimal fas5Value;
    private Integer fas5RPM;
    private BigDecimal fas6Value;
    private Integer fas6RPM;
    private BigDecimal meanValue;
    private BigDecimal zeroDrift;
    /* meanValue - zeroDrift */
    private BigDecimal correctedMeanValue;

    private EmissionsTestResult.TestResult testResult;

    private CompressionTestResultBuilder() {
    }

    public static CompressionTestResultBuilder aCompressionTestResult() {
        return new CompressionTestResultBuilder();
    }

    public CompressionTestResultBuilder withTestType(CompressionTestResult.TestType testType) {
        this.testType = testType;
        return this;
    }

    public CompressionTestResultBuilder withTestLimitApplied(BigDecimal testLimitApplied) {
        this.testLimitApplied = testLimitApplied;
        return this;
    }

    public CompressionTestResultBuilder withFas1Value(BigDecimal fas1Value) {
        this.fas1Value = fas1Value;
        return this;
    }

    public CompressionTestResultBuilder withFas1RPM(Integer fas1RPM) {
        this.fas1RPM = fas1RPM;
        return this;
    }

    public CompressionTestResultBuilder withFas2Value(BigDecimal fas2Value) {
        this.fas2Value = fas2Value;
        return this;
    }

    public CompressionTestResultBuilder withFas2RPM(Integer fas2RPM) {
        this.fas2RPM = fas2RPM;
        return this;
    }

    public CompressionTestResultBuilder withFas3Value(BigDecimal fas3Value) {
        this.fas3Value = fas3Value;
        return this;
    }

    public CompressionTestResultBuilder withFas3RPM(Integer fas3RPM) {
        this.fas3RPM = fas3RPM;
        return this;
    }

    public CompressionTestResultBuilder withFas4Value(BigDecimal fas4Value) {
        this.fas4Value = fas4Value;
        return this;
    }

    public CompressionTestResultBuilder withFas4RPM(Integer fas4RPM) {
        this.fas4RPM = fas4RPM;
        return this;
    }

    public CompressionTestResultBuilder withFas5Value(BigDecimal fas5Value) {
        this.fas5Value = fas5Value;
        return this;
    }

    public CompressionTestResultBuilder withFas5RPM(Integer fas5RPM) {
        this.fas5RPM = fas5RPM;
        return this;
    }

    public CompressionTestResultBuilder withFas6Value(BigDecimal fas6Value) {
        this.fas6Value = fas6Value;
        return this;
    }

    public CompressionTestResultBuilder withFas6RPM(Integer fas6RPM) {
        this.fas6RPM = fas6RPM;
        return this;
    }

    public CompressionTestResultBuilder withMeanValue(BigDecimal meanValue) {
        this.meanValue = meanValue;
        return this;
    }

    public CompressionTestResultBuilder withZeroDrift(BigDecimal zeroDrift) {
        this.zeroDrift = zeroDrift;
        return this;
    }

    public CompressionTestResultBuilder withCorrectedMeanValue(BigDecimal correctedMeanValue) {
        this.correctedMeanValue = correctedMeanValue;
        return this;
    }

    public CompressionTestResultBuilder withTestResult(EmissionsTestResult.TestResult testResult){
        this.testResult = testResult;
        return this;
    }

    public CompressionTestResult build() {
        CompressionTestResult compressionTestResult = new CompressionTestResult();
        compressionTestResult.setTestType(testType);
        compressionTestResult.setOpacityMaxLimit(testLimitApplied);
        compressionTestResult.setFas1Value(fas1Value);
        compressionTestResult.setFas1RPM(fas1RPM);
        compressionTestResult.setFas2Value(fas2Value);
        compressionTestResult.setFas2RPM(fas2RPM);
        compressionTestResult.setFas3Value(fas3Value);
        compressionTestResult.setFas3RPM(fas3RPM);
        compressionTestResult.setFas4Value(fas4Value);
        compressionTestResult.setFas4RPM(fas4RPM);
        compressionTestResult.setFas5Value(fas5Value);
        compressionTestResult.setFas5RPM(fas5RPM);
        compressionTestResult.setFas6Value(fas6Value);
        compressionTestResult.setFas6RPM(fas6RPM);
        compressionTestResult.setMeanValue(meanValue);
        compressionTestResult.setZeroDrift(zeroDrift);
        compressionTestResult.setCorrectedValue(correctedMeanValue);
        compressionTestResult.setTestResult(testResult);
        return compressionTestResult;
    }
}
