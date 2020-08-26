
public class FibonaciProg {
	
	public static void Fibo(int n, StringBuilder ser, int i, int nSer, int prev){
		if(i == n){
			ser.append(nSer);
			System.out.println(ser);
			return;
		}
		
		ser.append(nSer+", ");

		Fibo(n, ser, i+1, (prev + nSer), nSer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibo(6, new StringBuilder("1, "), 0, 1, 1);
	}

}
