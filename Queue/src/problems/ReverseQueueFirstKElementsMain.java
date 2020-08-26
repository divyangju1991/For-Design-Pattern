package problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueFirstKElementsMain {

	public static void main(String[] args){
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(12);
		q.offer(21);
		q.offer(22);
		q.offer(10);
		q.offer(16);
		q.offer(34);
		q.offer(7);
		q.offer(17);
		q.offer(11);
		
		System.out.println(q.toString());
		
		ReverseQueueFirstKElements reverseQueueFirstKElements = new ReverseQueueFirstKElements();
		reverseQueueFirstKElements.reverseQueueFirstKElements(5, q);
		
		System.out.println("Reverse First 5th elements");
		
		System.out.println(q.toString());
		
		
	}
}
