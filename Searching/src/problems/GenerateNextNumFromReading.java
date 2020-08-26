package problems;

public class GenerateNextNumFromReading {

	public String generateNextNumFromReading(int n){
		
		StringBuilder sb = new StringBuilder("1");
		
		while(n-- > 1){
			StringBuilder tmp = new StringBuilder();
			int count = 1;
			
			for(int i = 1; i < sb.length(); i++){
				
				if(sb.charAt(i) == sb.charAt(i - 1))
					count++;
				else {
					tmp.append(count);
					tmp.append(sb.charAt(i - 1));
					count = 1;
				}
			}
			
			tmp.append(count);
			tmp.append(sb.charAt(sb.length() - 1));
			sb = tmp;
		}
		
		return sb.toString();
	}
}
