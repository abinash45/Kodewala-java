package com.kodewala.exceptions;

public class Question2 {

	public static void main(String[] args) {
	try {
		int a =10;
		int b = 5;
		int c = a /b;
		System.out.println(c);
	}catch (ArithmeticException e) {
		System.out.println("Error");
	}

	}

}
