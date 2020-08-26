package interview;

public class AllCharactersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AllCharactersCount().characterCount("This is it");
	}
	
	public void characterCount(String str){
		
		str = str.replace(" ", "");
		
		while(!str.isEmpty()){
			
			char ch = str.charAt(0);
			
			System.out.println(ch+" count => "+charCount(str, ch));
			
			str = str.replace(""+ch, "");
		}
	}

	private int charCount(String str, char ch) {
		// TODO Auto-generated method stub
		int count = 0;
		
		while(str.indexOf(ch) != -1){
			count++;
			str = str.substring(str.indexOf(ch), str.lastIndexOf(ch));
		}
		return count;
	}

}
