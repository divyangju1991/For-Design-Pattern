package problems;

public class QueueWithTwoStackActualMain {

	
	public static void main(String args[]) {
	
		QueueWithTwoStackActual<Integer> queueWithTwoStack = new QueueWithTwoStackActual<Integer>();
		queueWithTwoStack.enQueue(2);
		queueWithTwoStack.enQueue(4);
		queueWithTwoStack.enQueue(6);
		queueWithTwoStack.enQueue(8);
		queueWithTwoStack.enQueue(9);
		queueWithTwoStack.enQueue(1);
		
		System.out.println(queueWithTwoStack.toString());
		
		queueWithTwoStack.deQueue();
		queueWithTwoStack.enQueue(0);
		queueWithTwoStack.deQueue();
		System.out.println(queueWithTwoStack.toString());
		
		queueWithTwoStack.enQueue(2);
		System.out.println(queueWithTwoStack.toString());
		
		queueWithTwoStack.deQueue();
		System.out.println(queueWithTwoStack.toString());
		
		queueWithTwoStack.deQueue();
		System.out.println(queueWithTwoStack.toString());
		
		queueWithTwoStack.deQueue();
		System.out.println(queueWithTwoStack.toString());
		
		queueWithTwoStack.deQueue();
		System.out.println(queueWithTwoStack.toString());
		
		queueWithTwoStack.deQueue();
		System.out.println(queueWithTwoStack.toString());
	}
	
	
}