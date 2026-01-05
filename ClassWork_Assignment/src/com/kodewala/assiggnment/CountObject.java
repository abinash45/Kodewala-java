package com.kodewala.assiggnment;

public class CountObject {
  
	static int count = 0;
	CountObject(){
		count++;
		//System.out.println("This is object no  :"+count);
	}
	public static void main(String[] args) {
		
		CountObject co = new CountObject ();
		CountObject co1 = new CountObject ();
		CountObject co2 = new CountObject ();
		
		System.out.println("Total no of objects are   :"+count);
	}

}
