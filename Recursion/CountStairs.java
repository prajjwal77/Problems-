package Recursion;

import java.util.Scanner;

public class CountStairs {
	public static int countWays(int n) {
		int res=0;
		if(n<=1) {
			return n;
		}
		else {
			res= countWays(n-1)+countWays(n-2);
		}
		return res;
	}
	public static void main(String[] args) {
		int n;
		int result=0;
		System.out.println("Enter no. of stairs: ");
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		result = countWays(n+1);
		System.out.println("No. of ways : "+result);
	}
}
