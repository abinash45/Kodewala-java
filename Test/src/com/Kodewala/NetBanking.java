package com.Kodewala;

public class NetBanking {
	String name;
	int id;

	NetBanking(String name, int id) {
		this.name = name;
		this.id = id;
	}

	void FundTarnsfer() {
		System.out.println("20000 transfered through netbanking");
	}
}

class Driver {

	public static void main(String[] args) {
		NetBanking nb1 = new NetBanking ("Abinash", 78); 
		NetBanking nb2 = new NetBanking ("Rohit", 88);
		nb1.FundTarnsfer();
		nb1=null;//best practice
		nb2.FundTarnsfer();
		//system.gc never put this line 
	}

}
