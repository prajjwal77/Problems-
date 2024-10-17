package Recursion;

import java.util.Scanner;

public class FindingPowerUsingResursion {
	public static int findingPowerUsingResursion (int a,int b) {
		int mid = 0, result = 0,finalResult = 0;
		 if(b==1) {
			 return a;
		 }
		 else {
			 mid=b/2;
			 result = findingPowerUsingResursion(a,mid);
			 finalResult =result*result;
			 if(b%2==0) {
				 return finalResult;
			 }
			 else {
				return a*finalResult;
			}
		 }
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a and b : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = findingPowerUsingResursion(a,b);
		System.out.println("a^b = "+ result);
	}

}
