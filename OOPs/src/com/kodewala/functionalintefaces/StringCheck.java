package com.kodewala.functionalintefaces;

@FunctionalInterface
interface CheckString {
	boolean check(String s);
}

public class StringCheck {

	public static void main(String[] args) {
		CheckString cs = (s) -> {
			if (s.isEmpty()) {
				// System.out.println("TRUE");
				return true;
			} else {
				// System.out.println("FALSE")
				return false;
			}
		};
	System.out.println	(cs.check(""));
	}

}
