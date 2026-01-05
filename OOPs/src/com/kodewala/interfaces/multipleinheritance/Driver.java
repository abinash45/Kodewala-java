package com.kodewala.interfaces.multipleinheritance;

public class Driver {

	public static void main(String[] args) {
		Iphone ip = new Iphone ();
		ip.browsingService();
		ip.playingGames();
		ip.sendingSms();
		ip.stopTransactions();
		//public void  print() {
		//Imessage.super.print();
		//}

	}

}
