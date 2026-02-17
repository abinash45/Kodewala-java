package com.kodewala.threadprograms;

class Task {
	public void doTask() {
		// If this method is static we need a class lock

		for (int i = 0; i < 5; i++) {
			// System.out.println("Doing task "+ Thread.currentThread().getName());

			synchronized (Task.class) {

				System.out.println("Upadating some variables" + Thread.currentThread().getName());
				System.out.println("Doing task " + Thread.currentThread().getName());
			}
		}
	}
}

class Worker extends Thread {
	Task task;

	public Worker(Task task) {
		this.task = task;
	}

	@Override
	public void run() {
		task.doTask(); // thread is getting lock of task object
	}
}

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task = new Task();
		Worker worker1 = new Worker(task);
		worker1.setName("Worker1");
		worker1.start();

		Worker worker2 = new Worker(task);
		worker2.setName("Worker2");
		worker2.start();

	}

}
