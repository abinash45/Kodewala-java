package com.kodewala.string;

public class StringExp2 {

	public static void main(String[] args) {
		String s1 = "Kodewala";		
		String s2 = "kodewala";
		String s8 = " Academy";
		
		String s7 = s1 + s8 ;//It will stored in heap  , it uses String builder .
		//String s7 = new String (s1+s8) :- 4 objects here in this line 
		//String s5 = "Hello" + "kodewala" it will be creating only 1 object in scp (Compile time optimization) exception case
		String s9 = s1 + "Abinash";// Only one objce that too in heap
		String s3 = new String ("Kodewala");
		String s4 = new String ("Kodewala");
		
		System.out.println("checking "+ (s3==s4));
		String s5="BTM";
		//s5.concat(" 2nd stage");
		//concat objct is printing in heap
		//String s6 = s5;
		//s5 = s5.concat("Banglore") :- now it will print the concatinate value
		String s6 = s5.concat(" Banglore"); 
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
	}

}
