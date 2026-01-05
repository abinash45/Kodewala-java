package com.kodewala.interfaces.staticprogram;

public class KotakBank implements IBanking {

	@Override
	public void doFundTransfer() {
		
		
	}
	public void printPassBook() {
		IBanking.printPassBook("Odisha", "12");
	}
	@Override
	public void printDetails() {
			
	}
  public void user() {
	  IBanking.userDetails("Abinash", 21);
  }
}
