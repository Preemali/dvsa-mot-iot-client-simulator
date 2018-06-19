package uk.gov.dvsa.mot.iot.client;

import uk.gov.dvsa.mot.iot.client.data.WorkOrder;

public interface MessageListener {

    void onMessage(WorkOrder workOrder);
}
