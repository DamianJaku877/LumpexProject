package pl.sdaacademy.core.model;

import pl.sdaacademy.utils.TextUtils;

import java.time.LocalTime;

public class StopTime extends FeedModel {
    private String tripId;
    private LocalTime arrivalTime;
    private LocalTime departureTime;
    private String stopId;
    private String stopSequence;
    private String stopHeadsign;
    private PickupType pickupType;
    private DropOffType dropOffType;

    public StopTime() {
        super(TextUtils.EMPTY_STRING);
    }

    public StopTime(String tripId, LocalTime arrivalTime, LocalTime departureTime, String stopId, String stopSequence, String stopHeadsign, PickupType pickupType, DropOffType dropOffType) {
        super(tripId);
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.stopId = stopId;
        this.stopSequence = stopSequence;
        this.stopHeadsign = stopHeadsign;
        this.pickupType = pickupType;
        this.dropOffType = dropOffType;
    }

    public String getTripId() {
        return id;
    }

    public void setTripId(String tripId) {
        this.id = tripId;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public String getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(String stopSequence) {
        this.stopSequence = stopSequence;
    }

    public String getStopHeadsign() {
        return stopHeadsign;
    }

    public void setStopHeadsign(String stopHeadsign) {
        this.stopHeadsign = stopHeadsign;
    }

    public PickupType getPickupType() {
        return pickupType;
    }

    public void setPickupType(PickupType pickupType) {
        this.pickupType = pickupType;
    }

    public DropOffType getDropOffType() {
        return dropOffType;
    }

    public void setDropOffType(DropOffType dropOffType) {
        this.dropOffType = dropOffType;
    }
}
