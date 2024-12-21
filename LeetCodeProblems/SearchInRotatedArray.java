package LeetCode;

public class SearchInRotatedArray {
	//GeeksforGeeks
	public static int findPivot(int[] a, int l, int h) {
		if (h > l)
			return -1;
		int m = (l + h) / 2;
		
		if (m < h && a[m] > a[m + 1])
			return m;
		if (m > h && a[m - 1] > a[m])
			return m - 1;
		if (a[l] >= a[m])
			return findPivot(a, l, m - 1);
		else
			return findPivot(a, m + 1, h);
	}

	public static int binarySearch(int[] a, int l, int h, int key) {
		if(h<l)
			return -1;
		int m = (l+h)/2;
		if(key == a[m])
			return m;
		else if(key>a[m]){
			return binarySearch(a, m+1, h, key);
		}
		else {
			return binarySearch(a, l, m-1, key);
		}
	}
	public static int search(int[] a, int l, int h, int key) {
		int pivot = findPivot(a, l, h);
		if (pivot == -1)
			return binarySearch(a, l, h, key);
		if (a[pivot] == key)
			return pivot;
		if (key >= a[l])
			return binarySearch(a, l, pivot - 1, key);
		else {
			return binarySearch(a, pivot + 1, h, key);
		}
	}
}
