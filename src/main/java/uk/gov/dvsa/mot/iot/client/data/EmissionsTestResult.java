package uk.gov.dvsa.mot.iot.client.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmissionsTestResult {

    /* Vehicle under test */
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleVRM;
    private BigInteger vehicleOdometerReading;
    private Integer vehicleEngineSize;
    private FuelType vehicleFuelType;

    /* Test Time */
    private LocalDateTime startDateTime;

    /* Engine Temperature - deg C */
    private Integer engineTempMinLimit;
    private Integer engineTempValue;
    private TestResult engineTempTestResult;

    /* Spark or Compression Test Results */
    private SparkTestResult sparkTestResult;
    private CompressionTestResult compressionTestResult;

    /* Defaults or Manufacturers limits */
    private LimitsUsed limitsUsed;

    /* Overall Test Result */
    private OverallTestResult overallTestResult;

    /* Test Equipment details*/
    private String softwareVersion;
    private LocalDate calibrationDueDate;

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleVRM() {
        return vehicleVRM;
    }

    public void setVehicleVRM(String vehicleVRM) {
        this.vehicleVRM = vehicleVRM;
    }

    public BigInteger getVehicleOdometerReading() {
        return vehicleOdometerReading;
    }

    public void setVehicleOdometerReading(BigInteger vehicleOdometerReading) {
        this.vehicleOdometerReading = vehicleOdometerReading;
    }

    public Integer getVehicleEngineSize() {
        return vehicleEngineSize;
    }

    public void setVehicleEngineSize(Integer vehicleEngineSize) {
        this.vehicleEngineSize = vehicleEngineSize;
    }

    public FuelType getVehicleFuelType() {
        return vehicleFuelType;
    }

    public void setVehicleFuelType(FuelType vehicleFuelType) {
        this.vehicleFuelType = vehicleFuelType;
    }

    public String getStartDateTime() {
        return startDateTime.toString();
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Integer getEngineTempMinLimit() {
        return engineTempMinLimit;
    }

    public void setEngineTempMinLimit(Integer engineTempMinLimit) {
        this.engineTempMinLimit = engineTempMinLimit;
    }

    public Integer getEngineTempValue() {
        return engineTempValue;
    }

    public void setEngineTempValue(Integer engineTempValue) {
        this.engineTempValue = engineTempValue;
    }

    public TestResult getEngineTempTestResult() {
        return engineTempTestResult;
    }

    public void setEngineTempTestResult(TestResult engineTempTestResult) {
        this.engineTempTestResult = engineTempTestResult;
    }

    public SparkTestResult getSparkTestResult() {
        return sparkTestResult;
    }

    public void setSparkTestResult(SparkTestResult sparkTestResult) {
        this.sparkTestResult = sparkTestResult;
    }

    public CompressionTestResult getCompressionTestResult() {
        return compressionTestResult;
    }

    public void setCompressionTestResult(CompressionTestResult compressionTestResult) {
        this.compressionTestResult = compressionTestResult;
    }

    public OverallTestResult getOverallTestResult() {
        return overallTestResult;
    }

    public void setOverallTestResult(OverallTestResult overallTestResult) {
        this.overallTestResult = overallTestResult;
    }

    public LimitsUsed getLimitsUsed() {
        return limitsUsed;
    }

    public void setLimitsUsed(LimitsUsed limitsUsed) {
        this.limitsUsed = limitsUsed;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public LocalDate getCalibrationDueDate() {
        return calibrationDueDate;
    }

    public void setCalibrationDueDate(LocalDate calibrationDueDate) {
        this.calibrationDueDate = calibrationDueDate;
    }

    public enum FuelType{
        PETROL,
        DIESEL,
        LPG
    }

    public enum LimitsUsed{
        DEFAULT,
        MANUFACTURER
    }

    public enum TestResult {
        PASS,
        FAIL,
        NOT_MEASURED
    }

    public enum OverallTestResult {
        PASSED,
        FAILED
    }
}
