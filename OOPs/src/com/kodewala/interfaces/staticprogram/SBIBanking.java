package com.kodewala.interfaces.staticprogram;

public class SBIBanking implements IBanking{

	@Override
	public void doFundTransfer() {
		System.out.println("SBIBank.doFundTransfer()");		
	}
	void printPassBook() 
	{
		System.out.println("SBIBank.printPassBook()....500 lines");
	}
	@Override
	public void printDetails() {
		System.out.println("Printing the details of the bank");
		
	}
	
	void connectToprinter () {
		IBanking.printCkBook("Abinash", "12");
	}

}
