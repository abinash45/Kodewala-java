package com.kodewala.string;

public class ClassWork {

	public static void main(String[] args) {
		
		String str1 = "Java" ;
		String str2 = new String ("Java");
		String str3 = str2.intern();
		String str4 = "Java";
		String str5 = new String ("Js").intern();
		
		System.out.println("Checking for str1 == str2 :" + (str1 == str2));
		System.out.println("Checking for str3 == str4 :" + (str3 == str4));
		System.out.println("Checking for str5 == Js :" + (str5 == "Js"));
		

	}
	

}
