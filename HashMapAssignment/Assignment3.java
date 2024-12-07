package HashMapProblems;

import java.util.HashMap;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		// I - enter the size of array
		System.out.println("Enter the size of Array : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// II - inserting element in the array
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		// III- create a HashMap using integer key - value pairs
		HashMap<Integer, Integer> map = new HashMap<>();
		boolean duplicate = false;
		for (int i = 0; i < n; i++) {
			// a- if duplicate element found the first 
			if (map.containsKey(arr[i])) {
				duplicate = true;
				System.out.println("YES");
				break;
			}
			map.put(arr[i], 1);
		}
			if (duplicate == false) {
				System.out.println("NO");
			}
		

	}
}
