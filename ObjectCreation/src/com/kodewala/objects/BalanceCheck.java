package com.kodewala.objects;

public class BalanceCheck {

	public static void main(String[] args) {
		System.out.println("Checking balance of both people");
		System.out.println("--------------------------------");
       
		Abinash ab = new Abinash ();
		ab.details1();
		System.out.println("The amount of Abinash is " + ab.amount);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		
		Rohit r = new Rohit ();
		r.details2();	
		System.out.println("The amount of Rohit is " + r.amount);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
	}
}

class Abinash {
	int amount = 200;
	public void details1 () {
		System.out.println("Prinnting the balance of Abinash");		
	}
}

class Rohit {
	int amount = 300;
	public void details2 () {
		System.out.println("Printing the details of Rohit");
	}
}
