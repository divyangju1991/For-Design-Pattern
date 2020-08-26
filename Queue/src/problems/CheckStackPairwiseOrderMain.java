package problems;

import java.util.Stack;

public class CheckStackPairwiseOrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckStackPairwiseOrder checkStackPairwiseOrder = new CheckStackPairwiseOrder();
		CheckStackPairwiseOrderMyTesting my = new CheckStackPairwiseOrderMyTesting();
		
		Stack<Integer> s = new Stack<Integer>();
		//4,5,-2,-3,11,10,5,6,20
		s.push(4);
		s.push(5);
		s.push(-2);
		s.push(-3);
		s.push(11);
		s.push(10);
		s.push(5);
		s.push(6);
		s.push(20);
		
		System.out.println(checkStackPairwiseOrder.checkStackPairwiseOrder(s));
		
		//4,5,-2,-3,11,10,5,6,20
				s.push(4);
				s.push(5);
				s.push(-2);
				s.push(-3);
				s.push(11);
				s.push(10);
				s.push(5);
				s.push(6);
				s.push(20); 
				//If we removed last(20) from stack then give result correctly but to discard last need to use queue 
				
		System.out.println(my.checkStackPairwiseOrder(s));
		
		s = new Stack<Integer>();
		//2,5,-2,-3,11,10,5,6,20
		s.push(2);
		s.push(5);
		s.push(-2);
		s.push(-3);
		s.push(11);
		s.push(10);
		s.push(5);
		s.push(6);
		s.push(20);
		
		System.out.println(checkStackPairwiseOrder.checkStackPairwiseOrder(s));
		
		s = new Stack<Integer>();
		//2,5,-2,-3,11,10,5,6,20
		s.push(2);
		s.push(5);
		s.push(-2);
		s.push(-3);
		s.push(11);
		s.push(10);
		s.push(5);
		s.push(6);
		s.push(20);
		
		System.out.println(my.checkStackPairwiseOrder(s));
		
		s = new Stack<Integer>();
		//4,5,-1,-3,11,10,5,6,20
		s.push(2);
		s.push(5);
		s.push(-1);
		s.push(-3);
		s.push(11);
		s.push(10);
		s.push(5);
		s.push(6);
		s.push(20);
		
		System.out.println(checkStackPairwiseOrder.checkStackPairwiseOrder(s));
		
		s = new Stack<Integer>();
		//4,5,-1,-3,11,10,5,6,20
		s.push(2);
		s.push(5);
		s.push(-1);
		s.push(-3);
		s.push(11);
		s.push(10);
		s.push(5);
		s.push(6);
		s.push(20);
		
		System.out.println(my.checkStackPairwiseOrder(s));
	}

}
