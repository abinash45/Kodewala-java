package com.kodewala.loop;

public class DoWhile {

	public static void main(String[] args) {
	
		int retryCount = 1;
		
		do {
		 System.out.println("Password reset attempt : "+ retryCount);
			
		}
		while (retryCount <=3);//put semicolon

	}

}
