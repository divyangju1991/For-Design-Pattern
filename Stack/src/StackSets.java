
import java.util.ArrayList;
import java.util.Stack;

public class StackSets {
	
	//Number of elements for each stack
	private int threshold;
	private ArrayList<StackForStackSets> listOfStacks = new ArrayList<StackForStackSets>();
	
	StackSets(int capacity){
		this.threshold = capacity;
	}
	
	//get the last stack
	public StackForStackSets getLastStack(){
		int size = listOfStacks.size();
		
		if(size <= 0)
			return null;
		else
			return listOfStacks.get(size - 1);
	}
	
	//get the nth Stack
	public StackForStackSets getNthStack(int n){
		
		int size = listOfStacks.size();
		
		if(size <= 0)
			return null;
		else
			return listOfStacks.get(n-1);
	}

	//push value
	public void push(int value){
		
		StackForStackSets lastStack = this.getLastStack();
		
		if(lastStack == null){
			
			lastStack = new StackForStackSets(threshold);
			lastStack.push(value);
			listOfStacks.add(lastStack);
		} else {
			
			if(!lastStack.isAtCapacity())
				lastStack.push(value);
			else{
				StackForStackSets newLastStack = new StackForStackSets(threshold);
				newLastStack.push(value);
				listOfStacks.add(newLastStack);
			}
		}
		
	}
	
	public int pop(){
		StackForStackSets lastStack = this.getLastStack();
		int v = lastStack.pop();
		if(lastStack.size() == 0)
			listOfStacks.remove(listOfStacks.size()-1);
		return v;
	}
	
	public int pop(int nth){
		
		StackForStackSets nthStack = this.getNthStack(nth);
		int v = nthStack.pop();
		if(nthStack.size() == 0)
			listOfStacks.remove(listOfStacks.size()-1);
		return v;
	}
	
	public String toString(){
		
		String s = "";
		for(int i =0; i < listOfStacks.size(); i++){
			
			StackForStackSets stack = listOfStacks.get(i);
			s = "Stack" + i + " : "+stack.toString() + s;
		}
		
		return s;
	}
	
	
}
