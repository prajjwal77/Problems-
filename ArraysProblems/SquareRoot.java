package Arrays;

import java.util.Scanner;

public class SquareRoot {
	public static int squareroot(int num) {
		int low=0,high=num,result=-1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			long var = mid*mid;
			if(var==num) {
				return mid;
			}
			else if(var<num){
				result=mid;
				low =mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int num;
		System.out.println("Enter the number which you want square root : ");
		num=scanner.nextInt();
		
		int result =squareroot(num);
		System.out.println("Square Root is : "+result);
	}
}
