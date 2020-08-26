package problems;

import java.util.Stack;

public class QueueWithTwoStack<T> {

	private Stack s1 = new Stack();
	private Stack s2 = new Stack(); 
	
	public void enQueue(T data){
		if(!s2.isEmpty()) {
			while(!s2.isEmpty()){
				s1.push(s2.pop());
			}
		} else {
			s1.push(data);	
		}
		
	}
	
	public T deQueue(){
		
		if(s2.isEmpty()) {
			
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		
		return (T) s2.pop();
	}
	
	public String toString() {
		return (s2.isEmpty()) ? s1.toString() : s2.toString();
	}
}
