package com.kodewala.exceptions;

public class TestThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	  int age = 15;
	  if (age < 18) {
		  throw new ArithmeticException ("not eligible to vote ");
	  }
  }
  catch (ArithmeticException e){
	  System.out.println(e.getMessage());
  }
	}

}
