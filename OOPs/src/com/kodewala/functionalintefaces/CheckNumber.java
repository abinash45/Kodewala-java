package com.kodewala.functionalintefaces;


@FunctionalInterface
interface CheckNumberPositiveOrNegative {
	void check (int n);
}
public class CheckNumber {

	public static void main(String[] args) {
		CheckNumberPositiveOrNegative cn = (n) -> {
			if (n >=0) {
				System.out.println("Positive Number");
			}
			else {
				System.out.println("Negavtie");
			}
		};
		cn.check(-8);

	}

}
