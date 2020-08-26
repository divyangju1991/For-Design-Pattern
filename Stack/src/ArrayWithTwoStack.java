import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayWithTwoStack {
	
	private int[] dataArray;
	private int size, topOne, topTwo;
	
	public ArrayWithTwoStack(int size) {
		
		if(size<2){
			throw new IllegalStateException("size<2 is no permissiable");
		}
		
		dataArray = new int[size];
		this.size = size;
		topOne = -1;
		topTwo = size;
	}
	
    public void push(int stackId, int data){
    	
    	if(topTwo == topOne+1)
    		throw new StackOverflowError("Array is full");
    	
    	if(stackId == 1){
    		
    		dataArray[++topOne] = data;
    	} else if(stackId == 2) {
    		dataArray[--topTwo] = data;
    	}
    }
	
    
    public int pop(int stackId){
    	
    	int data = -1;
    	
    	if(isEmpty(stackId))
    		throw new EmptyStackException();
    	
    	if(stackId == 1){
    		
    		data = dataArray[topOne];
    		dataArray[topOne--] = Integer.MIN_VALUE;
    		
    	} else if(stackId == 2){
    		
    		data = dataArray[topTwo];
    		dataArray[topTwo++] = Integer.MIN_VALUE;
    	}
    	
    	return data;
    }
    
    public boolean isEmpty(int stackId){
    	
    	if(stackId == 1){
    			return topOne == -1;
    	} else if(stackId == 2){
    			return topTwo == size;
    	} else {
    		return true;
    	}
    }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ArrayWithTwoStack : "+Arrays.toString(dataArray));
		
		return sb.toString();
	}
    
    
}
