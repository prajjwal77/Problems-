package Recursion;

import java.util.Scanner;

public class Fibonacci {

	public static int findFibonacci(int num) {
		int result =0;
		if(num<=1) {
			return num;
		}
		else {
			result =findFibonacci(num-1)+findFibonacci(num-2);
		}
		return result;
	}
	public static void main(String[] args) {
		int num ,res =0;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the index of fibonacci : ");
		num=scanner.nextInt();
		res =findFibonacci(num);
		System.out.println("Final output : "+res);
	}
}
