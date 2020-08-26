package problems;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueueLastKElements {

	public void reverseQueueLastKElements(int k, Queue<Integer> queue){
		
		if(queue == null || k > queue.size()){
			throw new IllegalArgumentException();
		}
		else if(k > 0) {
			
			Stack<Integer> s1 = new Stack<Integer>();
			Stack<Integer> s2 = new Stack<Integer>();
			int size = queue.size();
			
			for(int i=0; i<size; i++){
				
				if(i < size-k){
					s1.push(queue.poll());
				} else {
					s2.push(queue.poll());
				}
			}
			
			while(!s1.isEmpty()){
				queue.add(s1.pop());
			}
			
			while(!queue.isEmpty()){
				s1.add(queue.poll());
			}
			
			while(!s1.isEmpty()){
				queue.add(s1.pop());
			}
			
			while(!s2.isEmpty()){
				queue.add(s2.pop());
			}
			
			
		}
		
		
	}
}
