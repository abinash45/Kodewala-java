package com.kodewala.interviewquestions.question16;

public class Author implements Reader , Writer {

	@Override
	public void write() {
		System.out.println("Reading books");
		
	}

	@Override
	public void read() {
		System.out.println("Writing books");
		
	}

}
