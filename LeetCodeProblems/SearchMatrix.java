package LeetCode;

import java.util.Scanner;

public class SearchMatrix {
	public static boolean searchMatrix(int[][] matrix, int traget) {
		int low=0;
		int m = matrix.length;
		int n = matrix[0].length;
		int highIndex = m*n-1;
		int high = highIndex;
		while(low<=high) {
			int midIndex = low+(high-low)/2;
			int midEle = matrix[midIndex/n][midIndex%n];
			if(midEle == traget) {
				return true;
			}
			else if(midEle < traget) {
				low =midIndex+1;
			}
			else {
				high = midIndex-1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4},
				{10,11,12,13},
				{20,21,22,23},
				{30,31,32,33}
		};
		
		int target ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your targeted value : ");
		target = scanner.nextInt();
		boolean bool =searchMatrix(arr,target);
		System.out.println(bool);
		
	}

}
