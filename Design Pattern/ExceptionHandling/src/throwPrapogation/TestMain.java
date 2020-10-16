package throwPrapogation;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			String s1 = m1();
			System.out.println("S1 value : "+s1);
		} catch(Exception ex){
			System.out.println("Caughted Exception : "+ ex.getMessage());
		}
	}

	public static String m1() throws CustomExcrption {
		String s = "ABC";
		
		m2();
		return s;
	}
	
	public static void m2() throws CustomExcrption {
		int no = 2;
		if(no == 2)
			throw new CustomExcrption("Checked Custom Exception");
	}
}
