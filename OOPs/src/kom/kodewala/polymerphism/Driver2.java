package kom.kodewala.polymerphism;


class BankPayment {
	void makePayment(double amount) {
		System.out.println("Paid ₹" + amount + " using Cash");
	}
	void makePayment (double amount ,String cardNumber) {
		System.out.println("Paid ₹" + amount + " using Card");
	}
	void makePayment (double amount , String upiID, boolean isUpi) {
		System.out.println("Paid ₹" + amount + " using UPI");
	}
}
public class Driver2 {
 public static void main (String [] args) {
	 BankPayment payment = new BankPayment ();
	 payment.makePayment(1000);
	 payment.makePayment(2000, "SBI1256");
	 payment.makePayment(9000, "IDFC9099", true);
 }
	
}
