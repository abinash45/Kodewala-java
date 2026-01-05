package com.kodewala.interviewquestions.question18;

public interface Greeting {
	default void sayHello () {
		System.out.println("Hello!");
	}

}
