package LeetCode;
//TC = O(nlogn)
//SC = O(n)
public class MergeSortProblem {
	public static void mergeSort(int[] arr, int i, int j) {
		if (i < j) {
			int mid = i + (j - i) / 2;

			mergeSort(arr, i, mid);

			mergeSort(arr, mid + 1, j);

			mergeProcedure(arr, i, mid, j);
		}
	}

	public static void mergeProcedure(int[] arr, int l, int mid, int r) {
		// l = lower bound
		// r = right bound or upper bound
		int i, j, k;

		// size of the left and right sub-array
		int n1 = mid - l + 1;
		int n2 = r - mid;

		// creating left sub-array and right sub-array
		int lSubArray[] = new int[n1];
		int rSubArray[] = new int[n2];

		// Copy data to subarrays
		for (i = 0; i < n1; i++) {
			lSubArray[i] = arr[l + i];
		}
		for (j = 0; j < n2; j++) {
			rSubArray[j] = arr[mid + 1 + j];
		}

		// Initial indexes of subarrays and merged array
		i = 0;
		j = 0;
		k = l; // Start merging from index `l`

		// Merge the two subarrays back into arr[]
		while (i < n1 && j < n2) {
			if (lSubArray[i] <= rSubArray[j]) {
				arr[k] = lSubArray[i];
				i = i + 1;
			} else {
				arr[k] = rSubArray[j];
				j = j + 1;
			}
			k = k + 1;
		}

		// Copy any remaining elements of lSubArray[], if any
		while (i < n1) {
			arr[k] = lSubArray[i];
			i = i + 1;
			k = k + 1;
		}

		// Copy any remaining elements of rSubArray[], if any
		while (j < n2) {
			arr[k] = rSubArray[j];
			j = j + 1;
			k = k + 1;
		}
	}

	public static void printArr(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 50, 20, 40, 90, 88, 11, 13 };
		int n = arr.length;
		System.out.println("Before sorting of array : ");
		printArr(arr, n);
		mergeSort(arr, 0, n - 1);
		System.out.println();
		System.out.println("After sorting of array :");
		printArr(arr, n);
	}
}
