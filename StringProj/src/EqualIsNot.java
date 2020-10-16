import java.util.Arrays;

/**
 * @author Divyang
 *
 */
public class EqualIsNot {

	/*
	 * 
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
	 */
	public boolean equalIsNot(String str) {
		  if(str == null || str.isEmpty()) {
		    return true;
		  } else {
			 // System.out.println(" is length " + String.valueOf(str.split("is", -1).length-1));
			 // System.out.println(" not length " + String.valueOf(str.split("not", -1).length-1));
			  System.out.println("not with simple" + Arrays.toString(str.split("is")));
			  System.out.println("not with simple" + Arrays.toString(str.split("is", -1)));
		    return ((str.split("is", -1).length-1) == (str.split("not", -1).length-1));
		  }
		}
	
	public static void main(String args[]) {
		EqualIsNot equalIsNot = new EqualIsNot();
		
		System.out.println(" output of equalIsNot('isnotis') :" + equalIsNot.equalIsNot("isnotis") );
	}
	
}
