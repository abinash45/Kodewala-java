package com.kodewala.extendingthread;


class SleepThread extends Thread {
	public void run() {
		for (int i =0; i<=5; i++) {
			System.out.println(i + "Thread name " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class SleepMethodUse {

	public static void main(String[] args) {
		SleepThread t1 = new SleepThread();
		SleepThread t2 = new SleepThread();
		t1.setName("Thread A");
        t2.setName("Thread B");
        
        t1.start();
        t2.start();
	}

}
