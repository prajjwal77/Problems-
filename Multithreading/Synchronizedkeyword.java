package Multithreading;

class Car implements Runnable{
	synchronized public void run(){
		try {
			System.out.println(Thread.currentThread().getName()+"Has entered the parking lot...");
			Thread.sleep(2000);
			
			System.out.println(Thread.currentThread().getName()+"Got into car to drive...");
			Thread.sleep(2000);
			
			System.out.println(Thread.currentThread().getName()+"Started to drive car...");
			Thread.sleep(2000);
			
			System.out.println(Thread.currentThread().getName()+"Came back to parking lot...");
			Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println("Some problem...");
		}
	}
}
public class Synchronizedkeyword {
	public static void main(String[] args) {
		Car c1 =new Car();
		
		Thread t1 =new Thread(c1);
		Thread t2 =new Thread(c1);
		Thread t3 =new Thread(c1);
		
		t1.setName("Son -1");
		t2.setName("Son -2");
		t3.setName("Son -3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
