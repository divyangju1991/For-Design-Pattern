package throwEx;

import java.io.IOException;

public class ThrowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int go() {
		try {
			throw new IOException();
			
		} catch(Exception ex){
			System.out.print("Super Exception");
			
		} catch(IOException ie){//Unreachable code block
			System.out.print("Child Exception");
		}
		
		return 0;
	}
	
}
