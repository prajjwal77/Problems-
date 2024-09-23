package Multithreading;

class MyThread extends Thread{

	public void run() {
		System.out.println("Child Thread");
	}
}
public class CreatingThread extends Thread{
	public static void main(String[] args) {
		System.out.println("Main Thread ...");
		MyThread thread = new MyThread();
		//thread.run();
		thread.start();
	}
}
