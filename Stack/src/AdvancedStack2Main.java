
public class AdvancedStack2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedStack2 stack = new AdvancedStack2();
		stack.push(3);
		stack.push(2);
		stack.push(7);
		stack.push(9);
		System.out.println(stack);
		
		System.out.println("================");
		
		System.out.println("min ="+stack.getMinimum());
		
		System.out.println("================");
		
		stack.pop();
		System.out.println(stack);
		System.out.println("min ="+stack.getMinimum());
		System.out.println("================");
		
		stack.pop();
		System.out.println(stack);
		System.out.println("min ="+stack.getMinimum());
		System.out.println("================");
		
		stack.pop();
		System.out.println(stack);
		System.out.println("min ="+stack.getMinimum());
		System.out.println("================");
	}

}
