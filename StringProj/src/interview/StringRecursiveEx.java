package string;

//Did head and Tail Recursive
public class StringRecursiveEx {
	
	public static void reverseString(String str){
		
		if(str == null || str.isEmpty()){
			System.out.print("String is empty");
		} else if(str.length() == 1){
			System.out.print(str);
		} else {
			reverseString(str.substring(1, str.length()));
			System.out.print(str.charAt(0));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("Divyang");
	}

}
