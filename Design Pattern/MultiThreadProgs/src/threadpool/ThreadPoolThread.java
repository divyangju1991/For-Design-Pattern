package threadpool;

public class ThreadPoolThread extends Thread {

	private BLockingQueue<Runnable> taskQueue;
	
	private ThreadPool threadPool;
	
	public ThreadPoolThread(BLockingQueue<Runnable> taskQueue, ThreadPool pool){
		this.taskQueue = taskQueue;
		this.threadPool = pool;
	}
	
	public void run(){
		
		try {
			while(true){
				
				System.out.println("Ready to execute task");
				
				Runnable task = taskQueue.take();
				System.out.println(Thread.currentThread().getName()+" has taken task");
				
				task.run();
				System.out.println(Thread.currentThread().getName()+" has executed task");
				
				if(threadPool.poolShutDownInitiated && taskQueue.size() == 0){
					this.interrupt();
				}
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
