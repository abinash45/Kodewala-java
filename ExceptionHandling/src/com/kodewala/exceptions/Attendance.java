package com.kodewala.exceptions;

public class Attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[]attendance = {18,69,45};
			System.out.println(attendance[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Attendance data not available");
		}

	}

}
