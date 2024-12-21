package LeetCode;
//Geeksorgeeks
public class PeekElement {
	public static int findPeak(int[] arr, int l, int h, int n) {
		int m = (l + h) / 2;
		if ((m == 0 || arr[m] >= arr[m - 1]) && (arr[m] >= arr[m + 1] || m == n - 1)) {
			return m;
		}

		else if (m > 0 && arr[m - 1] > arr[m]) {
			return findPeak(arr, l, m - 1, n);
		} else {
			return findPeak(arr, m + 1, h, n);
		}
	}

	public static int peekElement(int[] arr, int n) {
		return findPeak(arr, 0, n - 1, n);
	}

	public static void main(String[] args) {
		int arr[] = {6,5,2,4,9,7,6,4,8};
		
	}
}
