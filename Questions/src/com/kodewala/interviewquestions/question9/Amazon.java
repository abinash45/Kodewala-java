package com.kodewala.interviewquestions.question9;

public class Amazon implements Order , OnlineOrder{

	public static void main(String[] args) {
       Amazon a = new Amazon();
       a.placeOrder();
       a.trackOrder();

	}

	@Override
	public void trackOrder() {
		System.out.println("Ordr shipped");
		
	}

	@Override
	public void placeOrder() {
		System.out.println("Order placed");
		
	}

}
