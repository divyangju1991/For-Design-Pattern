
public class RotationalPalinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString;
        inputString = "aaaad";
        
        isRotationalPaliondrome(inputString);
	}
	
	/**wrapper method which calls rotateString() method, until we have checked all possible rotations of String.
     * @param inputString
     * @return true if inputString is rotation of palindrome
     */
    public static boolean isRotationalPaliondrome(String inputString){
                  char ar[]=inputString.toCharArray();
                  for(int x=0;x<inputString.length();x++){
                        rotateString(ar);
                        if(isPalindrome(ar)){
                               System.out.println("inputString(i.e "+inputString+") is rotation of the palindrome: "+String.valueOf(ar));
                               return true;
                        }
                  }
                  return false;     
    }
    
    /**
     * Method rotates the String.
     */
    public static void rotateString(char[] ar){
           char temp = ar[0];
           int x=0;
           for(x=0;x<ar.length-1;x++){
                  ar[x]=ar[x+1];
           }
           ar[x]=temp;
    }
    
    /**
     *
     */
    public static boolean isPalindrome(char ar[]){
           for(int i=0,j=ar.length-1; i<(ar.length/2); i++,j--){
           if(ar[i]!=ar[j])
                  return false;
      }
      return true;
    }
    
}