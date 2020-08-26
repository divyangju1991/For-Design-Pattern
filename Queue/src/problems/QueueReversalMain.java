package problems;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReversalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("############### QueueReversalMain ################");

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(2);
		queue.offer(1);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		queue.offer(7);
		
		System.out.println(queue.toString());
		
		QueueReversal queueReversal = new QueueReversal();
		queueReversal.reverseQueue(queue);
		
		System.out.println(queue.toString());
	}

}
