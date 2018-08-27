package com.programming;

public class RemoteController {

    private final SwitchAPI switchAPI;


    public RemoteController(SwitchAPI switchAPI) {
        this.switchAPI = switchAPI;
    }

    public void turnON(){
        this.switchAPI.turnOn();
    }

    public void turnOFF(){
        this.switchAPI.turnOff();
    }
}
