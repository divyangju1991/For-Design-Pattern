package task;

import sequentialThreadExe.NumberGenerator;
import sequentialThreadExe.NumberGenerator2;

public class SequenceGeneratorTask2 implements Runnable {

	private NumberGenerator2 numberGenerator;
	
	private int seqNoOfThread;
	
	public SequenceGeneratorTask2(NumberGenerator2 numberGenerator, int seqNoOfThread){
		
		this.numberGenerator = numberGenerator;
		this.seqNoOfThread = seqNoOfThread;
	}
	
	public void run(){
		numberGenerator.print(seqNoOfThread);
	}
}
