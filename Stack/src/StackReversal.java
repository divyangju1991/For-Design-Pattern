import java.util.Stack;

public class StackReversal {

	public static void reverseStack(Stack stack) {
		
		if(stack.isEmpty()) return;
		int tmp = (int) stack.pop();
		reverseStack(stack);
		insertAtBottom(stack, tmp);
	}
	
	private static void insertAtBottom(Stack stack, int data){
		
		if(stack.isEmpty()){
			stack.push(data);
			return;
		}
		
		int tmp = (int) stack.pop();
		insertAtBottom(stack, data);
		stack.push(tmp);
	}
	
}
