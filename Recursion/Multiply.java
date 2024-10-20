package Recursion;

import java.util.Scanner;


public class Multiply {
	public static void table(int num , int time) {
		if(time ==1) {
			System.out.print(num+" ");
			return;
		}
			table(num,time-1);
			System.out.print(num*time+" ");
		
	}
	public static void main(String[] args) {
		int num,time;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value to find multiple : ");
		num = scanner.nextInt();
		System.out.println("Enter the value to print the times of multiple : ");
		time = scanner.nextInt();
		table(num,time);
	}
}
