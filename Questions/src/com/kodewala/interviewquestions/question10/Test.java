package com.kodewala.interviewquestions.question10;

public class Test {

	public static void main(String[] args) {
		CarFeatures car = new SmartCar ();
		car.connect();
		car.drive();
		car.navigate();
		
		System.out.println("=====================");
		SmartCar car1 = new SmartCar ();
		car.connect();
		car.drive();
		car.navigate();
		
	}

}
