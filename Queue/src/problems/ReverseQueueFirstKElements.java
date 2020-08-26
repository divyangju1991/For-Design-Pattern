package problems;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueueFirstKElements {

	public void reverseQueueFirstKElements(int k, Queue<Integer> queue){
		
		if(queue == null || k > queue.size()){
			throw new IllegalArgumentException();
		}
		else if(k > 0) {
			
			Stack<Integer> s = new Stack<Integer>();
			for(int i=0;i<k;i++){
				s.push(queue.poll());
			}
			
			while(!s.isEmpty()){
				queue.add(s.pop());
			}
			
			for(int i=0; i < queue.size()-k; i++){
				queue.add(queue.poll());
			}
		}
		
		
	}
}
