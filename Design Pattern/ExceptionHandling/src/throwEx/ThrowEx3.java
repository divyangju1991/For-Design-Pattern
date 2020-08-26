package throwEx;

import java.io.IOException;

public class ThrowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThrowEx3().go();
	}

	public int go() {
		try {
			throw new IOException();
			
		} catch(IOException ie){
			System.out.print("Child Exception");
			
		} catch(Exception ex){
			System.out.print("Super Exception");
		
		}
		
		return 0;
	}
	
}
