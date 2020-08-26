package Problems;

public class WhoWinElection {

	public int checkWhoWinTheElection(int a[]){
		
		int max = 0,counter=0, winner=0, n=a.length;
		for(int i=0; i<n; i++){
			
			counter=0;
			for(int j=i+1; j<n; j++){
				
				if(a[i] == a[j]){
					++counter;
				}
			}
			
			if(counter>max){
				max=counter;
				winner = a[i];
			}
		}
		
		return winner;
	}
}
