package kom.kodewala.inheritance;

class Account {
	double balance;
	public Account (double balance) {
		this.balance = balance;
	}
	public void showBalance() {
		System.out.println("Account Balance :"+ balance);
	}
}
class SavingAccount extends Account{
	double interestRate;
	public SavingAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate =interestRate;
	}
	public void calculateInterest () {
		double interest = balance * interestRate / 100;
		System.out.println("Interest Earned:"+interest);
	}
}

public class BankSystem {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount (1000,5);
		sa.showBalance();
		sa.calculateInterest();

	}

}
