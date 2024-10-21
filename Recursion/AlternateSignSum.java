package Recursion;

import java.util.Scanner;

public class AlternateSignSum {

	public static int alternateSum(int num) {
		if(num==0) {
			return 0;
		}
		if(num%2==0) {
			return alternateSum(num-1)-num;
		}
		else {
			return alternateSum(num-1)+num;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Enter the num to find the result of alternate sign : ");
		num = scanner.nextInt();
		int result = alternateSum(num);
		System.out.println("The sum of alternate sign is : "+result);
	}
}
