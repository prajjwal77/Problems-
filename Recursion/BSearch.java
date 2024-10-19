package Recursion;

import java.util.Scanner;

public class BSearch {

	public static int binarySearch1(int[] arr, int low, int high, int target) {
        if (low > high) {
            // Target not found
            return -1;
        }
        
        int mid = low + (high - low) / 2;

        // Check if the target is at mid
        if (arr[mid] == target) {
            return mid;
        }
        // If target is greater, search in the right half
        else if (arr[mid] < target) {
            return binarySearch1(arr, mid + 1, high, target);
        }
        // If target is smaller, search in the left half
        else {
            return binarySearch1(arr, low, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target;

        System.out.println("Enter the Targeted value: ");
        target = scanner.nextInt();

        int result = binarySearch1(arr, 0, arr.length - 1, target);
        System.out.println("Index of targeted value is: " + result);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
