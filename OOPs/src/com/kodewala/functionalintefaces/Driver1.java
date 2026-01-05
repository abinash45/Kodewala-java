package com.kodewala.functionalintefaces;

@FunctionalInterface
	interface FindMaximum  {
		public abstract int findMax(int a, int b);
	}
public class Driver1 {

	public static void main(String[] args) {
		FindMaximum max = (a,b) -> (a > b) ? a : b;
		//FindMaximum max = (a, b) -> (a > b) ? a : b;

		System.out.println(max.findMax(10,20));
	}

}
