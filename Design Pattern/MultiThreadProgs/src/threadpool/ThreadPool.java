package threadpool;

public class ThreadPool {

	private BLockingQueue<Runnable> taskQueue;
	
	public boolean poolShutDownInitiated;
	
	public ThreadPool(BLockingQueue<Runnable> taskQueue){
		this.taskQueue = taskQueue;
		int nThreads = taskQueue.size();
		
		for(int i=1; i<=nThreads; i++){
			ThreadPoolThread poolThread = new ThreadPoolThread(taskQueue, this);
			poolThread.setName("Thread-"+i);
			System.out.println("Thread-"+i+" created in threadPool");
			poolThread.start();
		}
		
	}
	
	public synchronized void execute(Runnable task) throws Exception{
		
		if(this.poolShutDownInitiated){
			throw new Exception("Thread Pool has been shutdown, no future task can be addded");
		}
		taskQueue.put(task);
		System.out.println("Task has been added");
	}
	
	public synchronized void shutDown(){
		poolShutDownInitiated = true;
		System.out.println("ThreadPool has been shutDown");
	}
	
	public boolean isPoolShutDownInitiated(){
		return poolShutDownInitiated;
	}
}
