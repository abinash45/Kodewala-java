package com.kodewala.exceptions;

public class Driver3 {

	public static void main(String[] args) {

		// String name = null;

		// int length = name.length(); // NPE (Unchecked Exception)
System.out.println("Types of exceptions");
System.out.println("----------------------");
		// unchecked exceptions
		int totalMoney = 2000;
		int totalPersons = 0;
		try {
			System.out.println("This is the try block 1"
					+ " .");
			System.out.println("----------------------");
			int perPerson = totalMoney / totalPersons;
		} catch (ArithmeticException e) {
			System.out.println("Can not divide by 0");
		} // Arithmetic exception
			// Checked Exception
		try {
  System.out.println("This is the try block 2 .");
			Class.forName("com.kodewala.Driver4");
			System.out.println("Driver4 class loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found exception occured ");
		}
		
		finally {
			System.out.println("Above code is for checked and unchecked exceptions");
		}
	}
}
