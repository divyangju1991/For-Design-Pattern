
public class DynamicSizeArrayStack {

	//Length of the array used to implement the stack
	protected int capacity;
	
	//Default array capacity
	public static final int CAPACITY = 16; //Power of 2
	public static int MINCAPACITY = 1<<15; //Power of 2
	
	//Array used to implement stack
	protected int[] stackRep;
	
	//index of top element of the stack in the array
	protected int top = -1;

	//Initializes the stack to use an array of default length
	public DynamicSizeArrayStack() {
		this(CAPACITY);
	} 
		
	//Initializes the stack to use an array of given length
	public DynamicSizeArrayStack(int cap) {
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
			expand();
		}
		stackRep[++top] = data;
	}

	private void expand() {
		int length = size();
		
		int[] newstack = new int[length<<1];
		System.arraycopy(stackRep, 0, newstack, 0, length);
		stackRep = newstack;
		this.capacity = this.capacity << 1;
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
		shrink();
		return data;
	}
	
	private void shrink() {
		int length = top +1;
		
		if(length <= MINCAPACITY || top<<2 >= length){//top<<2 means top*4
			return;
		}
		
		length = length + (top<<1);//still means shrink to at 1/2 or less of the heap
		if(top < MINCAPACITY) {
			length = MINCAPACITY;
		}
		
		int[] newtack = new int[length];
		System.arraycopy(stackRep, 0, newtack, 0, top+1);
		stackRep = newtack;
		this.capacity = length;
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