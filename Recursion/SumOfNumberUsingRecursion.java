package Recursion;

import java.util.Scanner;

public class SumOfNumberUsingRecursion {
	public static int RecursionSum(int num){
		int sum=0;
		if(num==0) {
			return 0;
		}
		else {
			sum+=num%10+RecursionSum(num/10);
		}
		return sum;
	}
	public static void main(String[] args) {
		int n ;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=scanner.nextInt();
		int sum =RecursionSum(n);
		System.out.println("Sum of digit of number :"+sum);
	}
}
