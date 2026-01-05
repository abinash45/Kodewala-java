package com.kodewala.smarthomeappliancesystem;

public class AirConditioner extends Appliance{

	AirConditioner() {
		super("Air Conditioner");
		
	}

	@Override
	void turnOn() {
		isOn = true;
		System.out.println("Air conditioner cooling the room");
		
		
	}

	@Override
	void turnOff() {
		isOn = false;
		System.out.println("Air Conditioner turened off");
		
	}
	
 
}
