package com.kodewala.functionalintefaces;

@FunctionalInterface
interface StringLength {
	int getLength(String s);
}
public class Driver5 {

	public static void main(String[] args) {
		StringLength length = (s) -> s.length();
		String text = "Hello World";
		System.out.println("String :"+text);
		System.out.println("Length :"+length.getLength(text));
	}

}
