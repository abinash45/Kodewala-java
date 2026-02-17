package com.kodewala.Threads;

class ThreadDemo extends Thread {
	public void run() {
		System.out.println("Running thread " + Thread.currentThread().getName());
	}
}

public class MyThread {

	public static void main(String[] args) {

		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		ThreadDemo t2 = new ThreadDemo();
		t2.start();
		

	}

}

