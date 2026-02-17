package com.kodewala.extendingthread;


class NumberThread extends Thread{
	public void run () {
		for (int i=0; i<=10;i++) {
			System.out.println(i+ " " +Thread.currentThread().getName());
		}
	}
}
public class PrintingNumbers {

	public static void main(String[] args) {
		NumberThread nt1 = new NumberThread ();
		NumberThread nt2 = new NumberThread ();
		
		nt1.setName("First Thread");
		nt2.setName("Second Thread");
	
		nt1.start();
		nt2.start();
	
	}

}
