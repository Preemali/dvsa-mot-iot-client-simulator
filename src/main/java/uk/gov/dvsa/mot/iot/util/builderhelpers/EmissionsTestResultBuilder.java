package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.CompressionTestResult;
import uk.gov.dvsa.mot.iot.client.data.EmissionsTestResult;
import uk.gov.dvsa.mot.iot.client.data.SparkTestResult;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

public final class EmissionsTestResultBuilder {
    /* Vehicle under test */
    private String vehicleManufacturer;
    private String vehicleModel;
    private String vehicleRegistrationNumber;
    private BigInteger vehicleOdometerReading;
    private Integer engineSize;
    private EmissionsTestResult.FuelType vehicleFuelType;
    /* Test Time */
    private LocalDateTime startDateTime;
    /* Engine Temperature - deg C */
    private Integer engineTempMinLimit;
    private Integer engineTempValue;
    private EmissionsTestResult.TestResult engineTempTestResult;
    /* Visible Smoke */
    /* Spark or Compression Test Results */
    private SparkTestResult sparkTestResult;
    private CompressionTestResult compressionTestResult;
    /* Overall Test Result */
    private EmissionsTestResult.OverallTestResult overallTestResult;
    /* Test Equipment details*/
    private String softwareVersion;
    private LocalDate calibrationDueDate;
    private EmissionsTestResult.LimitsUsed limitsUsed;

    private EmissionsTestResultBuilder() {
    }

    public static EmissionsTestResultBuilder anEmissionsTestResult() {
        return new EmissionsTestResultBuilder();
    }

    public EmissionsTestResultBuilder withVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
        return this;
    }

    public EmissionsTestResultBuilder withVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }

    public EmissionsTestResultBuilder withVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
        return this;
    }

    public EmissionsTestResultBuilder withVehicleOdometerReading(BigInteger vehicleOdometerReading) {
        this.vehicleOdometerReading = vehicleOdometerReading;
        return this;
    }

    public EmissionsTestResultBuilder withEngineSize(Integer engineSize) {
        this.engineSize = engineSize;
        return this;
    }

    public EmissionsTestResultBuilder withVehicleFuelType(EmissionsTestResult.FuelType vehicleFuelType) {
        this.vehicleFuelType = vehicleFuelType;
        return this;
    }

    public EmissionsTestResultBuilder withStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    public EmissionsTestResultBuilder withEngineTempMinLimit(Integer engineTempMinLimit) {
        this.engineTempMinLimit = engineTempMinLimit;
        return this;
    }

    public EmissionsTestResultBuilder withEngineTempValue(Integer engineTempValue) {
        this.engineTempValue = engineTempValue;
        return this;
    }

    public EmissionsTestResultBuilder withEngineTempTestResult(EmissionsTestResult.TestResult engineTempTestResult) {
        this.engineTempTestResult = engineTempTestResult;
        return this;
    }

    public EmissionsTestResultBuilder withSparkTestResult(SparkTestResult sparkTestResult) {
        this.sparkTestResult = sparkTestResult;
        return this;
    }

    public EmissionsTestResultBuilder withCompressionTestResult(CompressionTestResult compressionTestResult) {
        this.compressionTestResult = compressionTestResult;
        return this;
    }

    public EmissionsTestResultBuilder withOverallTestResult(EmissionsTestResult.OverallTestResult overallTestResult) {
        this.overallTestResult = overallTestResult;
        return this;
    }

    public EmissionsTestResultBuilder withSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }

    public EmissionsTestResultBuilder withCalibrationDueDate(LocalDate calibrationDueDate) {
        this.calibrationDueDate = calibrationDueDate;
        return this;
    }

    public EmissionsTestResultBuilder withLimitsUsed(EmissionsTestResult.LimitsUsed limitsUsed) {
        this.limitsUsed = limitsUsed;
        return this;
    }

    public EmissionsTestResult build() {
        EmissionsTestResult emissionsTestResult = new EmissionsTestResult();
        emissionsTestResult.setVehicleMake(vehicleManufacturer);
        emissionsTestResult.setVehicleModel(vehicleModel);
        emissionsTestResult.setVehicleVRM(vehicleRegistrationNumber);
        emissionsTestResult.setVehicleOdometerReading(vehicleOdometerReading);
        emissionsTestResult.setVehicleEngineSize(engineSize);
        emissionsTestResult.setVehicleFuelType(vehicleFuelType);
        emissionsTestResult.setStartDateTime(startDateTime);
        emissionsTestResult.setEngineTempMinLimit(engineTempMinLimit);
        emissionsTestResult.setEngineTempValue(engineTempValue);
        emissionsTestResult.setEngineTempTestResult(engineTempTestResult);
        emissionsTestResult.setSparkTestResult(sparkTestResult);
        emissionsTestResult.setCompressionTestResult(compressionTestResult);
        emissionsTestResult.setOverallTestResult(overallTestResult);
        emissionsTestResult.setSoftwareVersion(softwareVersion);
        emissionsTestResult.setCalibrationDueDate(calibrationDueDate);
        emissionsTestResult.setLimitsUsed(limitsUsed);
        return emissionsTestResult;
    }
}
