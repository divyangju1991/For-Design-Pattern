package task;

import resource.OddEvenNumber;

public class OddEvenTask implements Runnable {

	private OddEvenNumber oddEvenNumber;
	
	private boolean isEven;
	
	private int threadSeqNo;
	
	public OddEvenTask(OddEvenNumber oddEvenNumber, boolean isEven, int threadSeqNo) {
		super();
		this.oddEvenNumber = oddEvenNumber;
		this.isEven = isEven;
		this.threadSeqNo = threadSeqNo;
	}

	@Override
	public void run() {
		oddEvenNumber.printNumber(isEven, threadSeqNo);
	}

}
