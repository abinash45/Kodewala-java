package com.kodewala.exceptions;

public class Question1 {

	public static void main(String[] args) {
		try {
			System.out.println("This is the 1st part");	
			int x = 10/0;
			System.out.println("This is the 2nd part");
		} catch (ArithmeticException e) {
			System.out.println("This is the 3rd part");
		}
		System.out.println("This is the 4th part");

	}

}
