package problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckStackPairwiseOrder {

	public boolean checkStackPairwiseOrder(Stack<Integer> s){
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		boolean parirWiseOrder = true;
		
		//4,5,-2,-3,11,10,5,6,20
		//to discard last need to use queue
		while(!s.isEmpty())
			q.offer(s.pop());
		
		while(!q.isEmpty())
			s.push(q.poll());
		
		int n=0, m=0;
		while(!s.isEmpty()){
		
			n = s.pop();
			
			if(!s.isEmpty()){
				m = s.pop();
				
				if(Math.abs(n-m) != 1){
					parirWiseOrder = false;
				}
			}
		}
		
		while(!s.isEmpty())
			s.push(q.poll());
		
		return parirWiseOrder;
	}
}
