package pl.sdaacademy.core.model;

public enum PickupType {

    REGULAR(0),
    NO(1),
    PHONE_AGENCY_COORDINATION(2),
    DRIVER_COORDINATION(3);

    private int type;

    PickupType(int type) {
        this.type = type;
    }
}
