package com.kodewala.interviewquestions.question13;

public class Driver {

	public static void main(String[] args) {
		UtilityService.logMessages("Application started");
		UtilityService.logMessages("Processing");
	}

}

/*
 * 
 * UtilityService ut = new UtilityService (); ut.log("Message");
 * 
 * Interface can not be instantiated cannot call static method via object.
 * 
 * Static methods in an interface belong to the interface, cannot be overridden,
 * and must be called using the interface name, whereas default methods are
 * inherited and can be overridden by implementing classes.
 * 
 * 
 * 
 * 
 */