package kom.kodewala.inheritance;

class StateBank {
	String location;
	String paymentType;
	double amount;
	String userAccountNo;
	String destinationAccount;

	StateBank(String location, String paymentType, double amount, String userAccountNo, String destinationAccount) {

		this.location = location;
		this.paymentType = paymentType;
		this.amount = amount;
		this.userAccountNo = userAccountNo;
		this.destinationAccount = destinationAccount;
	}

	public void processPayment() {
		System.out.println("The account no of the user is: " + userAccountNo + ". " + "The receiver account no is: "
				+ destinationAccount + ". " + "Amount transferred is: " + amount + ". " + "Type of payment is: "
				+ paymentType + ". " + "The location of the account holder bank is: " + location);
	}
}

public class PaymentGateway extends StateBank {

	PaymentGateway(String location, String paymentType, double amount, String userAccountNo,
			String destinationAccount) {

		super(location, paymentType, amount, userAccountNo, destinationAccount);
	}

	public static void main(String[] args) {

		StateBank sb = new StateBank("Bhubaneswar", "NetBanking", 60000.00, "SBI786", "SBI678");

		sb.processPayment();
	}
}
