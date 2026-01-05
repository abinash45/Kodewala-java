package com.kodewala.functionalintefaces;

@FunctionalInterface
interface Cube {
	int FindCube (int n);
}
public class CubeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Cube cb = (n) -> n*n*n;
  System.out.println(cb.FindCube(90));
	}

}
