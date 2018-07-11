package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.OBDTestResult;

import static uk.gov.dvsa.mot.iot.client.data.OBDTestResult.MonitorStatus;
import static uk.gov.dvsa.mot.iot.client.data.OBDTestResult.IgnitionType;

import java.util.Arrays;
import java.util.Random;

public class RandomOBDTestResultBuilder {

    private RandomOBDTestResultBuilder() {
    }

    public static RandomOBDTestResultBuilder aRandomOBDTestResult() {
        return new RandomOBDTestResultBuilder();
    }

    public OBDTestResult build(){
        OBDTestResult obdTestResult;

        if(new Random().nextBoolean()){
            obdTestResult = OBDTestResultBuilder.anOBDTestResult()
                    .withVin("12345678901234567")
                    .withIgnitionType(IgnitionType.SPARK)
                    .withIsMilOn(true)
                    .withDtcCount(2)
                    .withDtcs(Arrays.asList("P0100", "P0101"))
                    .withMisfireMonitorStatus(MonitorStatus.OK)
                    .withFuelSystemMonitorStatus(MonitorStatus.OK)
                    .withComponentsMonitorStatus(MonitorStatus.OK)
                    .withCatalystMonitorStatus(MonitorStatus.OK)
                    .withHeatedCatalystMonitorStatus(MonitorStatus.OK)
                    .withEvaporativeSystemMonitorStatus(MonitorStatus.OK)
                    .withSecondaryAirSystemMonitorStatus(MonitorStatus.OK)
                    .withOxygenSensorMonitorStatus(MonitorStatus.OK)
                    .withOxygenSensorHeaterMonitorStatus(MonitorStatus.OK)
                    .withEgrSystemMonitorStatus(MonitorStatus.OK)
                    .build();
        } else {
            obdTestResult = OBDTestResultBuilder.anOBDTestResult()
                    .withVin("ABCDEFGHIJKLMNOPQ")
                    .withIgnitionType(IgnitionType.COMPRESSION)
                    .withIsMilOn(false)
                    .withDtcCount(0)
                    .withMisfireMonitorStatus(MonitorStatus.OK)
                    .withFuelSystemMonitorStatus(MonitorStatus.OK)
                    .withComponentsMonitorStatus(MonitorStatus.OK)
                    .withEgrSystemMonitorStatus(MonitorStatus.OK)
                    .withNmhcCatalystMonitorStatus(MonitorStatus.NOT_READY)
                    .withNoxScrAftertreatmentMonitorStatus(MonitorStatus.NOT_READY)
                    .withBoostPressureMonitorStatus(MonitorStatus.NOT_READY)
                    .withExhaustGasSensorMonitorStatus(MonitorStatus.NOT_READY)
                    .withPmFilterMonitorStatus(MonitorStatus.NOT_READY)
                    .build();
        }

        return obdTestResult;
    }
}
