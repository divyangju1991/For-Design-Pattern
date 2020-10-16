package mainClass;

import sequentialThreadExe.NumberGenerator;
import task.SequenceGeneratorTask;

public class SequentialThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TOTAL_NO_OF_THREADS = 3;
		final int LIMIT = 10;
		
		NumberGenerator numberGenerator = new NumberGenerator(LIMIT, TOTAL_NO_OF_THREADS);

		Thread t1 = new Thread(new SequenceGeneratorTask(numberGenerator, 1), "Thread-1");
		Thread t2 = new Thread(new SequenceGeneratorTask(numberGenerator, 2), "Thread-2");
		Thread t3 = new Thread(new SequenceGeneratorTask(numberGenerator, 0), "Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
