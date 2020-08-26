package threadsequence;

public class SequenceGeneratorTest {

	private static final int TOTAL_NO_IN_SEQUENCE = 10;
	private static final int TOTAL_NO_OF_THREADS = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberGenerator numberGenerator = new NumberGenerator(TOTAL_NO_OF_THREADS, TOTAL_NO_IN_SEQUENCE);
		Thread t1 = new Thread(new SequenceGeneratorTask(numberGenerator, 1), "Thread-1");
		Thread t2 = new Thread(new SequenceGeneratorTask(numberGenerator, 2), "Thread-2");
		Thread t3 = new Thread(new SequenceGeneratorTask(numberGenerator, 0), "Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
