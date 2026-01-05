package com.kodewala.smarthomeappliancesystem;

public class SmartHomeSystem {

	public static void main(String[] args) {
		Appliance wm = new WashingMachine ();
		wm.turnOn();
        wm.showStatus();
        wm.turnOff();
        wm.showStatus();
        
        System.out.println();

        Appliance ac = new AirConditioner();
        ac.turnOn();
        ac.showStatus();
        ac.turnOff();
        ac.showStatus();

	}

}
