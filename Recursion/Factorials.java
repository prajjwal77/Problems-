package Recursion;
import java.util.Scanner;
//TC = O(n)
//SC = O(n)
public class Factorials {
	public static int findFactorials(int n) {
		int result =0;
		if(n==0 || n==1) {
			return 1;
		}
		else {
			result = n* findFactorials(n-1);
		}
		return result;
	}
	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number to find factorial : ");
		Scanner scanner =new Scanner(System.in);
		n =scanner.nextInt();
		int result =0;
		result=findFactorials(n);
		System.out.println("Result = "+result);
		
	}
}
