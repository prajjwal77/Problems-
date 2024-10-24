package LeetCode;

public class JumpGame {

	  public static boolean canJump(int[] nums) {
	        int n =0;
	        for(int i=0;i<nums.length;i++){
	            if(i>n){
	                return false;
	            }
	         n=Math.max(n,i+nums[i]);
	        }
	        return true;
	    }
	  public static void main(String[] args) {
		  int[] arr= {3,2,1,0,4};
			System.out.println("Given array :");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			boolean b =canJump(arr);
			System.out.println(b);
	}
}
