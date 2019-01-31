package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.CompressionTestResult;
import uk.gov.dvsa.mot.iot.client.data.EmissionsTestResult;
import uk.gov.dvsa.mot.iot.client.data.SparkTestResult;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class EGATestResultBuilder {

    private EmissionsTestResult emissionsTestResult;;

    private EGATestResultBuilder() {
    }

    public static EGATestResultBuilder anEGATestResultBuilder(){
        return new EGATestResultBuilder();
    }

    public EGATestResultBuilder withSparkBET(){
        SparkTestResult sparkTestResult = SparkTestResultBuilder.aSparkTestResult()
                .withTestType(SparkTestResult.TestType.BET)
                .withFastIdleMinRPMLimit(2500)
                .withFastIdleMaxRPMLimit(3000)
                .withFastIdleRPMValue(2760)
                .withFastIdleRPMTestResult(EmissionsTestResult.TestResult.PASS)
                .withFastIdleMaxCOLimit(new BigDecimal("0.2"))
                .withFastIdleCOValue(new BigDecimal("0.14"))
                .withFastIdleCOTestResult(EmissionsTestResult.TestResult.PASS)
                .withFastIdleMaxHCLimit(200)
                .withFastIdleHCValue(200)
                .withFastIdleMinLambdaLimit(new BigDecimal("0.97"))
                .withFastIdleMaxLambdaLimit(new BigDecimal(1.03))
                .withFastIdleLambdaValue(new BigDecimal("1.0"))
                .withFastIdleLambdaTestResult(EmissionsTestResult.TestResult.PASS)
                .withNaturalIdleMinRPMLimit(450)
                .withNaturalIdleMaxRPMLimit(1500)
                .withNaturalIdleRPMValue(960)
                .withNaturalIdleRPMTestResult(EmissionsTestResult.TestResult.PASS)
                .withNaturalIdleMaxCOLimit(new BigDecimal("0.3"))
                .withNaturalIdleCOValue(new BigDecimal("0.14"))
                .withNaturalIdleCOTestResult(EmissionsTestResult.TestResult.PASS)
                .build();

        emissionsTestResult = buildEmissionsTestResult();
        /* not required for BET */
        emissionsTestResult.setVehicleMake(null);
        emissionsTestResult.setVehicleModel(null);
        emissionsTestResult.setVehicleVRM(null);
        emissionsTestResult.setVehicleOdometerReading(null);

        emissionsTestResult.setVehicleFuelType(EmissionsTestResult.FuelType.PETROL);
        emissionsTestResult.setSparkTestResult(sparkTestResult);
        emissionsTestResult.setOverallTestResult(EmissionsTestResult.OverallTestResult.PASSED);
        emissionsTestResult.setLimitsUsed(EmissionsTestResult.LimitsUsed.DEFAULT);
        return this;
    }

    public EGATestResultBuilder withSparkCAT(){
        SparkTestResult sparkTestResult = SparkTestResultBuilder.aSparkTestResult()
                .withTestType(SparkTestResult.TestType.CAT)
                .withFastIdleMinRPMLimit(2450)
                .withFastIdleMaxRPMLimit(3050)
                .withFastIdleRPMValue(2820)
                .withFastIdleRPMTestResult(EmissionsTestResult.TestResult.PASS)
                .withFastIdleMaxCOLimit(new BigDecimal(0.2))
                .withFastIdleCOValue(new BigDecimal(0.098))
                .withFastIdleCOTestResult(EmissionsTestResult.TestResult.PASS)
                .withFastIdleMaxHCLimit(200)
                .withFastIdleHCValue(100)
                .withFastIdleMinLambdaLimit(new BigDecimal(0.97))
                .withFastIdleMaxLambdaLimit(new BigDecimal(1.03))
                .withFastIdleLambdaValue(new BigDecimal(1.0))
                .withFastIdleLambdaTestResult(EmissionsTestResult.TestResult.PASS)
                .withNaturalIdleMinRPMLimit(575)
                .withNaturalIdleMaxRPMLimit(875)
                .withNaturalIdleRPMValue(720)
                .withNaturalIdleRPMTestResult(EmissionsTestResult.TestResult.PASS)
                .withNaturalIdleMaxCOLimit(new BigDecimal(0.3))
                .withNaturalIdleCOValue(new BigDecimal(0.14))
                .withNaturalIdleCOTestResult(EmissionsTestResult.TestResult.PASS)
                .build();
        emissionsTestResult = buildEmissionsTestResult();
        emissionsTestResult.setEngineTempMinLimit(80);
        emissionsTestResult.setEngineTempValue(80);
        emissionsTestResult.setVehicleFuelType(EmissionsTestResult.FuelType.PETROL);
        emissionsTestResult.setSparkTestResult(sparkTestResult);
        emissionsTestResult.setOverallTestResult(EmissionsTestResult.OverallTestResult.PASSED);
        emissionsTestResult.setLimitsUsed(EmissionsTestResult.LimitsUsed.MANUFACTURER);

        return this;
    }

    public EGATestResultBuilder withSparkNonCAT(){
        SparkTestResult sparkTestResult = SparkTestResultBuilder.aSparkTestResult()
                .withTestType(SparkTestResult.TestType.NON_CAT)
                .withNaturalIdleRPMTestResult(EmissionsTestResult.TestResult.PASS)
                .withNaturalIdleMaxCOLimit(new BigDecimal(3.5))
                .withNaturalIdleCOValue(new BigDecimal(0.14))
                .withNaturalIdleCOTestResult(EmissionsTestResult.TestResult.PASS)
                .withNaturalIdleMaxHCLimit(1200)
                .withNaturalIdleHCValue(200)
                .withNaturalIdleHCTestResult(EmissionsTestResult.TestResult.PASS)
                .build();
        emissionsTestResult = buildEmissionsTestResult();

        emissionsTestResult.setVehicleFuelType(EmissionsTestResult.FuelType.PETROL);
        emissionsTestResult.setSparkTestResult(sparkTestResult);
        emissionsTestResult.setOverallTestResult(EmissionsTestResult.OverallTestResult.PASSED);
        emissionsTestResult.setLimitsUsed(EmissionsTestResult.LimitsUsed.DEFAULT);

        return this;
    }

    public EGATestResultBuilder withCompressionFastPass(){
        CompressionTestResult compressionTestResult = CompressionTestResultBuilder.aCompressionTestResult()
                .withTestType(CompressionTestResult.TestType.FAST_PASS)
                .withTestLimitApplied(new BigDecimal(1.5))
                .withFas1Value(new BigDecimal(1.04))
                .withZeroDrift(new BigDecimal(0.02))
                .withCorrectedMeanValue(new BigDecimal(1.02))
                .withTestResult(EmissionsTestResult.TestResult.PASS)
                .build();

        emissionsTestResult = buildEmissionsTestResult();
        emissionsTestResult.setVehicleFuelType(EmissionsTestResult.FuelType.DIESEL);
        emissionsTestResult.setCompressionTestResult(compressionTestResult);
        emissionsTestResult.setOverallTestResult(EmissionsTestResult.OverallTestResult.PASSED);
        emissionsTestResult.setLimitsUsed(EmissionsTestResult.LimitsUsed.DEFAULT);
        return this;
    }

    public EGATestResultBuilder withCompressionTurbo(){
        CompressionTestResult compressionTestResult = CompressionTestResultBuilder.aCompressionTestResult()
                .withTestType(CompressionTestResult.TestType.TURBO)
                .withTestLimitApplied(new BigDecimal(0.7))
                .withFas1Value(new BigDecimal(1.11))
                .withFas2Value(new BigDecimal(0.36))
                .withFas3Value(new BigDecimal(0.2))
                .withFas4Value(new BigDecimal(0.5))
                .withFas5Value(new BigDecimal(0.32))
                .withFas6Value(new BigDecimal(0.36))
                .withMeanValue(new BigDecimal(0.39))
                .withZeroDrift(new BigDecimal(0.00))
                .withCorrectedMeanValue(new BigDecimal(0.39))
                .withTestResult(EmissionsTestResult.TestResult.PASS)
                .build();

        emissionsTestResult = buildEmissionsTestResult();
        emissionsTestResult.setVehicleFuelType(EmissionsTestResult.FuelType.DIESEL);
        emissionsTestResult.setCompressionTestResult(compressionTestResult);
        emissionsTestResult.setOverallTestResult(EmissionsTestResult.OverallTestResult.PASSED);
        emissionsTestResult.setLimitsUsed(EmissionsTestResult.LimitsUsed.MANUFACTURER);

        return this;
    }

    public EmissionsTestResult build(){
        return emissionsTestResult;
    }

    private EmissionsTestResult buildEmissionsTestResult(){

        return EmissionsTestResultBuilder.anEmissionsTestResult()
                .withVehicleManufacturer("BMW")
                .withVehicleModel("3 Series")
                .withVehicleRegistrationNumber("ABC 123")
                .withVehicleOdometerReading(new BigInteger("12345"))
                .withStartDateTime(LocalDateTime.now())
                .build();
    }
}
