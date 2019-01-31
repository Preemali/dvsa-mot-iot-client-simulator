package uk.gov.dvsa.mot.iot.client.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.math.RoundingMode;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompressionTestResult {

    private TestType testType;

    /* Absorption coefficient */
    private BigDecimal opacityMaxLimit;

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
    private BigDecimal correctedValue;
    private EmissionsTestResult.TestResult testResult;

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public BigDecimal getOpacityMaxLimit() {
        return opacityMaxLimit;
    }

    public void setOpacityMaxLimit(BigDecimal opacityMaxLimit) {
        this.opacityMaxLimit = setScale(opacityMaxLimit);
    }

    public BigDecimal getFas1Value() {
        return fas1Value;
    }

    public void setFas1Value(BigDecimal fas1Value) {
        this.fas1Value = setScale(fas1Value);
    }

    public Integer getFas1RPM() {
        return fas1RPM;
    }

    public void setFas1RPM(Integer fas1RPM) {
        this.fas1RPM = fas1RPM;
    }

    public BigDecimal getFas2Value() {
        return fas2Value;
    }

    public void setFas2Value(BigDecimal fas2Value) {
        this.fas2Value = setScale(fas2Value);
    }

    public Integer getFas2RPM() {
        return fas2RPM;
    }

    public void setFas2RPM(Integer fas2RPM) {
        this.fas2RPM = fas2RPM;
    }

    public BigDecimal getFas3Value() {
        return fas3Value;
    }

    public void setFas3Value(BigDecimal fas3Value) {
        this.fas3Value = setScale(fas3Value);
    }

    public Integer getFas3RPM() {
        return fas3RPM;
    }

    public void setFas3RPM(Integer fas3RPM) {
        this.fas3RPM = fas3RPM;
    }

    public BigDecimal getFas4Value() {
        return fas4Value;
    }

    public void setFas4Value(BigDecimal fas4Value) {
        this.fas4Value = setScale(fas4Value);
    }

    public Integer getFas4RPM() {
        return fas4RPM;
    }

    public void setFas4RPM(Integer fas4RPM) {
        this.fas4RPM = fas4RPM;
    }

    public BigDecimal getFas5Value() {
        return fas5Value;
    }

    public void setFas5Value(BigDecimal fas5Value) {
        this.fas5Value = setScale(fas5Value);
    }

    public Integer getFas5RPM() {
        return fas5RPM;
    }

    public void setFas5RPM(Integer fas5RPM) {
        this.fas5RPM = fas5RPM;
    }

    public BigDecimal getFas6Value() {
        return fas6Value;
    }

    public void setFas6Value(BigDecimal fas6Value) {
        this.fas6Value = setScale(fas6Value);
    }

    public Integer getFas6RPM() {
        return fas6RPM;
    }

    public void setFas6RPM(Integer fas6RPM) {
        this.fas6RPM = fas6RPM;
    }

    public BigDecimal getMeanValue() {
        return meanValue;
    }

    public void setMeanValue(BigDecimal meanValue) {
        this.meanValue = setScale(meanValue);
    }

    public BigDecimal getZeroDrift() {
        return zeroDrift;
    }

    public void setZeroDrift(BigDecimal zeroDrift) {
        this.zeroDrift = setScale(zeroDrift);
    }

    public BigDecimal getCorrectedValue() {
        return correctedValue;
    }

    public void setCorrectedValue(BigDecimal correctedValue) {
        this.correctedValue = setScale(correctedValue);
    }

    public EmissionsTestResult.TestResult getTestResult() {
        return testResult;
    }

    public void setTestResult(EmissionsTestResult.TestResult testResult) {
        this.testResult = testResult;
    }

    private BigDecimal setScale(BigDecimal value){
        return value == null ? value : value.setScale(3, RoundingMode.DOWN);
    }

    public enum TestType{
        FAST_PASS,
        TURBO,
        NON_TURBO
    }
}
