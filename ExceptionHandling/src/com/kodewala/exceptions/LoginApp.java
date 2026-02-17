package com.kodewala.exceptions;

public class LoginApp {

	public static void main(String[] args) {
		try {
			String [] users = { "admin","user1" };
			String password = null;
			System.out.println(users[5]);
			System.out.println(password.length());
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Login error :Invalid user data");
		}
	}

}
