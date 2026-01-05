package com.kodewala.functionalintefaces;

@FunctionalInterface
interface Square {
	void findSquare (int n);
}
public class Driver7 {

	public static void main(String[] args) {
		Square sq = (n) ->{
		 int k = n*n;
		// return k ;
		 System.out.println(k);
		};
		sq.findSquare(5);

	}

}
