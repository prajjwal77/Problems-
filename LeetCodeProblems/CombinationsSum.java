package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationsSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=scanner.nextInt();
		int[] arr = new int[3];
		
		System.out.println("Enter array elements : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		scanner.next();
		System.out.println("Enter your target : ");
		int target = scanner.nextInt();
		
		combinationSum(arr,target);
		}	
	
	private static void combinationSum(int[] nums , int target) {
		List<List<Integer>>result = new ArrayList<>();
		backtrack(result, new ArrayList<>(), nums, target, 0);
		System.out.println(result);
	}
	public static void backtrack (List<List<Integer>>result, List<Integer> temp,int[] nums, int target , int start ) {
		if(target<0) 
			return ;
		
		else if(target==0) {
			result.add(new ArrayList<>(temp));
		}
		
		for(int i=start;i<nums.length;i++) {
			temp.add(nums[i]);
			backtrack(result, temp, nums, target-nums[i], i);
			temp.remove(temp.size()-1);
		}
	}
}
