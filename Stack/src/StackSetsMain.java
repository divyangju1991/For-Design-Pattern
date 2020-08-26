
import java.util.ArrayList;
import java.util.Stack;

public class StackSetsMain {
	
	public static void main(String args[]){
		
		StackSets stacks = new StackSets(3);
		
		stacks.push(10);
		stacks.push(9);
		stacks.push(8);
		stacks.push(7);
		stacks.push(6);
		stacks.push(5);
		stacks.push(4);
		stacks.push(3);
		stacks.push(2);
		stacks.push(1);
		
		System.out.println(stacks.toString());
		
		stacks.pop(3);
		System.out.println(stacks.toString());
		
		stacks.pop(2);
		System.out.println(stacks.toString());
		
		stacks.pop(1);
		System.out.println(stacks.toString());
		
		/*
		System.out.println(stacks.toString());
		
		System.out.println(stacks.toString());
		
		System.out.println(stacks.toString());
		
		System.out.println(stacks.toString());
		
		System.out.println(stacks.toString());
		*/
	}
}
