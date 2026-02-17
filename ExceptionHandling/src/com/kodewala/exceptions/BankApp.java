package com.kodewala.exceptions;

//1️⃣ Custom Exception Class
class InsufficientBalanceException extends Exception {

 public InsufficientBalanceException(String message) {
     super(message);   // Pass message to parent Exception class
 }
}

//2️⃣ Bank Account Class
class SBI {

 int balance = 3000;

 
 void withdraw(int amount) throws InsufficientBalanceException {

     if (balance - amount < 1000) {
         throw new InsufficientBalanceException(
             "Minimum balance of 1000 must be maintained!"
         );
     }

     balance -= amount;
     System.out.println("Withdrawal successful!");
     System.out.println("Remaining balance: " + balance);
 }
}

//3️⃣ Main Class (Only this should be public)
public class BankApp {

 public static void main(String[] args) {

     SBI account = new SBI();

     try {
         account.withdraw(2500);   // Will cause exception
     } 
     catch (InsufficientBalanceException e) {
         System.out.println("Transaction Failed: " + e.getMessage());
     }
 }
}
