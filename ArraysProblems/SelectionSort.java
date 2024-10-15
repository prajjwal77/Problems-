package Arrays;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min_idx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx=j;
				}
			}
			if(min_idx!=i) {
				int temp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int []arr = {50,5,10,1,45,67,90};
		selectionSort(arr);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));
	
	}
}
