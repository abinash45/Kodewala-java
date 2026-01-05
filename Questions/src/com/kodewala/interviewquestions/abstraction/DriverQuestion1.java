package com.kodewala.interviewquestions.abstraction;

abstract class Vehicle {
	/*
	 * Acts as a blueprint
       Cannot be instantiated
       Defines common behavior
	 * 
	 */
	 public abstract void start();
	 /*
	  * Tells what must be done
          Does not define how
	  * 
	  */
	 
	}


class Car extends Vehicle {
	//Concrete Classes 
	@Override
	public void start() {
		System.out.println("Car Starts with key");
	}
	
}

class Bike extends Vehicle {
	@Override 
	public void start () {
		System.out.println("Bike starts with kick");
	}
}
public class DriverQuestion1 {

	public static void main(String[] args) {
		Vehicle vehicle;
		vehicle = new Car ();
		vehicle.start();
		
		vehicle = new Bike ();
		vehicle.start();
	}

}
/*
1.What is abstraction in Java? How is it implemented?

Abstraction in Java is the process of hiding implementation details and showing only essential features.

Abstraction is implemented using:
Abstract classes
Abstract methods
Interfaces

2.What is an abstract class? How is it different from an interface?

An abstract class is a partially implemented blueprint in Java.
It defines common behavior for related classes but 
leaves some parts unfinished, which subclasses must complete.

-We can not create the object of an abstract class.
-It can have abstract methods (without body)
-concreate methods (with body)
-variables and constructors

What is an Interface?

An interface in Java is a rule book that tells a class what it must do, but not how it should do it.
It contains only method declarations (no implementation).
Any class that implements an interface must follow all its rules.
Unrelated classes can follow the same interface.
A class can implement multiple interfaces.


contract based application ,other will be implementing , what need to be done











*/