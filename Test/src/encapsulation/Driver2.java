package encapsulation;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ATM atm = new ATM ();
		//atm.balance = 12900; //not allowed directly as it is private 
		atm.deposit(378888, "8978");
		atm.withdraw(567777, "8989");

	}

}
