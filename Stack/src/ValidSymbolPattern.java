import java.util.Stack;

public class ValidSymbolPattern {

	/**
	 * Return true If valid symbol pattern
	 * @param s
	 * @return
	 */
	public boolean isValidSymbolPattern(String s){
		boolean isValid = false;
		
		Stack<Character> stack = new Stack<Character>();
		
		if(s == null || s.isEmpty()){
			isValid = true;
		} else {
			
			for(int i=0; i<s.length(); i++) {
				
				if(s.charAt(i) == ')'){
					
					if(!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
					} else {
						isValid = false;
						return isValid;
					}
					
				} else if(s.charAt(i) == ']') {
					
					if(!stack.isEmpty() && stack.peek() == '[') {
						stack.pop();
					} else {
						isValid = false;
						return isValid;
					}

				} else if(s.charAt(i) == '}') {
					
					if(!stack.isEmpty() && stack.peek() == '{') {
						stack.pop();
					} else {
						isValid = false;
						return isValid;
					}

				} else {
					stack.push(s.charAt(i));
				}
				
			}
			
			if(stack.isEmpty()){
				isValid = true;
			} else {
				isValid = false;
			}
		}
		
		return isValid;
	}
}
