package com.kodewala.gfg;

public class ReverseNumber {
	public int reverseNumber (int n) {
		int rev =0;
		while (n !=0) {
			rev = rev * 10 +(n % 10);
			n = n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		ReverseNumber rn = new ReverseNumber ();
		System.out.println(rn.reverseNumber(12390));

	}

}
