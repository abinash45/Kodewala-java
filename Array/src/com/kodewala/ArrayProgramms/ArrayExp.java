package com.kodewala.ArrayProgramms;

public class ArrayExp {

	public static void main(String[] args) {
		int  productId [] = new int [5];// index from 0 to 4
		boolean p [] = new boolean [2];
     // add element in an array 
		/*productId [0] = 1001;
		productId [1] = 1002;
		productId [2] = 1003;
		productId [3] = 1004;
		productId [4] = 1005; */
		System.out.println (productId[0]);
		
		System.out.println (productId[1]);
		System.out.println (productId[2]);
		System.out.println (productId[3]);
		System.out.println (productId[4]); 
		//System.out.println (productId[5]); 
		//index out of bound exception
		
		for (int i=0; i<productId.length;i++) {
			System.out.println("Index no :"+i);
			System.out.println("Value in the index " + i + " is " + productId[i]);
			
		}
		}

}
// Develop a program to send notification to the customers who are having negative balance 
//sysout (negative balance)
//Customer :
//name , accountNo, email , balance 
//features to use Constructor loop array