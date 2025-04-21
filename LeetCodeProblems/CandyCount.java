package LeetCode;

import javax.xml.transform.Source;

public class CandyCount {
	public static int candyCount(int[] arr) {
		int n = arr.length;
		int dp[] = new int[n];
		int total =0;
		for(int i=0;i<n;i++) {
			dp[i]=1;
		}
		
		//left to right 
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				dp[i] = arr[i-1]+1;
			}
		}
		//right to left
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>arr[i+1] && dp[i]<= dp[i+1]) {
				dp[i] = dp[i+1]+1;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(dp[i]+" ");
			total += dp[i];
		}
		System.out.println();
		return total;
	}
	public static void main(String[] args) {
		int [] arr = {1,5,3,1};
		int count = candyCount(arr);
		System.out.println(count);
	}
}
