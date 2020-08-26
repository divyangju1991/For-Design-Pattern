package problems;

public class QueueWithTwoStackMain {

	
	public static void main(String args[]) {
	
		QueueWithTwoStack<Integer> queueWithTwoStack = new QueueWithTwoStack<Integer>();
		queueWithTwoStack.enQueue(2);
		queueWithTwoStack.enQueue(4);
		queueWithTwoStack.enQueue(6);
		queueWithTwoStack.enQueue(8);
		queueWithTwoStack.enQueue(9);
		queueWithTwoStack.enQueue(1);
		
		System.out.println(queueWithTwoStack.toString());
		
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
