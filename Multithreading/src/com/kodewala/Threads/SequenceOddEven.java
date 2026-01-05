package com.kodewala.Threads;

public class SequenceOddEven {

	public static void main(String[] args) {
		Thread t1 = new Thread (new odd ());
		t1.setName("T1");
		t1.start();
		
		Thread t2 = new Thread (new even());
		t2.setName("T2");
		t2.start();
		

	}
}
	class odd implements Runnable{
		@Override
		public void run () {
			for(int i=0;i<=20;i++) {
				if(i%2 != 0) {
					System.out.println("the odd numbers are :" +i);
				}
			}
		}
	}
	
	class even implements Runnable{
		@Override
		public void run () {
			for(int i=0;i<=20;i++) {
				if(i%2 == 0) {
					System.out.println("the even numbers are :" +i);
				}
			}
		}
	}



	

