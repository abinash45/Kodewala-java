package com.kodewala.exceptions;

public class SeatBookingCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] seats = new int [30];
			seats[30] = 1;
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("invalid seat number selected");
		}

	}

}
