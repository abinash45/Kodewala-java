package encapsulation;
// code for encapsulation
public class BankAccount {
	private double balance;
 public BankAccount (double balance) {
	 this.balance = balance;
 }
 public double getBalance () {
	 return balance;
 }
 
 public void deposit (double amount) {
	 if (amount > 0) {
		 balance = balance + amount;
	 }
	 else {
		 System.out.println("Invalid amount");
	 }
 }
 
 public void withdraw (double amount) {
	 if (amount > 0 && amount <= balance) {
		 balance = balance - amount;
		 System.out.println("Withdrawn amount"+amount);
	 }
	 else {
		 System.out.println("Insufficient funds or invalid amount");
	 }
 }

}
