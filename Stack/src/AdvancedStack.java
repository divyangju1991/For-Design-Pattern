
import java.util.Stack;

public class AdvancedStack {

	private LinkedStack<Integer> elementStack = new LinkedStack<Integer>();
	private LinkedStack<Integer> minStack = new LinkedStack<Integer>();
	
	public void push(int data){
		elementStack.push(data);
		if(minStack.isEmpty() || (Integer)minStack.peek() >= (Integer)data){
			minStack.push(data);
		} else {
			minStack.push(minStack.peek());
		}
	}
	
	@Override
	public String toString() {
		return elementStack.toString();
	}

	public int pop(){
		if(elementStack.isEmpty()){
			return Integer.MIN_VALUE;
		}
		minStack.pop();
		return elementStack.pop();
	}
	
	public int top(){
		return elementStack.peek();
	}
	
	public boolean isEmpty(){
		return elementStack.isEmpty();
	}
	
	public int getMinimum(){
		return minStack.peek(); 
	}
}
