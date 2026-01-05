package com.kodewala.gfg;

//Count the digits of a number

public class DigitsOfNumber {
	
     public int countDigit(int n) {
    	 if (n == 0) {
    		 return 1;
    	 }
    	 int count =0;
    	 while (n !=0) {
    		 count++;
    		 n= n/10;
    	 }
    	 return count;
     }
	public static void main(String[] args) {
		DigitsOfNumber s = new DigitsOfNumber ();
		System.out.println(s.countDigit(2389));

	}

}
