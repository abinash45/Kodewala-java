package com.kodewala.exceptions;

public class Question6 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside try");
			throw new ArithmeticException ();
		}catch (ArithmeticException e) {
			System.out.println("Inside catch");
		}

	}

}
