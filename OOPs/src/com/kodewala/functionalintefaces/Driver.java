package com.kodewala.functionalintefaces;

@FunctionalInterface
interface IAddNumbers {
	public abstract int doCalc (int a , int b);
}

public class Driver {

	public static void main(String[] args) {
		
		IAddNumbers addNumbers = (a,b) -> {
			int k =a+b;
			return k;
		};
		int result = addNumbers.doCalc (4,10);
		
		System.out.println( result);
		//Why we need ? 
		/*
		 * to be in the competative market
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}
	}


