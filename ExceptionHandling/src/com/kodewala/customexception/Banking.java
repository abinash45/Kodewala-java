package com.kodewala.customexception;

public class Banking {
	int balance = 9000;
	public void fundTransfer(int amount) throws InsufficientBalanceException {
		if (balance > amount) {
		//	fundTransfer
		}
	}

}
