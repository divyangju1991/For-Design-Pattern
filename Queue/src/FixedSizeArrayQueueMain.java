public class FixedSizeArrayQueueMain {
	
	public static void main(String args[]) {
		
		FixedSizeArrayQueue fixedSizeArrayQueue = new FixedSizeArrayQueue(5);
		
		fixedSizeArrayQueue.enQueue(0);
		fixedSizeArrayQueue.enQueue(1);
		fixedSizeArrayQueue.enQueue(3);
		
		fixedSizeArrayQueue.deQueue();
		fixedSizeArrayQueue.deQueue();
		fixedSizeArrayQueue.deQueue();
		
		fixedSizeArrayQueue.enQueue(6);
		fixedSizeArrayQueue.enQueue(7);
		
		fixedSizeArrayQueue.enQueue(9);
		fixedSizeArrayQueue.enQueue(4);
		fixedSizeArrayQueue.enQueue(5);
		
		//fixedSizeArrayQueue.enQueue(3);
		
		fixedSizeArrayQueue.deQueue();
		fixedSizeArrayQueue.enQueue(5);
		
		fixedSizeArrayQueue.deQueue();
		fixedSizeArrayQueue.enQueue(5);
		
		fixedSizeArrayQueue.deQueue();
		fixedSizeArrayQueue.enQueue(5);
		
		System.out.println(fixedSizeArrayQueue.toString());
	}
}
