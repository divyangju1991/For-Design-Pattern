
public class CalculateUpperCaseLowerCaseDigits {

	public void CalculateUpperCaseLowerCaseDigits(String input) {
		
		int ntotalChars = 0;
		int nUpperCase = 0;
		int nLowerCase = 0;
		int nDigits = 0;
		int nOthers = 0;
		char ch;
		
		if(input != null){
			ntotalChars = input.length();
		}
		
	    for(int i=0; i < ntotalChars; i++) {
	    	ch = input.charAt(i);
	    	
	    	if(Character.isUpperCase(ch)) {
	    		nUpperCase++;
	    	}
	    	
	    	else if(Character.isLowerCase(ch)){
	    		nLowerCase++;
	    	}
	    	
	    	else if(Character.isDigit(ch)){
	    		nDigits++;
	    	}
	    	
	    	else {
	    		nOthers++;
	    	}
	    }
	    
	    System.out.println("ntotalChars : "+ntotalChars);
	    System.out.println("nTotal UpperCase : "+nUpperCase);
	    System.out.println("n Lowercase :" + nLowerCase);
	    System.out.println("n Digits : "+nDigits);
	    System.out.println("n Others : "+nOthers);
	    
		
	}
}
