package sequentialThredEx;

public class SequentialThreadEx {

	public static void main(String[] args){
		PrintNumber printNumber = new PrintNumber(10, 3);
				
		Thread t1 = new Thread(new SequenceGeneratorTask(printNumber, 1), "Thread-1");
		Thread t2 = new Thread(new SequenceGeneratorTask(printNumber, 2), "Thread-2");
		Thread t3 = new Thread(new SequenceGeneratorTask(printNumber, 0), "Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
