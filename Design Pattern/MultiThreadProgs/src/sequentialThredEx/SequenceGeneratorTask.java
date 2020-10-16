package sequentialThredEx;

public class SequenceGeneratorTask implements Runnable {

	private PrintNumber printNumber;
	private int seqNoOfThread = 0;

	public SequenceGeneratorTask(PrintNumber printNumber, int seqNoOfThread){
		this.printNumber = printNumber;
		this.seqNoOfThread = seqNoOfThread;
	}

	public void run(){
		printNumber.printNumber(seqNoOfThread);
	}
	
}
