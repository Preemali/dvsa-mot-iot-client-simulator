package uk.gov.dvsa.mot.iot.client.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import static uk.gov.dvsa.mot.iot.client.data.EmissionsTestResult.TestResult;

import java.math.BigDecimal;
import java.math.RoundingMode;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SparkTestResult {

    private TestType testType;

    /* Fast Idle */
    /* RPM - 1/min */
    private Integer fastIdleMinRPMLimit;
    private Integer fastIdleMaxRPMLimit;
    private Integer fastIdleRPMValue;
    private TestResult fastIdleRPMTestResult;
    /* CO - % vol*/
    private BigDecimal fastIdleMaxCOLimit;
    private BigDecimal fastIdleCOValue;
    private TestResult fastIdleCOTestResult;
    /* HC - ppm vol*/
    private Integer fastIdleMaxHCLimit;
    private Integer fastIdleHCValue;
    private TestResult fastIdleHCTestResult;
    /* Lambda  */
    private BigDecimal fastIdleMinLambdaLimit;
    private BigDecimal fastIdleMaxLambdaLimit;
    private BigDecimal fastIdleLambdaValue;
    private TestResult fastIdleLambdaTestResult;

    /* Second Fast Idle */
    /* RPM - 1/min */
    private Integer secondFastIdleMinRPMLimit;
    private Integer secondFastIdleMaxRPMLimit;
    private Integer secondFastIdleRPMValue;
    private TestResult secondFastIdleRPMTestResult;
    /* CO - % vol*/
    private BigDecimal secondFastIdleMaxCOLimit;
    private BigDecimal secondFastIdleCOValue;
    private TestResult secondFastIdleCOTestResult;
    /* HC - ppm vol*/
    private Integer secondFastIdleMaxHCLimit;
    private Integer secondFastIdleHCValue;
    private TestResult secondFastIdleHCTestResult;
    /* Lambda  */
    private BigDecimal secondFastIdleMinLambdaLimit;
    private BigDecimal secondFastIdleMaxLambdaLimit;
    private BigDecimal secondFastIdleLambdaValue;
    private TestResult secondFastIdleLambdaTestResult;

    /* Natural Idle */
    /* RPM - 1/min */
    private Integer naturalIdleMinRPMLimit;
    private Integer naturalIdleMaxRPMLimit;
    private Integer naturalIdleRPMValue;
    private TestResult naturalIdleRPMTestResult;
    /* CO - % vol*/
    private BigDecimal naturalIdleMaxCOLimit;
    private BigDecimal naturalIdleCOValue;
    private TestResult naturalIdleCOTestResult;
    /* HC - ppm vol*/
    private Integer naturalIdleMaxHCLimit;
    private Integer naturalIdleHCValue;
    private EmissionsTestResult.TestResult naturalIdleHCTestResult;

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public Integer getFastIdleMinRPMLimit() {
        return fastIdleMinRPMLimit;
    }

    public void setFastIdleMinRPMLimit(Integer fastIdleMinRPMLimit) {
        this.fastIdleMinRPMLimit = fastIdleMinRPMLimit;
    }

    public Integer getFastIdleMaxRPMLimit() {
        return fastIdleMaxRPMLimit;
    }

    public void setFastIdleMaxRPMLimit(Integer fastIdleMaxRPMLimit) {
        this.fastIdleMaxRPMLimit = fastIdleMaxRPMLimit;
    }

    public Integer getFastIdleRPMValue() {
        return fastIdleRPMValue;
    }

    public void setFastIdleRPMValue(Integer fastIdleRPMValue) {
        this.fastIdleRPMValue = fastIdleRPMValue;
    }

    public TestResult getFastIdleRPMTestResult() {
        return fastIdleRPMTestResult;
    }

    public void setFastIdleRPMTestResult(TestResult fastIdleRPMTestResult) {
        this.fastIdleRPMTestResult = fastIdleRPMTestResult;
    }

    public BigDecimal getFastIdleMaxCOLimit() {
        return fastIdleMaxCOLimit;
    }

    public void setFastIdleMaxCOLimit(BigDecimal fastIdleMaxCOLimit) {
        this.fastIdleMaxCOLimit = setScale(fastIdleMaxCOLimit);
    }

    public BigDecimal getFastIdleCOValue() {
        return fastIdleCOValue;
    }

    public void setFastIdleCOValue(BigDecimal fastIdleCOValue) {
        this.fastIdleCOValue = setScale(fastIdleCOValue);
    }

    public TestResult getFastIdleCOTestResult() {
        return fastIdleCOTestResult;
    }

    public void setFastIdleCOTestResult(TestResult fastIdleCOTestResult) {
        this.fastIdleCOTestResult = fastIdleCOTestResult;
    }

    public Integer getFastIdleMaxHCLimit() {
        return fastIdleMaxHCLimit;
    }

    public void setFastIdleMaxHCLimit(Integer fastIdleMaxHCLimit) {
        this.fastIdleMaxHCLimit = fastIdleMaxHCLimit;
    }

    public Integer getFastIdleHCValue() {
        return fastIdleHCValue;
    }

    public void setFastIdleHCValue(Integer fastIdleHCValue) {
        this.fastIdleHCValue = fastIdleHCValue;
    }

    public TestResult getFastIdleHCTestResult() {
        return fastIdleHCTestResult;
    }

    public void setFastIdleHCTestResult(TestResult fastIdleHCTestResult) {
        this.fastIdleHCTestResult = fastIdleHCTestResult;
    }

    public BigDecimal getFastIdleMinLambdaLimit() {
        return fastIdleMinLambdaLimit;
    }

    public void setFastIdleMinLambdaLimit(BigDecimal fastIdleMinLambdaLimit) {
        this.fastIdleMinLambdaLimit = setScale(fastIdleMinLambdaLimit);
    }

    public BigDecimal getFastIdleMaxLambdaLimit() {
        return fastIdleMaxLambdaLimit;
    }

    public void setFastIdleMaxLambdaLimit(BigDecimal fastIdleMaxLambdaLimit) {
        this.fastIdleMaxLambdaLimit = setScale(fastIdleMaxLambdaLimit);
    }

    public BigDecimal getFastIdleLambdaValue() {
        return fastIdleLambdaValue;
    }

    public void setFastIdleLambdaValue(BigDecimal fastIdleLambdaValue) {
        this.fastIdleLambdaValue = setScale(fastIdleLambdaValue);
    }

    public TestResult getFastIdleLambdaTestResult() {
        return fastIdleLambdaTestResult;
    }

    public void setFastIdleLambdaTestResult(TestResult fastIdleLambdaTestResult) {
        this.fastIdleLambdaTestResult = fastIdleLambdaTestResult;
    }

    public Integer getSecondFastIdleMinRPMLimit() {
        return secondFastIdleMinRPMLimit;
    }

    public void setSecondFastIdleMinRPMLimit(Integer secondFastIdleMinRPMLimit) {
        this.secondFastIdleMinRPMLimit = secondFastIdleMinRPMLimit;
    }

    public Integer getSecondFastIdleMaxRPMLimit() {
        return secondFastIdleMaxRPMLimit;
    }

    public void setSecondFastIdleMaxRPMLimit(Integer secondFastIdleMaxRPMLimit) {
        this.secondFastIdleMaxRPMLimit = secondFastIdleMaxRPMLimit;
    }

    public Integer getSecondFastIdleRPMValue() {
        return secondFastIdleRPMValue;
    }

    public void setSecondFastIdleRPMValue(Integer secondFastIdleRPMValue) {
        this.secondFastIdleRPMValue = secondFastIdleRPMValue;
    }

    public TestResult getSecondFastIdleRPMTestResult() {
        return secondFastIdleRPMTestResult;
    }

    public void setSecondFastIdleRPMTestResult(TestResult secondFastIdleRPMTestResult) {
        this.secondFastIdleRPMTestResult = secondFastIdleRPMTestResult;
    }

    public BigDecimal getSecondFastIdleMaxCOLimit() {
        return secondFastIdleMaxCOLimit;
    }

    public void setSecondFastIdleMaxCOLimit(BigDecimal secondFastIdleMaxCOLimit) {
        this.secondFastIdleMaxCOLimit = setScale(secondFastIdleMaxCOLimit);
    }

    public BigDecimal getSecondFastIdleCOValue() {
        return secondFastIdleCOValue;
    }

    public void setSecondFastIdleCOValue(BigDecimal secondFastIdleCOValue) {
        this.secondFastIdleCOValue = setScale(secondFastIdleCOValue);
    }

    public TestResult getSecondFastIdleCOTestResult() {
        return secondFastIdleCOTestResult;
    }

    public void setSecondFastIdleCOTestResult(TestResult secondFastIdleCOTestResult) {
        this.secondFastIdleCOTestResult = secondFastIdleCOTestResult;
    }

    public Integer getSecondFastIdleMaxHCLimit() {
        return secondFastIdleMaxHCLimit;
    }

    public void setSecondFastIdleMaxHCLimit(Integer secondFastIdleMaxHCLimit) {
        this.secondFastIdleMaxHCLimit = secondFastIdleMaxHCLimit;
    }

    public Integer getSecondFastIdleHCValue() {
        return secondFastIdleHCValue;
    }

    public void setSecondFastIdleHCValue(Integer secondFastIdleHCValue) {
        this.secondFastIdleHCValue = secondFastIdleHCValue;
    }

    public TestResult getSecondFastIdleHCTestResult() {
        return secondFastIdleHCTestResult;
    }

    public void setSecondFastIdleHCTestResult(TestResult secondFastIdleHCTestResult) {
        this.secondFastIdleHCTestResult = secondFastIdleHCTestResult;
    }

    public BigDecimal getSecondFastIdleMinLambdaLimit() {
        return secondFastIdleMinLambdaLimit;
    }

    public void setSecondFastIdleMinLambdaLimit(BigDecimal secondFastIdleMinLambdaLimit) {
        this.secondFastIdleMinLambdaLimit = setScale(secondFastIdleMinLambdaLimit);
    }

    public BigDecimal getSecondFastIdleMaxLambdaLimit() {
        return secondFastIdleMaxLambdaLimit;
    }

    public void setSecondFastIdleMaxLambdaLimit(BigDecimal secondFastIdleMaxLambdaLimit) {
        this.secondFastIdleMaxLambdaLimit = setScale(secondFastIdleMaxLambdaLimit);
    }

    public BigDecimal getSecondFastIdleLambdaValue() {
        return secondFastIdleLambdaValue;
    }

    public void setSecondFastIdleLambdaValue(BigDecimal secondFastIdleLambdaValue) {
        this.secondFastIdleLambdaValue = setScale(secondFastIdleLambdaValue);
    }

    public TestResult getSecondFastIdleLambdaTestResult() {
        return secondFastIdleLambdaTestResult;
    }

    public void setSecondFastIdleLambdaTestResult(TestResult secondFastIdleLambdaTestResult) {
        this.secondFastIdleLambdaTestResult = secondFastIdleLambdaTestResult;
    }

    public Integer getNaturalIdleMinRPMLimit() {
        return naturalIdleMinRPMLimit;
    }

    public void setNaturalIdleMinRPMLimit(Integer naturalIdleMinRPMLimit) {
        this.naturalIdleMinRPMLimit = naturalIdleMinRPMLimit;
    }

    public Integer getNaturalIdleMaxRPMLimit() {
        return naturalIdleMaxRPMLimit;
    }

    public void setNaturalIdleMaxRPMLimit(Integer naturalIdleMaxRPMLimit) {
        this.naturalIdleMaxRPMLimit = naturalIdleMaxRPMLimit;
    }

    public Integer getNaturalIdleRPMValue() {
        return naturalIdleRPMValue;
    }

    public void setNaturalIdleRPMValue(Integer naturalIdleRPMValue) {
        this.naturalIdleRPMValue = naturalIdleRPMValue;
    }

    public TestResult getNaturalIdleRPMTestResult() {
        return naturalIdleRPMTestResult;
    }

    public void setNaturalIdleRPMTestResult(TestResult naturalIdleRPMTestResult) {
        this.naturalIdleRPMTestResult = naturalIdleRPMTestResult;
    }

    public BigDecimal getNaturalIdleMaxCOLimit() {
        return naturalIdleMaxCOLimit;
    }

    public void setNaturalIdleMaxCOLimit(BigDecimal naturalIdleMaxCOLimit) {
        this.naturalIdleMaxCOLimit = setScale(naturalIdleMaxCOLimit);
    }

    public BigDecimal getNaturalIdleCOValue() {
        return naturalIdleCOValue;
    }

    public void setNaturalIdleCOValue(BigDecimal naturalIdleCOValue) {
        this.naturalIdleCOValue = setScale(naturalIdleCOValue);
    }

    public TestResult getNaturalIdleCOTestResult() {
        return naturalIdleCOTestResult;
    }

    public void setNaturalIdleCOTestResult(TestResult naturalIdleCOTestResult) {
        this.naturalIdleCOTestResult = naturalIdleCOTestResult;
    }

    public Integer getNaturalIdleMaxHCLimit() {
        return naturalIdleMaxHCLimit;
    }

    public void setNaturalIdleMaxHCLimit(Integer naturalIdleMaxHCLimit) {
        this.naturalIdleMaxHCLimit = naturalIdleMaxHCLimit;
    }

    public Integer getNaturalIdleHCValue() {
        return naturalIdleHCValue;
    }

    public void setNaturalIdleHCValue(Integer naturalIdleHCValue) {
        this.naturalIdleHCValue = naturalIdleHCValue;
    }

    public TestResult getNaturalIdleHCTestResult() {
        return naturalIdleHCTestResult;
    }

    public void setNaturalIdleHCTestResult(TestResult naturalIdleHCTestResult) {
        this.naturalIdleHCTestResult = naturalIdleHCTestResult;
    }

    private BigDecimal setScale(BigDecimal value){
        return value == null ? value : value.setScale(3, RoundingMode.DOWN);
    }

    public enum TestType{
        BET, /* Basic Emissions Test */
        CAT, /* Catalyst Test */
        NON_CAT /* Non Catalyst Test */
    }
}
