package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;


public class CountInversions {
	public static int inversionCount(int[] arr, int n){
		int count =0;
		for(int i=0;i<n;i++) {
			for(int j=0;i<n;j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
	//Divide and conquer
	public static int inversionCountDC(int[] arr, int l, int h) {
		int count =0;
		if (l < h) {
			// 1.divide the array into two subproblems
			int mid = l + (h - l) / 2;
			//2. conquer the subproblems using the recursive approach
			//left subarray
			count += inversionCountDC(arr, l, mid);
			//right subarray
			count += inversionCountDC(arr, mid+1, h);
			//3. Combine the solution
			count+= mergeProcedure(arr,l,mid,h);
		
		}
		return count;
	}
	public static int mergeProcedure(int[] arr, int l,int mid,int h) {
		int swap =0;
		int[] lsubArray = Arrays.copyOfRange(arr, l, mid+1);
		int[] rsubArray = Arrays.copyOfRange(arr, mid+1, h+1);
		int i=0,j=0,k=l;
		
		while(i<lsubArray.length && j<rsubArray.length) {
			if(lsubArray[i] <= rsubArray[j]) {
				arr[k++] = lsubArray[i];
				i=i+1;
			}
			else {
				arr[k++] = rsubArray[j];
				j=j+1;
				
				swap+=(mid+1)-(l+1);
			}
			
		}
		
		//copy all remaining elements form left subarray
		while(i < lsubArray.length) {
			arr[k++] = lsubArray[i];
			i=i+1; 
		}
		//copy all remaining elements form right subarray
		while(i < rsubArray.length) {
			arr[k++] = rsubArray[j];
			j=j+1; 
		}
		return swap;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 8, 3, 4 };
		int n = arr.length;

		//int count = inversionCount(arr, n);

		int countOpt = inversionCountDC(arr, 0, n - 1);
		//System.out.println("The inversion count of array using brute force approach is : " + count);
		System.out.println("The inversion count of array using divide and conquer approach : " + countOpt);
	}
}
