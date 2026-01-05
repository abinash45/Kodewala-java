package com.kodewala.functionalintefaces;

@FunctionalInterface
interface SquareNumber {
	int findSquare (int n);
}
public class Driver8 {

	public static void main(String[] args) {
	SquareNumber sq = (n) -> n*n;
	
	System.out.println(sq.findSquare(6));

	}

}
