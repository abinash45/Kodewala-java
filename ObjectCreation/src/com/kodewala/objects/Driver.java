package com.kodewala.objects;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account ();
		acc.showAcoountDetails();
		System.out.println(acc.amount);
		
		
		//acc.details();
	//	System.out.println(acc.users);

	}
}

class Account {
	int amount = 56;
	
	public void showAcoountDetails () {
		System.out.println("Showing account details");
	}
}

class Bank {
	int users = 349;
	public void details () {
		System.out.println ("Total users in the bank is:"+ users);
		
	}
	
}