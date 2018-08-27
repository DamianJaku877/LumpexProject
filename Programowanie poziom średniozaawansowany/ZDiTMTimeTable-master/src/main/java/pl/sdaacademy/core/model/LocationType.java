package pl.sdaacademy.core.model;

public enum LocationType {

    STOP(0),
    STATION(1),
    STATION_ENTRANCE_EXIT(2);

    private int type;

    LocationType(int type) {
        this.type = type;
    }
}
