package com.kodewala.exceptions;

public class StudentsMark {

	public static void main(String[] args) {
	
		try {
			int totalMark = 100;
			int numberOfStudent = 0;
			int avgMarks = totalMark / numberOfStudent;
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Cant divide by 0");
		}
		
	
		
	}

}
