import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class SyncBlock extends Thread {

	static Map map = new ConcurrentHashMap();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(3000);  
		synchronized (map) {
			updateMap("r1", 110);
			updateMap("r5", 110);
			updateMap("r7", 110);
		}
		getValue("r5");
		
		SyncBlock t1 = new SyncBlock();
		t1.start();
		getValue("r5");
		
		SyncBlock t2 = new SyncBlock();
		t2.start();
		getValue("r5");
		
		SyncBlock t3 = new SyncBlock();
		t3.start();
		getValue("r5");
		
		Thread.sleep(3000);
		getValue("r5");
		getValue("r5");
		getValue("r5");
		getValue("r5");
		
	}
	
	public void run() {
		
		try {
			
			synchronized (map) {
				updateMap("r3", 120);
				if("Thread-0".equalsIgnoreCase(Thread.currentThread().getName())) {
					updateMap("r5", 140);
				} else if("Thread-2".equalsIgnoreCase(Thread.currentThread().getName())) {
					updateMap("r5", 130);
				} else {
					updateMap("r5", 120);
				}
								updateMap("r7", 120);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			System.out.println("=============== stopped : "+ Thread.currentThread().getName());
			
			Iterator itr = map.entrySet().iterator();
			while(itr.hasNext()) {
				Map.Entry  entry = (Map.Entry) itr.next();
				System.out.println(" After stopped key : "+entry.getKey() +" value : "+ entry.getValue() + Thread.currentThread().getName());
			}
		}
	}
	
	public static void updateMap(String key, Integer value) throws InterruptedException {
		map.put(key, value);
		
		Thread.sleep(3000);
		
	}
	
	public static Integer getValue(String key) {
		System.out.println(" Key for get value "+ key + ": "+ (Integer) map.get(key));
		return (Integer) map.get(key);
	}

}
