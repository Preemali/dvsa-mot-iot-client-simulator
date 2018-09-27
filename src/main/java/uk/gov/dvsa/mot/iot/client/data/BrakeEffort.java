package uk.gov.dvsa.mot.iot.client.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BrakeEffort {
    private Integer axleNumber;
    private Integer nearside;
    private Boolean nearsideLock;
    private Integer offside;
    private Boolean offsideLock;

    public Integer getAxleNumber() {
        return axleNumber;
    }

    public void setAxleNumber(Integer axleNumber) {
        this.axleNumber = axleNumber;
    }

    public Integer getNearside() {
        return nearside;
    }

    public void setNearside(Integer nearside) {
        this.nearside = nearside;
    }

    public Boolean getNearsideLock() {
        return nearsideLock;
    }

    public void setNearsideLock(Boolean neasideLock) {
        this.nearsideLock = neasideLock;
    }

    public Integer getOffside() {
        return offside;
    }

    public void setOffside(Integer offside) {
        this.offside = offside;
    }

    public Boolean getOffsideLock() {
        return offsideLock;
    }

    public void setOffsideLock(Boolean offsideLock) {
        this.offsideLock = offsideLock;
    }
}
