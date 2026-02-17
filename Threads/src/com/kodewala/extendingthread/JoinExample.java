package com.kodewala.extendingthread;

class MyThread extends Thread {
	String name;

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 6; i++) {
			System.out.println(i + "Thread Name" + Thread.currentThread().getName());

			try {
				Thread.sleep(3000);
			} catch (
					InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread("Thread-1");
		MyThread t2 = new MyThread("Thread-2");
		System.out.println("Starting the thread 1");
		t1.start();
		t1.join();

		System.out.println("Starting with thread 2");
		t2.start();
		System.out.println("Main methid finished");
	}

}
