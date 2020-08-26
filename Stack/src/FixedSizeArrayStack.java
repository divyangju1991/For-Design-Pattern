
public class FixedSizeArrayStack {

	//Length of the array used to implement the stack
	protected int capacity;
	
	//Default array capacity
	public static final int CAPACITY = 10;
	
	//Array used to implement stack
	protected int[] stackRep;
	
	//index of top element of the stack in the array
	protected int top = -1;

	//Initializes the stack to use an array of default length
	public FixedSizeArrayStack() {
		this(CAPACITY);
	} 
		
	//Initializes the stack to use an array of given length
	public FixedSizeArrayStack(int cap) {
		capacity = cap;
		stackRep = new int[capacity];//
	}
	
	//Return number of elements in the stack
	public int size(){
		return (top + 1);
	}
	
	//Test whether stack is Empty
	public boolean isEmpty(){
		return (top < 0);
	}
	
	//Inserts elements top of the stack
	public void push(int data) throws Exception {
		if(size() == capacity) {
			throw new Exception("Stack is Full");
		}
		stackRep[++top] = data;
	}

	//Return top elements of the stack
	public int top() throws Exception {
		if(isEmpty()){
			throw new Exception("Stack is Empty");
		}
		
		return stackRep[top];
	}
	
	//Remove top element from the stack
	public int pop() throws Exception {
		
		if(isEmpty()){
			throw new Exception("Stack is Empty");
		}
		
		int data = stackRep[top];
		stackRep[top--] = Integer.MIN_VALUE;
		
		return data;
	}
	
	
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		
		if(size() > 0){
			sb.append(stackRep[0]);
		} else if(size() > 1) {
			for(int i = 1; i < size() -1; i++) {
				sb.append( "," + stackRep[i] );	
			}
			
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
}