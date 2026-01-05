package com.kodewala.exceptions;

public class Question3 {

	public static void main(String[] args) {
		try {
			System.out.println("Try");
			int arr [] = new int [2];
			arr[5]= 100;
		}
		catch(ArrayIndexOutOfBoundsException e){
		  
			System.out.println("Catch");
		}
		System.out.println("After");

	}

}
