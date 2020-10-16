package sequentialThreadExe;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator2 {

	private int limit;
	
	private int totalNoOfThreads;
	
	private int number = 1;
	
	private int eachThreadLimit;
	
	private int currThreadSeq = 1;
	
	private int tmpLimit = 0;

	public NumberGenerator2(int limit, int totalNoOfThreads) {
		super();
		this.limit = limit;
		this.totalNoOfThreads = totalNoOfThreads;
		this.eachThreadLimit = limit/totalNoOfThreads;
		tmpLimit = eachThreadLimit;
	}
	
	public synchronized void print(int currThred){
		
		while(number <= limit){
			
			while(currThreadSeq != currThred){
				
				if(number > limit){
					return;
				}
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			while(number <= tmpLimit || (number <= limit && currThreadSeq == totalNoOfThreads)){
				System.out.println(Thread.currentThread().getName()+" : "+(number++));
			}

			if(number > tmpLimit){
				
				if(currThreadSeq+1 <= totalNoOfThreads){
					tmpLimit += eachThreadLimit;
					++currThreadSeq;
					notifyAll();
				} 
			} 
			
			if(number == limit+1){
				notifyAll();
			}
									
		}
		
	}
}
