package com.kodewala.Threads;

class MyThread1 extends Thread {
	public void run() {
		System.out.println("Thread name :" + Thread.currentThread().getName());
	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		t1.start();
		t1.run();
		MyThread1 t2 = new MyThread1();
		t2.start();
		t2.run();
		MyThread1 t3 = new MyThread1();
		t3.start();
		t3.run();

		MyThread1 t4 = new MyThread1();
		t4.start();
		t4.run();

	}

}
