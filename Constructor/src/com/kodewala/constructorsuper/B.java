package com.kodewala.constructorsuper;

public class B extends A{
	
	B(){
		super ();
			System.out.println("Child B Constructor");
		
	}
	public static void main (String args []) {
		B b = new B ();
	}

}
