
public class AdvancedStack2 {

	private LinkedStack<Integer> elementStack = new LinkedStack<Integer>();
	private LinkedStack<Integer> minStack = new LinkedStack<Integer>();
	
	public void push(int data){
		
		elementStack.push(data);
		
		if(minStack.isEmpty() || minStack.peek() >= data){
			minStack.push(data);
		}
	}
	
	public int pop(){
		
		if(elementStack.isEmpty()){
			return Integer.MIN_VALUE;
		}
		
		int elementTop = elementStack.peek();
		int minTop = minStack.peek();
		
		if(elementTop == minTop){
			minStack.pop();
		}
		
		return elementStack.pop();
	}
	
	public boolean isEmpty(){
		return elementStack.isEmpty();
	}
	
	public int top(){
		return elementStack.peek();
	}
	
	public int getMinimum(){
		return minStack.peek();
	}

	@Override
	public String toString() {
		return elementStack.toString();
	}
	
	
}
