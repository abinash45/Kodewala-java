package com.kodewala.functionalintefaces;

@FunctionalInterface

 interface FindOddOrEven {
	String checkNumber (int n);
}
public class Driver3 {

	public static void main(String[] args) {
		
FindOddOrEven oddOrEven = n -> (n % 2 == 0) ? "Even" :"Odd";
System.out.println(oddOrEven.checkNumber(10));
System.out.println(oddOrEven.checkNumber(29));
	}

}
