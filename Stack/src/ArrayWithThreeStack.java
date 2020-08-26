import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.concurrent.ThreadPoolExecutor;

public class ArrayWithThreeStack {
	
	private int[] dataArray;
	private int size, topOne, topTwo, baseThree, topThree;
	
	public ArrayWithThreeStack(int size) {
		
		if(size<3){
			throw new IllegalStateException("size<3 is no permissiable");
		}
		
		dataArray = new int[size];
		this.size = size;
		topOne = -1;
		topTwo = size;
		baseThree = (size/2) -1;
		topThree = baseThree-1;
	}
	
	private void shiftStack3ToLeft(){
		
		for(int i=baseThree-1; i<=topThree-1; i++){
			dataArray[i] = dataArray[i+1];
		}
		dataArray[topThree--] = Integer.MIN_VALUE;
		baseThree--;
	}
	
	private boolean stack3IsLeftShiftable(){
		
		if(topOne+1 < baseThree){
			return true;
		}
		
		return false;
	}
	
	private void shiftStack3ToRight(){
		
		for(int i=topThree+1; i>=baseThree; i--){
			dataArray[i] =dataArray[i-1];
		}
		dataArray[baseThree++] = Integer.MIN_VALUE;
		topThree++;
	}
	
	private boolean stack3IsRightShiftable(){
		
		if(topThree+1 < topTwo){
			return true;
		}
		
		return false;
	}
	
    public void push(int stackId, int data){
    	
    	if(stackId == 1){
    		
    		if(topOne+1 == baseThree){
    			if(stack3IsRightShiftable()){
    				shiftStack3ToRight();
    				dataArray[++topOne] = data;
    			} else {
    				throw new StackOverflowError("Stack 1 has reached max limit");
    			}
    			
    		} else {
    			dataArray[++topOne] = data;
    		}
    	} else if(stackId == 2){
    		
    		if(topTwo-1 == baseThree){
    			
    			if(stack3IsLeftShiftable()) {
    				shiftStack3ToLeft();
    				dataArray[--topTwo] = data;
    			} else {
    				throw new StackOverflowError("Stack 2 has reached max limit");
    			}
    		} else {
    			dataArray[--topTwo] = data;
    		}
    	} else if(stackId == 3){
    		
    		if(topTwo-1 == topThree){
    			if(stack3IsLeftShiftable()){
    				shiftStack3ToLeft();
    				dataArray[++topThree] = data;
    			} else {
    				throw new StackOverflowError("Stack 3 has reached max limit");
    			}
    		}else {
    			dataArray[++topThree] = data;
    		}
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
    	} else if(stackId == 3) {
    		
    		data = dataArray[topThree];
    		
    		if(topThree > baseThree)
    			dataArray[topThree--] = Integer.MIN_VALUE;
    		
    		if(topThree == baseThree)
    			dataArray[topThree] = Integer.MIN_VALUE;
    	}
    	
    	return data;
    }
    
    public boolean isEmpty(int stackId){
    	
    	if(stackId == 1){
    			return topOne == -1;
    	} else if(stackId == 2){
    			return topTwo == size;
    	} else if(stackId == 3){
    		return (topThree == baseThree) && (dataArray[baseThree] == Integer.MIN_VALUE || dataArray[baseThree] == 0);
    	} else {
    		return true;
    	}
    }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ArrayWithThreeStack : "+Arrays.toString(dataArray));
		
		return sb.toString();
	}

	public String printObject() {
		
		return "ArrayWithThreeStack [size=" + size + ", topOne=" + topOne
				+ ", topTwo=" + topTwo + ", baseThree=" + baseThree + ", topThree=" + topThree + "]";

	}
    
}
