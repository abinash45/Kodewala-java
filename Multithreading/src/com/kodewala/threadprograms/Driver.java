package com.kodewala.threadprograms;

class Account {
	int balance = 2000;

	public void doDebit(int amount) throws InterruptedException {
		balance = balance - amount;
		System.out.println("The thread is "+ Thread.currentThread().getName());
		
	}
	public void doCredit(int amount) {
		balance = balance + amount;
		System.out.println("The thread is "+ Thread.currentThread().getName());
	}
}

class Debit extends Thread {
	Account account;

	public Debit() {
		
	}
}

public class Driver {

	public static void main(String[] args) {
		

	}

}
