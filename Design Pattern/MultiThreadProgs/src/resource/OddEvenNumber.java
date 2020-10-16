package resource;

public class OddEvenNumber {
	
	private int limit;
	
	private int currThreadNo = 1;
	
	public OddEvenNumber(int limit) {
		super();
		this.limit = limit;
	}

	public synchronized void printNumber(boolean isEven, int threadSeqNo) {
		
		while(currThreadNo != threadSeqNo){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(isEven){
			System.out.println(Thread.currentThread().getName() +" : Even number : ");
			printEven();
		} else {
			System.out.println(Thread.currentThread().getName() +" : Odd Number : ");
			printOdd();
		}
		
		++currThreadNo;
		notifyAll();
	}
	
	public void printOdd(){
		for(int num=1; num<=limit; num+=2) 
			System.out.print(num);
	}
	
	public void printEven(){
		for(int num=2; num<=limit; num+=2) 
			System.out.print(num);
	}

}
