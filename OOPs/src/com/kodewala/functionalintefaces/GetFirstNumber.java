package com.kodewala.functionalintefaces;
@FunctionalInterface
interface FirstChar{
	char getFirst (String s);
}
public class GetFirstNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FirstChar fc = (s) ->s.charAt(0);
     System.out.println(fc.getFirst("ABINASH"));
	}

}
