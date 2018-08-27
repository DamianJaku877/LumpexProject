package com.programming;

public class App 
{
    public static void main( String[] args )
    {
        SwitchAPI tvSwitchApi = new TvSwitch();
        SwitchAPI radioSwitchApi = new RadioSwitch();

        System.out.println("TvController: \n");
        final RemoteController tvRemoteController = new RemoteController(tvSwitchApi);

        tvRemoteController.turnON();
        tvRemoteController.turnOFF();

        System.out.println("\nRadioController: \n");
        final RemoteController radioRemoteController = new RemoteController(radioSwitchApi);

        radioRemoteController.turnON();
        radioRemoteController.turnOFF();
    }
}
