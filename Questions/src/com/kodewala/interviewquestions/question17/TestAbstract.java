package com.kodewala.interviewquestions.question17;

public class TestAbstract implements TestA, TestB{
 
	public static void main(String[] args) {
		TestAbstract t = new TestAbstract ();
		t.show();
	}

	@Override
	public void show() {
		System.out.println("Single implementation for both interfcaes");
		
	}

}
