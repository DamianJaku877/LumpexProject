package pl.sdaacademy.core.model;

public enum DropOffType {

    REGULAR(0),
    NO(1),
    PHONE_AGENCY_COORDINATION(2),
    DRIVER_COORDINATION(3);

    private int type;

    DropOffType(int type) {
        this.type = type;
    }
}
