package com.kodewala.interviewquestions.question12;

public interface Vehicle {
	void start ();

	default void stop () {
		System.out.println("Vehicle Stopped");
	}
}
