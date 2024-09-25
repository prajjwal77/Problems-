package Multithreading;
class Example implements Runnable{
	public void run() {
		for(int i=0;i<3;i++) {
			try {
				System.out.println("Focus is Important...");
				Thread.sleep(2000);
			}catch (InterruptedException e) {
			    System.out.println("Thread is Interrupted....");
			}
		}
	}
}
public class InterruptMethod {
public static void main(String[] args) {
	Example example =new Example();
	Thread tt2 = new Thread(example);
	tt2.start();
	tt2.interrupt();
}
}
