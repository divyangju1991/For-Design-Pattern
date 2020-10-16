package string;

public class DuplicateCharCount {
	
	public static final int SIZE = 256;
	
	public static int duplicateCount(String str){
		
		int n = str.length();
		int[] count = new int[SIZE];
		int counter = 0;
		
		for(int i=0; i<n; i++){
			if(++count[str.charAt(i)] == 2){
				++counter;
			}
		}
		
		System.out.println(counter);
		return counter;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateCount("aaaaa");
		duplicateCount("Divyang");
		duplicateCount("sam");
		duplicateCount("sama");
		duplicateCount("samam");
	}

}
