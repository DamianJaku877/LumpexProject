package com.jakubowski;

public class Room {
    int RoomNumber;
    int PersonNumber;
    boolean BathRoom;
    boolean availabilityRoom;

    public Room(int roomNumber, int personNumber, boolean bathRoom, boolean availabilityRoom) {
        RoomNumber = roomNumber;
        PersonNumber = personNumber;
        BathRoom = bathRoom;
        this.availabilityRoom = availabilityRoom;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public int getPersonNumber() {
        return PersonNumber;
    }

    public void setPersonNumber(int personNumber) {
        PersonNumber = personNumber;
    }

    public boolean isBathRoom() {
        return BathRoom;
    }

    public void setBathRoom(boolean bathRoom) {
        BathRoom = bathRoom;
    }

    public boolean isAvailabilityRoom() {
        return availabilityRoom;
    }

    public void setAvailabilityRoom(boolean availabilityRoom) {
        this.availabilityRoom = availabilityRoom;
    }
}
