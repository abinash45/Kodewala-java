package com.kodewala.interfaces.staticprogram;

public class Driver {

	public static void main(String[] args) {
		
		KotakBank kb = new KotakBank();
		kb.doFundTransfer();
		
		SBIBanking sb = new SBIBanking();
		sb.doFundTransfer();
		//sb.printPassBook();
		kb.printPassBook();
		sb.printDetails();
	   kb.user();
	   //sb.connectToprinter();
	   sb.connectToprinter();
	}

}
