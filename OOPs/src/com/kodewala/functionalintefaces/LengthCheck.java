package com.kodewala.functionalintefaces;

@FunctionalInterface
interface Length {
	boolean check(String s);
}
public class LengthCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Length l = (s)-> s.length() >5 ;
System.out.println(l.check("Abinash"));
	}

}
