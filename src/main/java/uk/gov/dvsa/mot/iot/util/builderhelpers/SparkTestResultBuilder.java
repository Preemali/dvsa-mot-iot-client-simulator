package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.EmissionsTestResult;
import uk.gov.dvsa.mot.iot.client.data.SparkTestResult;

import java.math.BigDecimal;

public final class SparkTestResultBuilder {
    private SparkTestResult.TestType testType;
    /* Fast Idle */
    /* RPM - 1/min */
    private Integer fastIdleMinRPMLimit;
    private Integer fastIdleMaxRPMLimit;
    private Integer fastIdleRPMValue;
    private EmissionsTestResult.TestResult fastIdleRPMTestResult;
    /* CO - % vol*/
    private BigDecimal fastIdleMaxCOLimit;
    private BigDecimal fastIdleCOValue;
    private EmissionsTestResult.TestResult fastIdleCOTestResult;
    /* HC - ppm vol*/
    private Integer fastIdleMaxHCLimit;
    private Integer fastIdleHCValue;
    private EmissionsTestResult.TestResult fastIdleHCTestResult;
    /* Lambda  */
    private BigDecimal fastIdleMinLambdaLimit;
    private BigDecimal fastIdleMaxLambdaLimit;
    private BigDecimal fastIdleLambdaValue;
    private EmissionsTestResult.TestResult fastIdleLambdaTestResult;
    /* Second Fast Idle */
    /* RPM - 1/min */
    private Integer secondFastIdleMinRPMLimit;
    private Integer secondFastIdleMaxRPMLimit;
    private Integer secondFastIdleRPMValue;
    private EmissionsTestResult.TestResult secondFastIdleRPMTestResult;
    /* CO - % vol*/
    private BigDecimal secondFastIdleMaxCOLimit;
    private BigDecimal secondFastIdleCOValue;
    private EmissionsTestResult.TestResult secondFastIdleCOTestResult;
    /* HC - ppm vol*/
    private Integer secondFastIdleMaxHCLimit;
    private Integer secondFastIdleHCValue;
    private EmissionsTestResult.TestResult secondFastIdleHCTestResult;
    /* Lambda  */
    private BigDecimal secondFastIdleMinLanbdaLimit;
    private BigDecimal secondFastIdleMaxLanbdaLimit;
    private BigDecimal secondFastIdleLambdaValue;
    private EmissionsTestResult.TestResult secondFastIdleLambdaTestResult;
    /* Natural Idle */
    /* RPM - 1/min */
    private Integer naturalIdleMinRPMLimit;
    private Integer naturalIdleMaxRPMLimit;
    private Integer naturalIdleRPMValue;
    private EmissionsTestResult.TestResult naturalIdleRPMTestResult;
    /* CO - % vol*/
    private BigDecimal naturalIdleMaxCOLimit;
    private BigDecimal naturalIdleCOValue;
    private EmissionsTestResult.TestResult naturalIdleCOTestResult;
    /* HC - ppm vol*/
    private Integer naturalIdleMaxHCLimit;
    private Integer naturalIdleHCValue;
    private EmissionsTestResult.TestResult naturalIdleHCTestResult;

    private SparkTestResultBuilder() {
    }

    public static SparkTestResultBuilder aSparkTestResult() {
        return new SparkTestResultBuilder();
    }

    public SparkTestResultBuilder withTestType(SparkTestResult.TestType testType) {
        this.testType = testType;
        return this;
    }

    public SparkTestResultBuilder withFastIdleMinRPMLimit(Integer fastIdleMinRPMLimit) {
        this.fastIdleMinRPMLimit = fastIdleMinRPMLimit;
        return this;
    }

    public SparkTestResultBuilder withFastIdleMaxRPMLimit(Integer fastIdleMaxRPMLimit) {
        this.fastIdleMaxRPMLimit = fastIdleMaxRPMLimit;
        return this;
    }

    public SparkTestResultBuilder withFastIdleRPMValue(Integer fastIdleRPMValue) {
        this.fastIdleRPMValue = fastIdleRPMValue;
        return this;
    }

    public SparkTestResultBuilder withFastIdleRPMTestResult(EmissionsTestResult.TestResult fastIdleRPMTestResult) {
        this.fastIdleRPMTestResult = fastIdleRPMTestResult;
        return this;
    }

    public SparkTestResultBuilder withFastIdleMaxCOLimit(BigDecimal fastIdleMaxCOLimit) {
        this.fastIdleMaxCOLimit = fastIdleMaxCOLimit;
        return this;
    }

    public SparkTestResultBuilder withFastIdleCOValue(BigDecimal fastIdleCOValue) {
        this.fastIdleCOValue = fastIdleCOValue;
        return this;
    }

    public SparkTestResultBuilder withFastIdleCOTestResult(EmissionsTestResult.TestResult fastIdleCOTestResult) {
        this.fastIdleCOTestResult = fastIdleCOTestResult;
        return this;
    }

    public SparkTestResultBuilder withFastIdleMaxHCLimit(Integer fastIdleMaxHCLimit) {
        this.fastIdleMaxHCLimit = fastIdleMaxHCLimit;
        return this;
    }

    public SparkTestResultBuilder withFastIdleHCValue(Integer fastIdleHCValue) {
        this.fastIdleHCValue = fastIdleHCValue;
        return this;
    }

    public SparkTestResultBuilder withFastIdleHCTestResult(EmissionsTestResult.TestResult fastIdleHCTestResult) {
        this.fastIdleHCTestResult = fastIdleHCTestResult;
        return this;
    }

    public SparkTestResultBuilder withFastIdleMinLambdaLimit(BigDecimal fastIdleMinLambdaLimit) {
        this.fastIdleMinLambdaLimit = fastIdleMinLambdaLimit;
        return this;
    }

    public SparkTestResultBuilder withFastIdleMaxLambdaLimit(BigDecimal fastIdleMaxLambdaLimit) {
        this.fastIdleMaxLambdaLimit = fastIdleMaxLambdaLimit;
        return this;
    }

    public SparkTestResultBuilder withFastIdleLambdaValue(BigDecimal fastIdleLambdaValue) {
        this.fastIdleLambdaValue = fastIdleLambdaValue;
        return this;
    }

    public SparkTestResultBuilder withFastIdleLambdaTestResult(EmissionsTestResult.TestResult fastIdleLambdaTestResult) {
        this.fastIdleLambdaTestResult = fastIdleLambdaTestResult;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleMinRPMLimit(Integer secondFastIdleMinRPMLimit) {
        this.secondFastIdleMinRPMLimit = secondFastIdleMinRPMLimit;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleMaxRPMLimit(Integer secondFastIdleMaxRPMLimit) {
        this.secondFastIdleMaxRPMLimit = secondFastIdleMaxRPMLimit;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleRPMValue(Integer secondFastIdleRPMValue) {
        this.secondFastIdleRPMValue = secondFastIdleRPMValue;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleRPMTestResult(EmissionsTestResult.TestResult secondFastIdleRPMTestResult) {
        this.secondFastIdleRPMTestResult = secondFastIdleRPMTestResult;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleMaxCOLimit(BigDecimal secondFastIdleMaxCOLimit) {
        this.secondFastIdleMaxCOLimit = secondFastIdleMaxCOLimit;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleCOValue(BigDecimal secondFastIdleCOValue) {
        this.secondFastIdleCOValue = secondFastIdleCOValue;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleCOTestResult(EmissionsTestResult.TestResult secondFastIdleCOTestResult) {
        this.secondFastIdleCOTestResult = secondFastIdleCOTestResult;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleMaxHCLimit(Integer secondFastIdleMaxHCLimit) {
        this.secondFastIdleMaxHCLimit = secondFastIdleMaxHCLimit;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleHCValue(Integer secondFastIdleHCValue) {
        this.secondFastIdleHCValue = secondFastIdleHCValue;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleHCTestResult(EmissionsTestResult.TestResult secondFastIdleHCTestResult) {
        this.secondFastIdleHCTestResult = secondFastIdleHCTestResult;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleMinLanbdaLimit(BigDecimal secondFastIdleMinLanbdaLimit) {
        this.secondFastIdleMinLanbdaLimit = secondFastIdleMinLanbdaLimit;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleMaxLanbdaLimit(BigDecimal secondFastIdleMaxLanbdaLimit) {
        this.secondFastIdleMaxLanbdaLimit = secondFastIdleMaxLanbdaLimit;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleLambdaValue(BigDecimal secondFastIdleLambdaValue) {
        this.secondFastIdleLambdaValue = secondFastIdleLambdaValue;
        return this;
    }

    public SparkTestResultBuilder withSecondFastIdleLambdaTestResult(EmissionsTestResult.TestResult secondFastIdleLambdaTestResult) {
        this.secondFastIdleLambdaTestResult = secondFastIdleLambdaTestResult;
        return this;
    }

    public SparkTestResultBuilder withNaturalIdleMinRPMLimit(Integer naturalIdleMinRPMLimit) {
        this.naturalIdleMinRPMLimit = naturalIdleMinRPMLimit;
        return this;
    }

    public SparkTestResultBuilder withNaturalIdleMaxRPMLimit(Integer naturalIdleMaxRPMLimit) {
        this.naturalIdleMaxRPMLimit = naturalIdleMaxRPMLimit;
        return this;
    }

    public SparkTestResultBuilder withNaturalIdleRPMValue(Integer naturalIdleRPMValue) {
        this.naturalIdleRPMValue = naturalIdleRPMValue;
        return this;
    }

    public SparkTestResultBuilder withNaturalIdleRPMTestResult(EmissionsTestResult.TestResult naturalIdleRPMTestResult) {
        this.naturalIdleRPMTestResult = naturalIdleRPMTestResult;
        return this;
    }

    public SparkTestResultBuilder withNaturalIdleMaxCOLimit(BigDecimal naturalIdleMaxCOLimit) {
        this.naturalIdleMaxCOLimit = naturalIdleMaxCOLimit;
        return this;
    }

    public SparkTestResultBuilder withNaturalIdleCOValue(BigDecimal naturalIdleCOValue) {
        this.naturalIdleCOValue = naturalIdleCOValue;
        return this;
    }

    public SparkTestResultBuilder withNaturalIdleCOTestResult(EmissionsTestResult.TestResult naturalIdleCOTestResult) {
        this.naturalIdleCOTestResult = naturalIdleCOTestResult;
        return this;
    }

    public SparkTestResultBuilder withNaturalIdleMaxHCLimit(Integer naturalIdleMaxHCLimit) {
        this.naturalIdleMaxHCLimit = naturalIdleMaxHCLimit;
        return this;
    }

    public SparkTestResultBuilder withNaturalIdleHCValue(Integer naturalIdleHCValue) {
        this.naturalIdleHCValue = naturalIdleHCValue;
        return this;
    }

    public SparkTestResultBuilder withNaturalIdleHCTestResult(EmissionsTestResult.TestResult naturalIdleHCTestResult) {
        this.naturalIdleHCTestResult = naturalIdleHCTestResult;
        return this;
    }

    public SparkTestResult build() {
        SparkTestResult sparkTestResult = new SparkTestResult();
        sparkTestResult.setTestType(testType);
        sparkTestResult.setFastIdleMinRPMLimit(fastIdleMinRPMLimit);
        sparkTestResult.setFastIdleMaxRPMLimit(fastIdleMaxRPMLimit);
        sparkTestResult.setFastIdleRPMValue(fastIdleRPMValue);
        sparkTestResult.setFastIdleRPMTestResult(fastIdleRPMTestResult);
        sparkTestResult.setFastIdleMaxCOLimit(fastIdleMaxCOLimit);
        sparkTestResult.setFastIdleCOValue(fastIdleCOValue);
        sparkTestResult.setFastIdleCOTestResult(fastIdleCOTestResult);
        sparkTestResult.setFastIdleMaxHCLimit(fastIdleMaxHCLimit);
        sparkTestResult.setFastIdleHCValue(fastIdleHCValue);
        sparkTestResult.setFastIdleHCTestResult(fastIdleHCTestResult);
        sparkTestResult.setFastIdleMinLambdaLimit(fastIdleMinLambdaLimit);
        sparkTestResult.setFastIdleMaxLambdaLimit(fastIdleMaxLambdaLimit);
        sparkTestResult.setFastIdleLambdaValue(fastIdleLambdaValue);
        sparkTestResult.setFastIdleLambdaTestResult(fastIdleLambdaTestResult);
        sparkTestResult.setSecondFastIdleMinRPMLimit(secondFastIdleMinRPMLimit);
        sparkTestResult.setSecondFastIdleMaxRPMLimit(secondFastIdleMaxRPMLimit);
        sparkTestResult.setSecondFastIdleRPMValue(secondFastIdleRPMValue);
        sparkTestResult.setSecondFastIdleRPMTestResult(secondFastIdleRPMTestResult);
        sparkTestResult.setSecondFastIdleMaxCOLimit(secondFastIdleMaxCOLimit);
        sparkTestResult.setSecondFastIdleCOValue(secondFastIdleCOValue);
        sparkTestResult.setSecondFastIdleCOTestResult(secondFastIdleCOTestResult);
        sparkTestResult.setSecondFastIdleMaxHCLimit(secondFastIdleMaxHCLimit);
        sparkTestResult.setSecondFastIdleHCValue(secondFastIdleHCValue);
        sparkTestResult.setSecondFastIdleHCTestResult(secondFastIdleHCTestResult);
        sparkTestResult.setSecondFastIdleMinLambdaLimit(secondFastIdleMinLanbdaLimit);
        sparkTestResult.setSecondFastIdleMaxLambdaLimit(secondFastIdleMaxLanbdaLimit);
        sparkTestResult.setSecondFastIdleLambdaValue(secondFastIdleLambdaValue);
        sparkTestResult.setSecondFastIdleLambdaTestResult(secondFastIdleLambdaTestResult);
        sparkTestResult.setNaturalIdleMinRPMLimit(naturalIdleMinRPMLimit);
        sparkTestResult.setNaturalIdleMaxRPMLimit(naturalIdleMaxRPMLimit);
        sparkTestResult.setNaturalIdleRPMValue(naturalIdleRPMValue);
        sparkTestResult.setNaturalIdleRPMTestResult(naturalIdleRPMTestResult);
        sparkTestResult.setNaturalIdleMaxCOLimit(naturalIdleMaxCOLimit);
        sparkTestResult.setNaturalIdleCOValue(naturalIdleCOValue);
        sparkTestResult.setNaturalIdleCOTestResult(naturalIdleCOTestResult);
        sparkTestResult.setNaturalIdleMaxHCLimit(naturalIdleMaxHCLimit);
        sparkTestResult.setNaturalIdleHCValue(naturalIdleHCValue);
        sparkTestResult.setNaturalIdleHCTestResult(naturalIdleHCTestResult);
        return sparkTestResult;
    }
}
