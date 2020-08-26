package chainOfResponsibility;

public class ChainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain chain = new Chain(); 
        
        //Calling chain of responsibility  
        chain.process(new Number(90));  
        chain.process(new Number(-50));  
        chain.process(new Number(0));  
        chain.process(new Number(91));  
    }  
}
