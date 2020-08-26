package interview;

public class ReverseStringRecursionExample {
	
	static String s = "";
	
    public static void main(String...args){ 
           String originalString="abcde"; //String to be reversed
           s = "";
           
           System.out.println("Original String: "+originalString);
           System.out.print("Reversed String: ");
           //reverseRecursively(originalString);
           System.out.println(reverseRecursively(originalString));
    }
    
    /*
     * reverse string recursively.
     */
    public static String reverseRecursively(String str) {
 
    	   if(null == str || str.isEmpty()){
    		   //System.out.println("String is null or Empty");
    		   s += "";
    	   } else if (str.length() == 1){
                  //System.out.print(str);
    		   s += str;
           }
           else {
        	      //Head Recusrsion
                  reverseRecursively(str.substring(1, str.length()));
                  //System.out.print(str.substring(0, 1));
                  s += str.substring(0, 1);
           }
    	   
    	   return s;
    }
}