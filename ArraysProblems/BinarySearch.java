package Arrays;

import java.util.Scanner;

public class BinarySearch {
	
	private static int binarySearch(int[] arr, int target) {
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			int mid = low+(high-low)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size of array :");
		n=scanner.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the sorted element of array :");
		
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		
		int target ;
		System.out.println("Enter your targeted element :");
		target = scanner.nextInt();
		
		int result=binarySearch(arr,target);
		if(result==-1) {
			System.out.println("Element Not Found");
		}
		else {
			System.out.println("Element found at "+result);
		}
	
	}
}
