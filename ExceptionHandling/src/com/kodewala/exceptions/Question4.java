package com.kodewala.exceptions;

public class Question4 {

	public static void main(String[] args) {
	try {
		String s = null;
		System.out.println("Try block");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Catch block");
	}
	System.out.println("After");

	}

}
