package problems;

import java.util.Queue;
import java.util.Stack;

public class InterLeavingQueue {

	public void interLeavingQueue(Queue<Integer> q){
		
		if(q.size() % 2 != 0)
			throw new IllegalArgumentException();
		
		System.out.println("Input Queue : "+q.toString());
		
		Stack<Integer> s = new Stack<Integer>();
		
		int halfSize = q.size() / 2;
		
		for(int i=0;i<halfSize;i++)
			s.push(q.poll());
		
		while(!s.isEmpty())
			q.offer(s.pop());
		
		System.out.println("After Stack pop : "+q.toString());
		
		for(int i=0;i<halfSize;i++)
			q.offer(q.poll());
		
		System.out.println("Queue poll : "+q.toString());
		
		for(int i=0;i<halfSize;i++)
			s.push(q.poll());
		
		System.out.println("Stack : "+s.toString());
		
		System.out.println("After Stack Push : "+q.toString());
		
		while(!s.isEmpty()){
			q.offer(s.pop());
			q.offer(q.poll());
		}
			
	}
}
