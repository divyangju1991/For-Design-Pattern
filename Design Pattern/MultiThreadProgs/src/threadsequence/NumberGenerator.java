package threadsequence;

public class NumberGenerator {

	private int numberOfThreads;
	private int totalNumbersInSequence;
	private int number = 1;
	
	public NumberGenerator(int numberOfThreads, int totalNumbersInSequence) {
		super();
		this.numberOfThreads = numberOfThreads;
		this.totalNumbersInSequence = totalNumbersInSequence;
	}
	
	public void printNumber(int result){
		synchronized(this){
			
			while(number  < totalNumbersInSequence -1) {
				while(number % numberOfThreads != result) {
					try{
						wait();
					} catch(InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+": "+ number++);
				notifyAll();
			}
		}
	}
}
