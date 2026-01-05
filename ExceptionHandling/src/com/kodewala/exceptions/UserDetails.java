package com.kodewala.exceptions;

public class UserDetails {
	public static void main (String args []) {
		
		try {
		String userName= args[0];
		int age = Integer.parseInt(args[1]);
		double salary = Double.parseDouble(args[2]);
		
		System.out.println("User's Name :"+userName);
		System.out.println("User's age:"+age);
		System.out.println("User's salary:"+salary);
		
		}
		catch (Exception e){
			System.out.println("User's Name is :");
			System.out.println("User's age:");
			System.out.println("User's salary:");
		}
	}

}
