package com.kodewala.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyTask2 implements Callable<String>{
	public String call () throws Exception {
		Thread.sleep(3000);
		return "Heyy";
	}
}
public class FutureExample2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
    Future <String> future = executor.submit(new MyTask2());
    
    System.out.println("Task Submitted");
    String result = future.get();
	executor.shutdown();
	}
	}


