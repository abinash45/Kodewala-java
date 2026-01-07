package com.kodewala.exceptions;

public class AmazonUserDetails {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int amount = 500;
		int numberOfProducts = 0;
		String userName = null;
		try {
		int eachValue = amount / numberOfProducts;
			userName.length();

		} 
			//System.out.println("Operations on null");
		//}
		//catch (NullPointerException e) {
			//System.out.println("Null Pointer Exception occured ");
		//}
		
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occured ");
		}

		catch (NullPointerException e) {
			System.out.println("Null Pointer Exception occured ");
		}
		
		catch (Exception e) {
			System.out.println("Exception occured ");
		}
		System.out.println("Exit from the code ");
	}

}
