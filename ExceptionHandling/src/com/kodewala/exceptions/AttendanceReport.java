package com.kodewala.exceptions;

public class AttendanceReport {

	public static void main(String[] args) {
	 try {
		 int [] attendance = {18,45,69};
		 System.out.println(attendance[5]);
	 }catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("Employee record not found");
	 }

	}

}
