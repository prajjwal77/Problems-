package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Permutations {
	public static void main(String[] args) {
	int[] arr = new int[3];
	Scanner scanner = new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.nextInt();
	}
	permute(arr);
	
	}	
	  public static void permute(int[] nums) {
	        List<List<Integer>> result = new ArrayList<>();
	        backtrack(result , new ArrayList<Integer>(),nums);
	        System.out.println(result);

	    }
	    public static void  backtrack(List<List<Integer>> result, List<Integer> temp,int[] nums){
	        if(temp.size()==nums.length){
	            result.add(new ArrayList<>(temp));
	            return;
	        }

	        for(int i=0;i<nums.length;i++){
	            if(temp.contains(nums[i]))
	            continue;

	            temp.add(nums[i]);
	            backtrack(result,temp,nums);
	            temp.remove(temp.size()-1);
	        }
	    }
}
