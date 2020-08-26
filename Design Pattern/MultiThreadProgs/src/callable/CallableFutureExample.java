package callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExample {
	
	private final static int NTHREADS = 2;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
		
		Future<Integer> futureInt = executor.submit(new SumIntegerCallable(10));
		Future<Double> futureDouble = executor.submit(new SquareDoubleCallable(2.0));
		
		System.out.println("SumIntegerCallable has returned "+futureInt.get());
		System.out.println("SquareDoubleCallable has returned "+futureDouble.get());
		
		executor.shutdown();
	}

}
