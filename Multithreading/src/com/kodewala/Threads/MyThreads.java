package com.kodewala.Threads;

public class MyThreads implements Runnable {

	//any class that is implementiong runnable must have the run() method 
	@Override
	public void run() { // one cpu allow to execute t1 thread, then run method will be executing
		//thread will execute this logic
		System.out.println("My threads.run()----Executing run method");
		
		for (int i=0; i<=20; i++) {
			System.out.println("Number is  " + i + " executed by " + Thread.currentThread().getName());
			//.getName :- return the name
			//Thread.currentThread() :- give us the thread that is currently running
		}
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread (new MyThreads ());//creating NEW thread
		t1.setName("T1");// Starting the thread (it register thread and request for cpu time)
		t1.start();
		
		Thread t2 = new Thread (new MyThreads ());//creating NEW thread
		t2.setName("T2");// Starting the thread (it register thread and request for cpu time)
		t2.start();
		
 // 3 threads are here main , t1, t2
		//thread execution depends on cpu
		/*output is not sequentially , it completly depends on cpu .
		 * first t1 creates then it call the run method and so as t2 and both are eecuting parallely
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
		 
	}

}
