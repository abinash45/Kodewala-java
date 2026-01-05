package com.kodewala.interfaces.multipleinheritance;

public interface Transaction {
	public abstract void BankingTransactions ();
	 // public abstract void stopTransactions ();
	
	public default void stopTransactions() {
		System.out.println("Stop the transactions.");
	}

}
