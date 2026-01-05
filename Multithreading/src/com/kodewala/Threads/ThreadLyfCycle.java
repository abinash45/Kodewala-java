package com.kodewala.Threads;

public class ThreadLyfCycle implements Runnable {
	
	public void run () { //RUNNING
		
		for (int i = 2; i<=10; i++) {
			if (i % 3 == 0) {
				System.out.println("Print the number divisible by 3 :"+ i);
			}
		}
		
	} //TERMINATED

	public static void main(String[] args) {
		
		Thread t1 = new Thread (new ThreadLyfCycle ()); // NEW
		t1.setName("T1");//RUNNABLE
		t1.start();
		//t1.start(); java.lang.IllegalThreadStateException (IF WE CALL START FOR 2 TIMES)
		 //Once thread is terminated we cant start with again 
		
		
	}

}
