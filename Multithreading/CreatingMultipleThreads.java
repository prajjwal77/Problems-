package Multithreading;

import java.util.Scanner;

class Calc extends Thread{
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
class Message extends Thread{
	
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
public class CreatingMultipleThreads {
	public static void main(String[] args) {
		System.out.println("Main Thread Started ....");
		Calc c1 =new Calc();
		Message m1 =new Message();
		
		c1.start();
		m1.start();
	}
}
