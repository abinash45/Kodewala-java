package com.kodewala.interviewquestions.question12;

public class Driver {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
		v.stop();

		Vehicle b = new Bike();
		b.start();
		b.stop();
	}

}
/*
 * 
 * 
 * 
 * 
 * Default methods:
 * 
 * Have method bodies
 * 
 * Use the default keyword
 * 
 * They provide backward compatibility
 * 
 * Existing implementations continue to work without changes
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
