package Multithreading;


public class MainThread {
	public static void main(String[] args) {
		System.out.println("Main Thread");
		System.out.println("Before Changing");
		String name = Thread.currentThread().getName();
		System.out.println("The name of main thread is : "+name);
		System.out.println("The priority of main thread is : "+Thread.currentThread().getPriority());
		
		System.out.println("After Changing : ");
		Thread thread =Thread.currentThread();
		thread.setName("Prajjwal");
		thread.setPriority(1);
		
		String newName = Thread.currentThread().getName();
		System.out.println("The name of main thread : "+newName);
		System.out.println("The priority of main thread is : "+Thread.currentThread().getPriority());
	}

}
