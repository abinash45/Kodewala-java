package com.kodewala.functionalintefaces;
@FunctionalInterface
interface ConverttoLower{
	String convertlower(String s);
}
public class StringToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConverttoLower s1 = (s) -> s.toLowerCase();
		System.out.println(s1.convertlower("ABINASH"));
	}

}
