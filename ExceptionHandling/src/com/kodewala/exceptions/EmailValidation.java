package com.kodewala.exceptions;

public class EmailValidation {

	public static void main(String[] args) {
		try {
			String email = null;
			System.out.println(email.toLowerCase());
		}catch (NullPointerException e) {
			System.out.println("Email address is missing");
			
		}

	}

}
