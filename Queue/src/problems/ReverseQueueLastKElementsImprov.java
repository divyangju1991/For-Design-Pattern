package problems;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueueLastKElementsImprov {

	public void reverseQueueLastKElements(int k, Queue<Integer> queue){
		
		if(queue == null || k > queue.size()){
			throw new IllegalArgumentException();
		}
		else if(k > 0) {
			
			Stack<Integer> s = new Stack<Integer>();
			int size = queue.size();
			
			for(int i=0; i<size-k; i++){
					s.push(queue.poll());
			}
			
			System.out.println(queue.toString());
			
			while(!s.isEmpty()){
				queue.add(s.pop());
			}
			
			while(!queue.isEmpty()){
				s.push(queue.poll());
			}
			
			while(!s.isEmpty()){
				queue.add(s.pop());
			}
		}
		
	}
}
