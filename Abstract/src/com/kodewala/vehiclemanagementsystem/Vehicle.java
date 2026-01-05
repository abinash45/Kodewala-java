package com.kodewala.vehiclemanagementsystem;

abstract class Vehicle {
	double speed;
	Vehicle (double speed){
		this.speed = speed;
	}
	abstract void calculateFuelEfficiency ();
	void displaySpeed() {
		System.out.println("Vehicle speed:"+ speed+ "km/h");
	}

}
