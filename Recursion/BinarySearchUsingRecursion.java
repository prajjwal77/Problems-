package Recursion;

import java.util.Scanner;

public class BinarySearchUsingRecursion {

	public static int binarySearch(int[] arr,int low,int high,int target) {
		int result =-1;
		while(low<high) {
			int  mid= low+(high-low)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				result =binarySearch(arr, mid+1, high, target);
			}
			else {
				result=binarySearch(arr, low, mid-1, target);
			}
			
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] arr={2,4,6,8,10,12};
		int target;
		System.out.println("Enter the Targeted value :");
		 target =scanner.nextInt();
		System.out.println();
		int result=binarySearch(arr, 0, arr.length-1, target);
		System.out.println("index of targeted value  is : "+result);
	}
}
