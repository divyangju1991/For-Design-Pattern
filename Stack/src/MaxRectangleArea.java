import java.util.Stack;

public class MaxRectangleArea {

	public int maxRectangleArea(int a[]){
		
		Stack<Integer> s = new Stack<Integer>();
		
		if(a == null || a.length == 0)
			return 0;
		
		int maxArea = 0;
		int i = 0;
		
		while(i < a.length){
			
			//If current bar is higher than the bar of the stack peek, push it to stack
			if(s.isEmpty() || a[s.peek()] <= a[i])
				s.push(i++);
			else {
				//If the current bar is lower than the stack peek
				//Calculate area of rectangle with stack top as the smallest bar
				//"i" is right index of the top and element before the top in stack is left index
				int top = s.pop();
				//calculate the area with A[top] stack as smallest bar and update maxArea if needed
				maxArea = Math.max(maxArea, a[top] * (s.empty() ? i : i - s.peek() - 1));
			}
		}
		
		//Now pop the remaining bar from stack and calculate area with every popped bar as the smallest bar
		while(!s.isEmpty()){
			int top = s.pop();
			maxArea = Math.max(maxArea, a[top] * (s.empty() ? i : i - s.peek() - 1));
		}
		
		return maxArea;
	}
}
