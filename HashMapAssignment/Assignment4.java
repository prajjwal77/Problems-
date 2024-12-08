package HashMapProblems;

import java.util.Scanner;
import java.util.TreeMap;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of array : ");
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i=0;i<n;i++) {
			map.put(arr[i],1);
		}
		
		System.out.println("The largest Element is : "+ map.lastEntry().getKey());
	}
}
