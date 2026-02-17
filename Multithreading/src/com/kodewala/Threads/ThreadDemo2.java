package com.kodewala.Threads;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				System.out.println(" Printing the odd numbers " + i);
			}
		}

	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Printing the even number" + i);
			}
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();
	}

}
