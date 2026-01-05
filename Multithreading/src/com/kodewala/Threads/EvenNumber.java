package com.kodewala.Threads;

public class EvenNumber {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new even());
		t1.setName("T1");
		t1.start();// register thread with scheduler and cpu will alocate memory space 
		//t1.run();
		
		Thread t2 = new Thread(new even());
		t2.setName("T2");
		//t2.start();
		t2.run();
		//Thread.sleep(3000);
		

	}

}
	class even implements Runnable{
		@Override
		public void run () {
			for(int i=0;i<=20;i++) {
				try {
					Thread.sleep(3000);
					
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(i%2 == 0) {
					System.out.println("the even numbers are : " + i +" " + Thread.currentThread().getName());
				}
			}
		}
	}


