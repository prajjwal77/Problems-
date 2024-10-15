package Arrays;

import java.util.Arrays;

public class InsertionSort {
	private static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j] < arr[j-1]) {
				int temp =arr[j];
				arr[j] = arr[j-1];
				arr[j-1]=temp;
				
				j--;
			}
		}
	}
	public static void main(String[] args) {
		int []arr = {50,50,10,1,45,67,90};
		insertionSort(arr);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));
	}
}
