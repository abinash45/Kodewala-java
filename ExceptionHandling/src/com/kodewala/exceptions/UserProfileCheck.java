package com.kodewala.exceptions;

public class UserProfileCheck {

	public static void main(String[] args) {
		try {
			String userName = null;
			System.out.println(userName.length());
		} catch (NullPointerException e) {
			System.out.println("User profile not loaded");
		}

	}

}
