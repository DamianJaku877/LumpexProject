package com.java1;

public class Room {
    private int numberRoom;
    private int numberBed;
    private boolean availability;
    private boolean clearRoom;
    private boolean bathroom;
    private double surface;

    public static class Builder {
        private int numberRoom;
        private int numberBed;
        private boolean availability;
        private boolean clearRoom;
        private boolean bathroom;
        private double surface;

        public Builder(int numberRoom, double surface) {
            this.numberRoom = numberRoom;
            this.surface = surface;
        }

        public Builder numberRoom(int numberRoom){
            this.numberRoom = numberRoom;
            return this;
        }

        public Builder numberBed(int numberBed){
            this.numberBed = numberBed;
            return this;
        }

        public Builder availability(boolean availability){
            this.availability = availability;
            return this;
        }
        public Builder clearRoom(boolean clearRoom){
            this.clearRoom = clearRoom;
            return this;
        }
        public Builder bathroom(boolean bathroom){
            this.bathroom = bathroom;
            return this;
        }
        public Builder surface(double surface){
            this.surface = Math.floor(surface);
            return this;
        }
        public Room build(){
            return new Room(this);
        }
    }

    private Room(Builder builder){
        numberRoom = builder.numberRoom;
        numberBed = builder.numberBed;
        availability = builder.availability;
        clearRoom = builder.clearRoom;
        bathroom = builder.bathroom;
        surface = builder.surface;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberRoom=" + numberRoom +
                ", numberBed=" + numberBed +
                ", availability=" + availability +
                ", clearRoom=" + clearRoom +
                ", bathroom=" + bathroom +
                ", surface=" + surface +
                '}';
    }
}
