package cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName() + " has started");
		
		CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
		
		PassengerThread p1 = new PassengerThread(1000, cyclicBarrier, "John");
		PassengerThread p2 = new PassengerThread(2000, cyclicBarrier, "Divyang");
		PassengerThread p3 = new PassengerThread(3000, cyclicBarrier, "Kamlesh");
		PassengerThread p4 = new PassengerThread(4000, cyclicBarrier, "Rohan");
		
		PassengerThread p5 = new PassengerThread(1000, cyclicBarrier, "Rasmi");
		PassengerThread p6 = new PassengerThread(2000, cyclicBarrier, "Smita");
		PassengerThread p7 = new PassengerThread(3000, cyclicBarrier, "Trupti");
		PassengerThread p8 = new PassengerThread(4000, cyclicBarrier, "Dipu");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		p5.start();
		p6.start();
		p7.start();
		p8.start();
		
		System.out.println(Thread.currentThread().getName() + " has finished");
	}

}
