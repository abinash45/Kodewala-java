package encapsulation;

public class ATM {
	private double balance = 8900.00;
	private String pin = "8978";

	public void withdraw (double amountToWithdraw , String enteredPin) {
		System.out.println("Current balance "+ balance);
		if (enteredPin .equals(pin) && amountToWithdraw <= balance) {
			balance =balance - amountToWithdraw;
			System.out.println("baalance after withdraw"+ balance);
		}
		else {
			System.out.println("Invalid operations");
		}
	}
	
	public void deposit (double amountToDeposit , String enteredPin) {
		if (enteredPin.equals(pin)) {
			balance = balance +amountToDeposit;
			System.out.println("baalance after deposit"+ balance);
		}
		else {
			System.out.println("Invalid operations");
		}
	}
}
