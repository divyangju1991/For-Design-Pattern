package sequentialThreadExe;

public class NumberGenerator {

	private int limit;
	
	private int totalNoOfThreads;
	
	private int number = 1;

	public NumberGenerator(int limit, int totalNoOfThreads) {
		super();
		this.limit = limit;
		this.totalNoOfThreads = totalNoOfThreads;
	}
	
	public synchronized void print(int currThred){
		
		while(number < limit-1){
			
			while(number % totalNoOfThreads != currThred){
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName()+" : "+(number++));
			notifyAll();
		}
		
	}
}
