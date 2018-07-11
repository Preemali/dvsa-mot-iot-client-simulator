package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.EmissionsTestResult;

import java.math.BigDecimal;
import java.util.Random;

public class RandomEGATestResultBuilder {

    private RandomEGATestResultBuilder() {
    }

    public static RandomEGATestResultBuilder aRandomEGATestResultBuilder(){
        return new RandomEGATestResultBuilder();
    }

    public EmissionsTestResult build(){

        EmissionsTestResult emissionsTestResult;

        if(new Random().nextBoolean()){
            emissionsTestResult = EmissionsTestResultBuilder.anEmissionsTestResult()
                    .withFuelType(EmissionsTestResult.FuelType.PETROL)
                    .withVisibleSmoke(false)
                    .withEngineOilTemperature(101)
                    .withCatalyst(true)
                    .withIdleRPM(950)
                    .withIdleCO(BigDecimal.valueOf(0.02))
                    .withFastIdleRPM(2600)
                    .withFastIdleCO(BigDecimal.valueOf(0.05))
                    .withFastIdleHC(17)
                    .withFastIdleLambda(BigDecimal.valueOf(1.003))
                    .build();
        } else {
            emissionsTestResult = EmissionsTestResultBuilder.anEmissionsTestResult()
                    .withFuelType(EmissionsTestResult.FuelType.DIESEL)
                    .withVisibleSmoke(false)
                    .withEngineOilTemperature(101)
                    .withTurbo(true)
                    .withOpacity(BigDecimal.valueOf(0.1))
                    .build();
        }

        return emissionsTestResult;
    }
}
