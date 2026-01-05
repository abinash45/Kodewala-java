package com.kodewala.constructor;

public class IdfcBank {
	
	String details;
	
	public IdfcBank() {
		this("We have 34k users");
	}
	
     
	public IdfcBank (String _details) {
		System.out.println(_details);
	}
	
	
	
	public static void main(String[] args) {
		IdfcBank idfc = new IdfcBank ();
         
		
		
		
	}

}
