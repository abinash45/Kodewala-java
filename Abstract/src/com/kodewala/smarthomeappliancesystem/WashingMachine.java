package com.kodewala.smarthomeappliancesystem;

public class WashingMachine extends Appliance {
	WashingMachine(){
		super("Washing Machine");
	}

	@Override
	void turnOn() {
		isOn = true;
		System.out.println("Washing Machine started washing clothes");
		
	}

	@Override
	void turnOff() {
		isOn = false;
		System.out.println("Washing machine stooped");
		
	}

}
