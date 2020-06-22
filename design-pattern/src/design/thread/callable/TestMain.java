package design.thread.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestMain {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<Future<Integer>> futureList = new ArrayList<>();
		
		Callable<Integer> callable = new CallableExample();
		
		for(int i=0; i<10; i++) {
			Future<Integer> future = executorService.submit(callable);
			futureList.add(future);
		}
		
		for(Future<Integer> future : futureList) {
			try {
				System.out.println("Value : " + future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		executorService.shutdown();
	}

}
