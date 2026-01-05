package com.kodewala.blocks;

public class Hotstar {
	static int userCount =0;
	
	Hotstar(){
		
	}
	Hotstar(String userType , String exp, String socialMedia , String geo){
		
	}
     
	Hotstar(String sourceType){
		
	}
	Hotstar (String userType , String exp){
		
	}
	Hotstar (String userType , String exp , String geo){
		
	}
	{
		userCount++;
	}
	public static void main (String args []) {
		
		Hotstar u1 = new Hotstar ();
		Hotstar u2 = new Hotstar ("TV");
		Hotstar u3 = new Hotstar ("paid", "10/12/2025");
		
		Hotstar u4 = new Hotstar();
		Hotstar u5 = new Hotstar();
		Hotstar u6 = new Hotstar("App");

		Hotstar u7 = new Hotstar("App");
		Hotstar u8 = new Hotstar();
		Hotstar u9 = new Hotstar("Paid", "28/11/2025");
		// HotStarUsers u10 = new HotStarUsers();

		Hotstar u10 = new Hotstar("Paid", "28/11/2025", "EU");
		Hotstar u11 = new Hotstar("Paid", "28/11/2026", "EU");
		Hotstar u12 = new Hotstar("Paid", "28/11/2026", "EU", "YT");
		
		System.out.println("no of users watching are :"+userCount);
	}
}
