import java.util.Stack;

public class StackReversalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackReversal stackReversal = new StackReversal();
		
		Stack stack = new Stack();
		stack.push(2);
		stack.push(8);
		stack.push(9);
		stack.push(3);
		stack.push(6);
		stack.push(5);
		
		System.out.println("Before Reverse");
		System.out.println(stack.toString());
		
		stackReversal.reverseStack(stack);

		System.out.println("After Reverse");
		System.out.println(stack.toString());
	}

}
