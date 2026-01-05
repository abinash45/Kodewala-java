package com.kodewala.interfaces.multipleinheritance;

public class Iphone implements GamingService , InternetService , SmsService,Music,Transaction{

	@Override
	public void sendingSms() {
		System.out.println("We can send sms");
		
	}

	@Override
	public void browsingService() {
		System.out.println("We can use Internet for browsing purposes");
		
	}

	@Override
	public void playingGames() {
		System.out.println("We can play games ");
		
	}

	@Override
	public void BankingTransactions() {
		System.out.println("We can use for our banking transactions");
		
		
	}

	@Override
	public void listeningMusic() {
		System.out.println("We can listen music");
		
	}
	
	

}
