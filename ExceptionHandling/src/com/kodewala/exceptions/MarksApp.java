package com.kodewala.exceptions;

public class MarksApp {

	public static void main(String[] args) {
		try {
			int totalMarks = 600;
			int students = 0;
			
			int average = totalMarks / students ;
			System.out.println("Average:"+ average);
		}
		catch (ArithmeticException | NullPointerException e) {
			System.out.println("Error : Students count cannot be zero or null");
		}

	}

}
