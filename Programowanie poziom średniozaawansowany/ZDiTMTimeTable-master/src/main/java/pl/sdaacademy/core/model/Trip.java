package pl.sdaacademy.core.model;

import pl.sdaacademy.utils.TextUtils;

public class Trip extends FeedModel {
    private String routeId;
    private String serviceId;
    private String tripHeadsign;
    private String directionId;
    private String blockId;
    private String shapeId;
    private boolean isWheelchairAccessible;
    private boolean isLowFloor;

    public Trip() {
        super(TextUtils.EMPTY_STRING);
    }

    public Trip(String routeId, String serviceId, String tripId, String tripHeadsign, String directionId, String blockId, String shapeId, boolean isWheelchairAccessible, boolean isLowFloor) {
        super(tripId);
        this.routeId = routeId;
        this.serviceId = serviceId;
        this.tripHeadsign = tripHeadsign;
        this.directionId = directionId;
        this.blockId = blockId;
        this.shapeId = shapeId;
        this.isWheelchairAccessible = isWheelchairAccessible;
        this.isLowFloor = isLowFloor;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

//    public String getTripId() {
//        return id;
//    }
//
//    public void setTripId(String tripId) {
//        this.id = tripId;
//    }

    public String getTripHeadsign() {
        return tripHeadsign;
    }

    public void setTripHeadsign(String tripHeadsign) {
        this.tripHeadsign = tripHeadsign;
    }

    public String getDirectionId() {
        return directionId;
    }

    public void setDirectionId(String directionId) {
        this.directionId = directionId;
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    public boolean isWheelchairAccessible() {
        return isWheelchairAccessible;
    }

    public void setWheelchairAccessible(boolean wheelchairAccessible) {
        isWheelchairAccessible = wheelchairAccessible;
    }

    public boolean isLowFloor() {
        return isLowFloor;
    }

    public void setLowFloor(boolean lowFloor) {
        isLowFloor = lowFloor;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "routeId='" + routeId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", tripHeadsign='" + tripHeadsign + '\'' +
                ", directionId='" + directionId + '\'' +
                ", blockId='" + blockId + '\'' +
                ", shapeId='" + shapeId + '\'' +
                ", isWheelchairAccessible=" + isWheelchairAccessible +
                ", isLowFloor=" + isLowFloor +
                ", id='" + id + '\'' +
                '}';
    }
}
