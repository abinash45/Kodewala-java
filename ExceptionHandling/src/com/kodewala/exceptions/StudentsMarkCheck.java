package com.kodewala.exceptions;

public class StudentsMarkCheck {

	public static void main(String[] args) {
		try {
			int[] marks = {78,89,67};
			System.out.println(marks[10]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Marks not found for given roll number");
		}

	}

}
