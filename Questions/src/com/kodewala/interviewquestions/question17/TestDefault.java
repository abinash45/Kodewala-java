package com.kodewala.interviewquestions.question17;

public class TestDefault implements TestA1, TestB1{

	@Override
	public void show() {
		
		//TestA1.super.show();
		TestB1.super.show();
	}
	
	public static void main (String args[]) {
		TestDefault t = new TestDefault ();
		t.show();
	}

}
