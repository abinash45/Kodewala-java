package com.kodewala.vehiclemanagementsystem;

public class Truck extends Vehicle {
   Truck (double speed){
	   super(speed);
   }

   @Override
   void calculateFuelEfficiency() {
	   System.out.println("Truck Fuel Efficiency: 6 km/l");
	
   }
   
}
