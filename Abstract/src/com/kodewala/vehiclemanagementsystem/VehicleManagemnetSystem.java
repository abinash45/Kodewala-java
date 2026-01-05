package com.kodewala.vehiclemanagementsystem;

public class VehicleManagemnetSystem {

	public static void main(String[] args) {
		Vehicle car = new Car (120);
		car.displaySpeed();
		car.calculateFuelEfficiency();
		System.out.println("--------");

		Vehicle truck = new Truck (80);
		truck.displaySpeed();
		truck.calculateFuelEfficiency();
	}

}
