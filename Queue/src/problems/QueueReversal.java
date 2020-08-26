package problems;

import java.util.Queue;
import java.util.Stack;

public class QueueReversal {

	public Queue reverseQueue(Queue queue){
		
		Stack stack = new Stack();
		
		while(!queue.isEmpty()){
			stack.push(queue.poll());
		}
		
		while(!stack.isEmpty()){
			queue.offer(stack.pop());
		}
		
		return queue;
	}
}
