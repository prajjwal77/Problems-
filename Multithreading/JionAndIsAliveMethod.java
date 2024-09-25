package Multithreading;

class Print implements Runnable{
	public void run() {
		try {
			for(int i=0;i<2;i++) {
				System.out.println("Focus is important....");
				Thread.sleep(3000);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some Problem...");
		}
	}
}
public class JionAndIsAliveMethod {
	public static void main(String[] args) throws Exception{
		System.out.println("Main Thread Started....");
		Print print =new Print();
		
		Thread t1 = new Thread(print);
		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
		t1.join();
		System.out.println("Main thread is ended the work....");
	}
}
