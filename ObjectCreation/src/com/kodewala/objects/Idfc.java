package com.kodewala.objects;

public class Idfc {

	public static void main(String[] args) {
		
		ReserveBank rbi = new ReserveBank();
		
		rbi.transferAmount();
		
		System.out.println("amount get :" +rbi.amount);

	}

}

class ReserveBank {
	int amount = 20000;
	
	public void transferAmount() {
	System.out.println("transfered to idfc");
}
}