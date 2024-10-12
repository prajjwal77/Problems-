package Arrays;

public class ReversalArray {
	public static void main(String[] args) {
		int []arr= {1,3,5,7,10};
		int n=arr.length;
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}
}
//TC O(n)
//SC O(1)