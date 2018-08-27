package pl.sdaacademy.core.model;

import pl.sdaacademy.utils.TextUtils;

public class Stop extends FeedModel {
    private String stopCode;
    private String stopName;
    private String stopDesc;
    private float stopLat;
    private float stopLon;
    private String stopUrl;
    private LocationType locationType;
    private String parentStation;
    private String wheelchairBoarding;

    public Stop() {
        super(TextUtils.EMPTY_STRING);
    }

    public Stop(String stopId, String stopCode, String stopName, String stopDesc, float stopLat, float stopLon, String stopUrl, LocationType locationType, String parentStation, String wheelchairBoarding) {
        super(stopId);
        this.stopCode = stopCode;
        this.stopName = stopName;
        this.stopDesc = stopDesc;
        this.stopLat = stopLat;
        this.stopLon = stopLon;
        this.stopUrl = stopUrl;
        this.locationType = locationType;
        this.parentStation = parentStation;
        this.wheelchairBoarding = wheelchairBoarding;
    }

    public String getStopId() {
        return id;
    }

    public void setStopId(String stopId) {
        this.id = stopId;
    }

    public String getStopCode() {
        return stopCode;
    }

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getStopDesc() {
        return stopDesc;
    }

    public void setStopDesc(String stopDesc) {
        this.stopDesc = stopDesc;
    }

    public float getStopLat() {
        return stopLat;
    }

    public void setStopLat(float stopLat) {
        this.stopLat = stopLat;
    }

    public float getStopLon() {
        return stopLon;
    }

    public void setStopLon(float stopLon) {
        this.stopLon = stopLon;
    }

    public String getStopUrl() {
        return stopUrl;
    }

    public void setStopUrl(String stopUrl) {
        this.stopUrl = stopUrl;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    public String getParentStation() {
        return parentStation;
    }

    public void setParentStation(String parentStation) {
        this.parentStation = parentStation;
    }

    public String getWheelchairBoarding() {
        return wheelchairBoarding;
    }

    public void setWheelchairBoarding(String wheelchairBoarding) {
        this.wheelchairBoarding = wheelchairBoarding;
    }
}
