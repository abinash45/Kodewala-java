package encapsulation;

public class Driver {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount (90000);
		acc.deposit(8900);
		System.out.println("After deposite the balance is "+acc.getBalance());
		acc.withdraw(7890);
		System.out.println(acc.getBalance());
	}

}
