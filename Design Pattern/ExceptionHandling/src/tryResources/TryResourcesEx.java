package tryResources;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class TryResourcesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(ObjectInput is = null; ObjectOutput os = null){
			String s = null;
			System.out.println(is);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//System.out.println(is);
		}

	}

}
