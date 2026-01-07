package com.kodewala.exceptions;

public class LoginSystem {
	static void login(String username, String password) {
		if(!username.equals("admin") || !password.equals("1234")) {
			throw new IllegalArgumentException("invalid username or password");
		}
		System.out.println("Login successful");
	}

	public static void main(String[] args) {
	 try {	
login("admin","1239");
	}
	 catch (IllegalArgumentException e) {
		 System.out.println(e.getMessage());
	 }

}}
