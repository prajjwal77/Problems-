package Multithreading;
class Library implements Runnable{
	String res1 =new String("Java");
	String res2 =new String("MY SQL");
	String res3 =new String("DSA");
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("STUDENT1")) {
			try {
				Thread.sleep(3000);
				synchronized (res1) {
					System.out.println("Student-1 has aquired "+res1);
					Thread.sleep(3000);
					synchronized (res2) {
						System.out.println("Student-1 has aquired "+res2);
						Thread.sleep(3000);
						synchronized (res3) {
							System.out.println("Student-1 has aquired "+res3);
							Thread.sleep(3000);
						}
					}
				}
			}catch (Exception e) {
				System.out.println("Some Problem....");
			}
		}else {
			try {
				Thread.sleep(3002);
				synchronized (res3) {
					System.out.println("Student-2 has aquired "+res3);
					Thread.sleep(2000);
					synchronized (res2) {
						System.out.println("Student-2 has aquired "+res2);
						Thread.sleep(2000);
						synchronized (res1) {
							System.out.println("Student-2 has aquired "+res1);
							Thread.sleep(2000);
						}
					}
				}
			}catch (Exception e) {
				System.out.println("Some Proble....");
			}
		}
	}
}
public class DeadLock {
	public static void main(String[] args) {
		Library l1 =new Library();
		
		Thread t1 = new Thread(l1);
		Thread t2 = new Thread(l1);
		
		t1.setName("STUDENT1");
		t2.setName("STUDENT2");
		
		t1.start();
		t2.start();
	}
}
