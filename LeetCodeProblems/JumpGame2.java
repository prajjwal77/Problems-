package LeetCode;

public class JumpGame2 {
	
		 public static int jump(int[] nums) {
	         int jumps = 0;        
	        int current = 0;     
	        int n = 0;      

	        for (int i = 0; i < nums.length - 1; i++) {
	          
	            n = Math.max(n, i + nums[i]);
	            if (i == current) {
	                jumps++;        
	                current = n;  
	                if (current >= nums.length - 1) {
	                    break;
	                }
	            }
	        }
	        return jumps;
	    
	}
		 public static void main(String[] args) {
			  int[] arr= {3,2,1,0,4};
				System.out.println("Given array :");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]);
				}
				System.out.println();
				int j = jump(arr);
				System.out.println(j);
		}

}
