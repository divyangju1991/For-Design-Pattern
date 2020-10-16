package sequentialThredEx;

public class PrintNumber {

	private int number = 1;

	private int limit = 0;
	
	private int totalNoOfThreads = 0;

	public PrintNumber(int limit, int totalNoOfThreads){
		this.limit = limit;
		this.totalNoOfThreads = totalNoOfThreads;
	}
	
	public synchronized void printNumber(int currThreadNo){

		while(number < limit-1){
			
			while(number % totalNoOfThreads != currThreadNo){
				
				try{
					wait();
				} catch(Exception ex){
					
				}
			}
			
			System.out.println(Thread.currentThread().getName()+" : "+(number++));
			notifyAll();
		}
		
	}
	
}
