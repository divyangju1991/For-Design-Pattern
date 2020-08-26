package practice;

public class RabinKarpPract {
	
	public static final int D = 256; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void patternSearch(String txt, String pattern, int q){
		
		int n = txt.length();
		int m = pattern.length();
		int h = 1;
		int p = 0;
		int t = 0;
	
		for(int i=0; i<m-1; i++){
			h = (D*h)%q;
		}
		
		for(int i=0;i<m;i++){
			p = (D*p + pattern.charAt(i))%q;
			t = (D*t + txt.charAt(i))%q;
		}
		
		for(int i=0;i<=n-m;i++){
			
			if(p == t){
				
				int j=0;
				
				for(;j<m;j++){
					
					if(txt.charAt(j) != pattern.charAt(j))
						break;
				}
				
				if(j == m)
					System.out.println("Found pattern index "+i);
			}
			
			if(i<n-m){
				
				t = (D*(t - txt.charAt(i)*h) + txt.charAt(i+m))%q; 
				
				if(t<q)
					t = (t+q);
			}
		}
		
	}
}
