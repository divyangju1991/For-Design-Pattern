package threadpool;

public class TestThreadPool {

	public static void main(String[] args) {
		
		ThreadPool threadPool = new ThreadPool(new LinkedBlockingQueue<Runnable>(2));
		Runnable task = new Task();
		try {
			threadPool.execute(task);
			threadPool.execute(task); 
			threadPool.shutDown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
