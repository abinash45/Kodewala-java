package com.kodewala.functionalintefaces;
@FunctionalInterface

interface PalindromeCheck {
	void check(String s);
}

public class Driver6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  PalindromeCheck pc = (s) ->{
	  String rev = " ";
	  for(int i = s.length() - 1 ; i >=0;i--) {
		  rev = rev +s.charAt(i);
	  }
	  if(s.equals(rev)) {
		  System.out.println(s +" is Palindrome");
	  }
	  else {
		  System.out.println(s + " is not palindrome");
	  }
  };
  pc.check("Abinash");
  pc.check("Madam");
	}

}
