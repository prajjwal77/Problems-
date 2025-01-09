package PriorityQueue;
//Max heap
public class InsertionHeap {
	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
	}
	public static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void heapify(int[] arr, int n,int i) {
		//i = 2 * parent +1
		//find parent
		int parent = (i-1)/2;
		
		//max heap
		if(arr[parent] > 0) {
			if(arr[i] > arr[parent]) {
				Swap(arr, i, parent);
				
				//recursively call heapify for the parent node
				heapify(arr, n, parent);
			}
		}
	}
	public static int insert(int[] arr, int n, int value) {
		 //increment size of the heap
		n++;
		arr[n-1] = value;
		heapify(arr, n, n-1);
		return n;
	}
	public static void main(String[] args) {
		int Max = 100;
		int[] arr = new int[Max];
		arr[0] = 100;
		arr[1] = 70;
		arr[2] = 60;
		arr[3] = 50;
		arr[4] = 55;
		
		//take the current size of array
		int n = 5;
		System.out.println("Before insert, heap elements are : ");
		printArray(arr, n);
		
		int value =80;
		n = insert(arr, n, value);
		System.out.println("After insertion, heap elements are : ");
		printArray(arr, n);
	}
	
} 
