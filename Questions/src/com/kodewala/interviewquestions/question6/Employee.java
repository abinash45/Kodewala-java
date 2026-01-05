package com.kodewala.interviewquestions.question6;

public class Employee implements Attendance{

	@Override
	public void markAttendance() {
		System.out.println("Mark the student as present or absent");
		
	}

	@Override
	public void studentDetails() {
		System.out.println("Enter all the details of the student");
		
	}

}
