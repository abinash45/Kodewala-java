package com.kodewala.functionalintefaces;
@FunctionalInterface
interface DivisibleTest{
	void chekNumber (int n);
}
public class NumberDivisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibleTest dt = (n) -> {
			if (n%5 ==0) {
				System.out.println("Divisbile by 5");
			}
			else {
				System.out.println("Not divisible by 5");
			}
		};
		dt.chekNumber(5);
	}

}
