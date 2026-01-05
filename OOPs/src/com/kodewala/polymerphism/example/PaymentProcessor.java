package com.kodewala.polymerphism.example;

public class PaymentProcessor {
	public void processPayment(CoreBanking coreBanking)
	{
		coreBanking.doFundTransfer(); // SOLID
	}
}
