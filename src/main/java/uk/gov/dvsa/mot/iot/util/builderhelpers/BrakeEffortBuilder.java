package uk.gov.dvsa.mot.iot.util.builderhelpers;

import uk.gov.dvsa.mot.iot.client.data.BrakeEffort;

public final class BrakeEffortBuilder {
    private Integer axleNumber;
    private Integer nearside;
    private Boolean nearsideLock;
    private Integer offside;
    private Boolean offsideLock;

    private BrakeEffortBuilder() {
    }

    public static BrakeEffortBuilder aBrakeEffort() {
        return new BrakeEffortBuilder();
    }

    public BrakeEffortBuilder withAxleNumber(Integer axleNumber) {
        this.axleNumber = axleNumber;
        return this;
    }

    public BrakeEffortBuilder withNearside(Integer nearside) {
        this.nearside = nearside;
        return this;
    }

    public BrakeEffortBuilder withNearsideLock(Boolean nearsideLock) {
        this.nearsideLock = nearsideLock;
        return this;
    }

    public BrakeEffortBuilder withOffside(Integer offside) {
        this.offside = offside;
        return this;
    }

    public BrakeEffortBuilder withOffsideLock(Boolean offsideLock) {
        this.offsideLock = offsideLock;
        return this;
    }

    public BrakeEffort build() {
        BrakeEffort brakeEffort = new BrakeEffort();
        brakeEffort.setAxleNumber(axleNumber);
        brakeEffort.setNearside(nearside);
        brakeEffort.setNearsideLock(nearsideLock);
        brakeEffort.setOffside(offside);
        brakeEffort.setOffsideLock(offsideLock);
        return brakeEffort;
    }
}
