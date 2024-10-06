package Multithreading;

import java.util.Scanner;

class MyThread1 extends Thread{
	public void run() {
		String tName = Thread.currentThread().getName();
		if(tName.equals("CALC")) {
			calc();
		}
		else {
			importantMsg();
		}
	}
	
		public void calc() {
			System.out.println("Calculation Task Started : ");
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter 1st Number : ");
			int num1 = scan.nextInt();
			System.out.println("Enter 2nd Number : ");
			int num2 = scan.nextInt();
			
			int res = num1+num2;
			System.out.println(res);
			System.out.println("Calculation Ended ");
			System.out.println("*************************************************************************");
		}
		public void importantMsg() {
			System.out.println("Displaying Important Message Task : ");
			try {
				for(int i=0;i<3;i++) {
					System.out.println("Focus is important to master skills : ");
					Thread.sleep(2000);
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Some problem");
			}
			System.out.println("Displaying Important message task Ended : ");
		}
}
public class SIngleRunMethod {
  public static void main(String[] args) {
	MyThread1 thread1 =new MyThread1();
	MyThread1 thread2 =new MyThread1();
	
	thread1.setName("CALC");
	thread2.setName("PRINT");
	
	thread1.start();
	thread2.start();
	
  }
}
