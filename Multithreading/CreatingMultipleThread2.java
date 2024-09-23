package Multithreading;

import java.util.Scanner;

class Calc1 implements Runnable{
	public void run() {
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
}
class Message1 implements Runnable {
	
	public void run() {
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
public class CreatingMultipleThread2 {
	public static void main(String[] args) {
		System.out.println("Main Thread  Started......");
		 Calc1 c1 =new Calc1();
		 Message1 m1 =new Message1();
		 
		 Thread t1 =new Thread(c1);
		 Thread t2 =new Thread(m1);
		 
		 t1.start();
		 t2.start();
	}
}
