package com.kodewala.interviewquestions.question10;

public class SmartCar implements CarFeatures {

	@Override
	public void navigate() {
		System.out.println("GPS navigation started");
		
	}

	@Override
	public void connect() {
		System.out.println("Bluetooth Connected");
		
	}

	@Override
	public void drive() {
		System.out.println("Car is driving");
		
	}
	

}
