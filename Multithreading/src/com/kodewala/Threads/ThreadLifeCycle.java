package com.kodewala.Threads;

public class ThreadLifeCycle implements Runnable {

	public void run() { // RUNNING STATE  Now thread is executing the run ()

		System.out.println("Inside the run menthod");
		try {
			System.out.println("Thread is going to sleep");
			Thread.sleep(2000);
			//Now it is in waiting state 
			System.out.println("Sleep Time is Over");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Completed");
		
	}

	 // TERMINATED

	public static void main(String[] args) {

		ThreadLifeCycle t1 = new ThreadLifeCycle();
		
		//NEW STATE
		 Thread myThread = new Thread(t1);
		 Thread t2 = new Thread(t1);
		 
		 myThread.setName("T1");
		 //RUNNABLE STATE  Here the thread is ready to run and waiting for the cpu time 
		 myThread.start();  
		 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 myThread.interrupt();
		 
		 //If i write again myThread.start() it will give error 
		

	}

}
