package com.kodewala.interviewquestions.question11;

public interface Course {
	default void startCourse () {
		System.out.println("Course Started with staandard introduction");
	}
	void completeCourse ();

}
