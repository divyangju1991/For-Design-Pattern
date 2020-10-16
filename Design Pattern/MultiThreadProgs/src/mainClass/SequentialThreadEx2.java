package mainClass;

import sequentialThreadExe.NumberGenerator;
import sequentialThreadExe.NumberGenerator2;
import task.SequenceGeneratorTask;
import task.SequenceGeneratorTask2;

public class SequentialThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TOTAL_NO_OF_THREADS = 3;
		final int LIMIT = 10;
		
		NumberGenerator2 numberGenerator = new NumberGenerator2(LIMIT, TOTAL_NO_OF_THREADS);

		Thread t1 = new Thread(new SequenceGeneratorTask2(numberGenerator, 1), "Thread-1");
		Thread t2 = new Thread(new SequenceGeneratorTask2(numberGenerator, 2), "Thread-2");
		Thread t3 = new Thread(new SequenceGeneratorTask2(numberGenerator, 3), "Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
