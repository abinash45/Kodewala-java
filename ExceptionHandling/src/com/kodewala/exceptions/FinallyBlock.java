package com.kodewala.exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		int amount = 90;
		int persons = 0;
		int users = 0;
		
		
		try {
			System.out.println("inside try1");
			int eachAmount = amount / persons;
		}
		
		catch (ArithmeticException e) {
			System.out.println("Inside catch 1");
		} 
		finally {
			
			try {
				amount = amount / users;
			
				
			}

			catch (ArithmeticException e) {
				System.out.println("The persons value cant be 0");

			}
			
			System.out.println("this block will always execute .");
		}

	}

}
