package Problems;

import java.util.Arrays;

import subject.BinaryHeap;

public class HeapStack {

	private BinaryHeap pq;
	
	public HeapStack(BinaryHeap h){
		this.pq = h;
	}
	
	public void push(int element){
		pq.insert(element);
	}
	
	public int pop(){
		return pq.deleteMin();
	}
	
	public int top(){
		return pq.getMaximum();
	}
	
	public boolean isEmpty(){
		return pq.isEmpty();
	}
	
	public String toString(){
		return Arrays.toString(pq.array);
	}
}
