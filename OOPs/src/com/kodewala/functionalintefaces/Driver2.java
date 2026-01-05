package com.kodewala.functionalintefaces;
@FunctionalInterface 
interface StringToUppercase {
	String convertToUpper (String input); 
 }
public class Driver2 {
	public static void main(String[] args) {
	StringToUppercase upper = s->s.toUpperCase();
	String text = "Hello worldd";
	String result = upper.convertToUpper(text);
	System.out.println("Original:"+text);
	System.out.println("Uppercase:"+result);
		

	}

}
