package com.kodewala.exceptions;

class InvalidMarksException extends Exception {
	public InvalidMarksException (String message) {
		super (message);
	}
}



class Student {
	int totalMarks = 100;
	
	void calculateResult (int obtainMarks ) throws InvalidMarksException  {
		if (obtainMarks < 0 || obtainMarks  > totalMarks) {
			 throw new InvalidMarksException ("Marks must be between 0 and 100"); 
	}
		System.out.println("Marks entered: " + obtainMarks);
		 System.out.println("Result calculated successfully!");
}
}
public class StudentApp {

	public static void main(String[] args) {
		
		 Student student = new Student();

	        try {
	            student.calculateResult(150);   // Will cause exception
	        }
	        catch (InvalidMarksException e) {
	            System.out.println("Error: " + e.getMessage());
	}

}
}
