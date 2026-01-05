package com.kodewala.exceptions;

public class BankAccountCheck {

	public static void main(String[] args) {
		
		try {
			String accountHolderName = null;
			System.out.println(accountHolderName.toUpperCase());
		} catch (NullPointerException e) {
			System.out.print("Account holder details not available");
		}

	}

}
