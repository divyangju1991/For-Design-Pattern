package mainClass;

import resource.OddEvenNumber;
import task.OddEvenTask;

public class OddEvenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OddEvenNumber number = new OddEvenNumber(10);
		
		Thread t1 = new Thread(new OddEvenTask(number, false, 2), "Odd Thread");
		Thread t2 = new Thread(new OddEvenTask(number, true, 1), "Even Thread");
		
		t1.start();
		t2.start();
	}

}
