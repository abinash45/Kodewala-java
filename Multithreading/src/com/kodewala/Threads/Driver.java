package com.kodewala.Threads;

class PrintNumbers extends Thread {
	
	@Override
	public void run() {
		for(int i =0 ; i<5; i++) {
			System.out.println("Printing" +i+"and is executed  by"+Thread.currentThread().getName());
		}
	}
}

public class Driver  {

	public static void main(String[] args) {
		System.out.println("Started main and its executed by "+Thread.currentThread().getName());
	PrintNumbers t1 = new PrintNumbers ();
	t1.setName("PN-T1");
	t1.start();
	
	PrintNumbers t2 = new PrintNumbers ();
	t2.setName("PN-T2");
	//t2.start();
	t2.run();
	
	System.out.println("ENDED main() abd its executed by"+Thread.currentThread().getName());
	
	}

}
