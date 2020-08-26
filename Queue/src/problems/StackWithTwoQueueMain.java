package problems;

public class StackWithTwoQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithTwoQueue<Integer> stack = new StackWithTwoQueue<Integer>();
		stack.push(2);
		stack.push(3);
		stack.push(6);
		stack.push(9);
		stack.push(1);
		System.out.println(stack.toString());
		
		stack.pop();
		System.out.println(stack.toString());
		
		stack.pop();
		System.out.println(stack.toString());
		
		stack.pop();
		System.out.println(stack.toString());
		
		
	}

}
