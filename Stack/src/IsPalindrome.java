
public class IsPalindrome {

	public boolean isPalindrome(String inputStr){
		
		int i=0, j = inputStr.length()-1;
		char a[] = inputStr.toCharArray(); 
		
		while(i<j && a[i] == a[j]){
			j--;
			i++;
		}
		
		if(i < j){
			return false;
		} else {
			return true;
		}
		
	}
}
