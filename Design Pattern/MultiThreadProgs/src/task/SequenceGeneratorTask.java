package task;

import sequentialThreadExe.NumberGenerator;

public class SequenceGeneratorTask implements Runnable {

	private NumberGenerator numberGenerator;
	
	private int seqNoOfThread;
	
	public SequenceGeneratorTask(NumberGenerator numberGenerator, int seqNoOfThread){
		
		this.numberGenerator = numberGenerator;
		this.seqNoOfThread = seqNoOfThread;
	}
	
	public void run(){
		numberGenerator.print(seqNoOfThread);
	}
}
