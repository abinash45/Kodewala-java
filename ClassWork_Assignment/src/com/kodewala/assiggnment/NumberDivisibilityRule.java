//import java.util.*;
package com.kodewala.assiggnment;
import  java.util.*;
public class NumberDivisibilityRule {
	public static void main(String[] args) {
	 //static int num = 90;
	Scanner sc = new Scanner (System.in);
	//System.out.println("Enter the number :");
	//static int num;
	 //num = sc.nextInt();
	System.out.println("Enter the num :");
	int num = sc.nextInt();

	 
	//public static void main(String[] args) {
		 if (num % 3 == 0 && num % 5 == 0 ) {
			  System.out.println("Number is divisible by both");
		  }
		 
		 else {
			 System.out.println("Number is not divisible by both");
		 }
		 

	}

}
