package com.kodewala.vehiclemanagementsystem;

public class Car extends Vehicle{
  Car (double speed){
	  super (speed);
  }

  @Override
  void calculateFuelEfficiency() {
	System.out.println("Car Fuel Efficiency : 15 km/l");
	
  }
  
}
