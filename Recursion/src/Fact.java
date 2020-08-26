
public class Fact {
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int calFac(int n) {

		if(n==1){
			return 1;
		} else if(n == 0){
			return 1;
		} else {
			return n*calFac(n-1);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ans of calFac(-1) = "+calFac(-1));
	}

}
