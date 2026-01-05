package com.kodewala.hierarchicalinheritance;

public class Driver {

	public static void main(String[] args) {
		
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
	
		
		v1.fuelType();
		v2.fuelType();
	}

}

