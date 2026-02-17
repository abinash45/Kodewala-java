package com.kodewala.Threads;


class PrintNumber {
	public synchronized void print() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Number is " + i + " Printed by thread " + Thread.currentThread().getName());
		}
	}
}

class worker extends Thread {
	PrintNumber printNumbers;

	worker(PrintNumber printNumbers) {
		this.printNumbers = printNumbers;
	}

	@Override
	public void run() {
		printNumbers.print();
	}
}

public class Driver1 {

	public static void main(String[] args) {
		PrintNumber printNumbers = new PrintNumber();
		worker t1 = new worker(printNumbers);
		t1.start();
		t1.setName("T1");

		worker t2 = new worker(printNumbers);
		t2.start();
		t2.setName("T2");

	}

}
