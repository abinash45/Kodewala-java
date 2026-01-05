package com.kodewala.functionalintefaces;
@FunctionalInterface
interface DivisibleByFive{
	boolean check (int n);
}
public class Divisibilty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibleByFive d = (n)-> n % 5 == 0;
		System.out.println(d.check(59));
	}

}
