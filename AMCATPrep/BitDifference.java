package AMCATPrep;

import java.util.Scanner;

public class BitDifference {
	public static int[] decToBin(int nums) {
		int div=0;
		int[] binary = new int[32];
		int i=0;
		while(nums>0) {
			binary[i] = nums%2;
			nums = nums/2;
			i++;
		}
		int result[] = new int[i];
		for (int j = 0; j < i ; j++) {
	       result[j] = binary[i-j-1];
	    }
		return result;
	}
	public static void main(String[] args) {
		   int nums1, nums2;
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter two numbers to count bit interchange (1 & 2): ");
	        nums1 = scanner.nextInt();
	        nums2 = scanner.nextInt();

	        // Convert both numbers to binary arrays
	        int[] binary1 = decToBin(nums1);
	        int[] binary2 = decToBin(nums2);

	        System.out.print("Binary representation of " + nums1 + ": ");
	        for (int bit : binary1) {
	            System.out.print(bit + " ");
	        }
	        System.out.println();

	        System.out.print("Binary representation of " + nums2 + ": ");
	        for (int bit : binary2) {
	            System.out.print(bit + " ");
	        }
	        System.out.println();

	        scanner.close();
	    }
}
