package Arrays;

import java.util.Scanner;

public class LinearSearchInArray {
	public static void main(String[] args) {
		int n;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size of array :");
		n=scanner.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the element of array :");
		
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		
		int target ;
		System.out.println("Enter your targeted element :");
		target = scanner.nextInt();
		
		int index=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("Element Not Found");
		}
		else {
			System.out.println("Element found at "+index);
		}
	}

}
