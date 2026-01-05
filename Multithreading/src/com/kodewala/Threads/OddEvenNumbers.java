package com.kodewala.Threads;

public class OddEvenNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread t1 = new Thread (new MyThreads ());
		t1.setName("T1");
		t1.start();
		
		Thread t2 = new Thread (new MyThreads ());
		t2.setName("T2");
		t2.start();
		

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

}
/* (public class MyThreads extends Object implement Abinash) :- possible
 * if one class is extend then we cant extend any other thread class 
 *  runnable is better choice.
 * 
 * when we create new thread object the state is NEW (Thread t1 = new Thread (new MyThreads ());)
 * once we call the start () the state is RUNNABLE
 * once cpu allow to execute it will RUNNING
 * once run() is completed it is TERMINATED 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
