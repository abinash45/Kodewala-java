package com.kodewala.exceptions;

public class FinallyExp {

	static int test () {
		try {
			
			return 10;
		}
		finally {
			return 20;
		}
	}
	public static void main(String[] args) {
		System.out.println(test());		
	}
}
