import java.util.Stack;

public class IsPalindrome2 {

	public boolean isPalindrome(String inputStr){
		
		int i=0;
		char a[] = inputStr.toCharArray();
		Stack s = new Stack();
		
		while(a[i] != 'X'){
			s.push(a[i]);
			i++;
		}
		i++;
		
		while(i<inputStr.length()){
			
			if(s.isEmpty())
				return false;
			
			if(a[i] != (char)s.pop())
				return false;
			
			i++;
		}
		
		return true;
	}
}
