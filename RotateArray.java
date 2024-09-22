package LeetCode;

//6/150
public class RotateArray {

	
		  public static  void rotate(int[] nums, int k) {
		       int n = nums.length;
		        int[] rotated = new int[n]; 
		        k = k % n; 
		        for (int i = 0; i < n; i++) {
		            rotated[(i + k) % n] = nums[i]; 
		        }
		        for (int i = 0; i < n; i++) {
		            nums[i] = rotated[i];
		        }
		        System.out.println();
		    for(int i=0;i<n;i++) {
		    	System.out.print(nums[i]+" ");
		    }
	}
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7};
	System.out.println("Given array :");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
	int k=3;
	rotate(arr,k);
 	}
}
