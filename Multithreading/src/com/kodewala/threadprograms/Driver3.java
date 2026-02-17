package com.kodewala.threadprograms;

class StaticBlockSync {
	public static void newTask() {
		for (int i = 0; i < 10; i++) {
			synchronized (StaticBlockSync.class) {

				System.out.println("Printing block level");
				
				/// Thread.yield()
				/// wait is in object class not in thread class 
				/// synchronizing a static method dis adv 
				/// how the thread talk each other with notify and wait
				/// inter thread communication
			}
		}
	}
}

class Workers extends Thread {
	StaticBlockSync sbc;

	public Workers(StaticBlockSync sbc) {
		this.sbc = sbc;
	}

	public void run() {
		//System.out.println("");
		StaticBlockSync.newTask();
	}
}

public class Driver3 {

	public static void main(String[] args) {
		StaticBlockSync sbc = new StaticBlockSync();
     Workers w1 = new Workers (sbc);
     w1.setName("W1");
     w1.start();
     
     
     
     Workers w2 = new Workers (sbc);
     w2.setName("W2");
     w2.start();
	}

}
