import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyThread extends Thread {

	static Map map = new HashMap();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  
		map.put("r1", 110);
		map.put("r5", 110);
		map.put("r7", 110);
		
		MyThread t1 = new MyThread();
		t1.start();
		
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry  entry = (Map.Entry) itr.next();
			System.out.println("key : "+entry.getKey() +" value : "+ entry.getValue());
			
			Thread.sleep(3000);
		}
		
	}
	
	public void run() {
		map.put("r3", 120);
		map.put("r5", 120);
		map.put("r7", 120);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
