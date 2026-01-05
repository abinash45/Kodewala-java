package com.kodewala.interviewquestions.question8;

abstract class CashPayment implements Payment {
	public void pay() {
		System.out.println("Payment done using cash");
	}
}
// when i write only void pay () its showing error 
/*
 * 
 * Interface methods are implicitly public, so while implementing them, the
 * method must be declared public; otherwise, Java throws an access-level
 * compilation error. Interface methods are public by default but while
 * implementing them we cannot reduce visibility
 * 
 * public → default (no modifier)
 * 
 * This is not allowed in Java
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */