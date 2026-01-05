package com.kodewala.constructor;

public class Reservebank {
	int amount;
	String accNo;
	String ifsc;

	
	public Reservebank () {
		System.out.println("welcome to reservebank ");
		System.out.println("-------------------------");
	}
	
	public Reservebank(int _amount , String _accNo , String _ifsc) {
		this.amount = _amount;
		this.accNo  = _accNo;
		this.ifsc   =_ifsc;
	}
	
	public void printDetails () {
		 System.out.println("Amount: " + amount);
		    System.out.println("AccNo: " + accNo);
		    System.out.println("IFSC: " + ifsc);
		    System.out.println("-------------------------");
	}
	
	public static void main(String[] args) {
		
		Reservebank rbi = new Reservebank ();
		
		Reservebank rbi1 = new Reservebank (100 , "2140104071","SBIN001");
		Reservebank rbi2 = new Reservebank (101 , "2140104072","SBIN002");
		
	//System.out.println(rbi.Reservebank());
		rbi1.printDetails ();
		rbi2.printDetails ();
		

	}

}
