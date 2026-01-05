package com.kodewala.gfg;

public class PalindromeNumber {
public boolean isPalindrome (int n) {
	int original = n;
	int rev =0;
	while (n !=0) {
		rev = rev *10+(n %10);
	}
	return original == rev;
}
	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber ();
		System.out.println(pn.isPalindrome(898));

	}

}
