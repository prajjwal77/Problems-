package Arrays;

import java.util.Arrays;
//TC = O(n*n)
//SC = O(1)
public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean swapped =false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
					
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		int []arr = {20,50,10,12,45,67,90};
		bubbleSort(arr);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));
	}
}
