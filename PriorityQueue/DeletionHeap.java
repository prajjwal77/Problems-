package PriorityQueue;

public class DeletionHeap {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void heapify(int[] arr, int n, int i) {
		// initialize largest as root
		int largest = i;
		int l = 2 * i + 1;// left child
		int r = 2 * i + 2;// right child

		// if left child is larger than the root
		if (l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		// if right child is larger than the root
		if (l < n && arr[r] > arr[largest]) {
			largest = r;
		}
		// if largest is not the root
		if (largest != i) {
			swap(arr, i, largest);

			heapify(arr, n, largest);
		}
	}

	public static int delete(int[] arr, int n) {
		// get the last element
		int lastElement = arr[n - 1];
		// replace root with the last element
		arr[0] = lastElement;

		//decrement n
		n--;
		heapify(arr, n, 0);
		
		return n;
	}

	public static void main(String[] args) {
		int Max = 100;
		int[] arr = new int[Max];
		arr[0] = 100;
		arr[1] = 70;
		arr[2] = 60;
		arr[3] = 40;
		arr[4] = 50;

		// take the current size of array
		int n = 5;
		System.out.println("Before delete, heap elements are : ");
		printArray(arr, n);

		int value = 80;
		n = delete(arr, n);
		System.out.println("After delete, heap elements are : ");
		printArray(arr, n);
	}
}
