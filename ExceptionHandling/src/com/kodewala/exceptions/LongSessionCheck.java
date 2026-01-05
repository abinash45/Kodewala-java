package com.kodewala.exceptions;

public class LongSessionCheck {

	public static void main(String[] args) {
		try {
			String sessionToken = null;
			System.out.println(sessionToken.equals("ACTIVE"));
		} catch (NullPointerException e) {
			System.out.println("Login session expired");
		}

	}

}
