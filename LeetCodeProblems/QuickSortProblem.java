package LeetCode;

public class QuickSortProblem {
	public static int partition(int[] arr,int l, int h) {
		int i = l;
		//pivot as the first element in an array
		int pivot = arr[i];
		
		for(int j=l+1;j<=h;j++) {
			//j - to take care of the bigger elements than the  pivot
			//i - to take care of the smaller elements than the pivot
			
			if(arr[j]<=pivot) {
				//increment i
				i =i+1;
				//swap(arr[i],arr[j])
				int tem = arr[i];
				arr[i] = arr[j];
				arr[j] = tem;
			}
		}
		//swap(arr[l],arr[i])
		//to return the correct index of the pivot element 
		int tem = arr[l];
		arr[l] = arr[i];
		arr[i] = tem;
		
		return i;
	}
	public static void quickSort(int[] arr, int l,int h) {
		if(l<h) {
			//1. Divide the array into sub-problems
			int m = partition(arr, l, h);
			//2. Conquer those sub-problems via Recursion
			quickSort(arr, l, m-1);
			quickSort(arr, m+1, h);
			//3. No need of combine part
		}
	}
	public static void printArr(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {50,20,70,90,10,13,17,21};
		int  n = arr.length;
		System.out.println("Array Before Sort : ");
		printArr(arr,n);
		
		quickSort(arr,0,n-1);
		System.out.println();
		System.out.println("Array after sort : ");
		printArr(arr,n);
		
		
	}
}
