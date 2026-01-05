package com.kodewala.exceptions;

public class Question5 {

	public static void main(String[] args) {
		try {
			
			int x = 10/0;
			
		}catch (Exception e) {
			System.out.println("Exception handeled");
		}
       System.out.println("Program continues");
	}

}
