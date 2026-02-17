package com.kodewala.future;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Callable<Integer> {
	public Integer call() {
		return 10 + 20;
	}
}

public class FutureExample {

	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<Integer> future = executor.submit(new MyTask());
		Integer result = future.get();
		System.out.println("Result :" + result);
		executor.shutdown();
	}

}
