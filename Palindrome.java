package Arrays;

public class Palindrome {
	 public static void main(String[] args) {
		int[] arr = {1,2,3,5,3,2,1};
		int n=arr.length;
		boolean flag=false;
		for(int i=0;i<n/2;i++) {
			if(arr[i]!=arr[n-i-1]) {
				flag=true;
				System.out.println("Not Palindrome");
				break;
			}
		}
		if(flag==false) {
			System.out.println("Palindrome");
		}
	}
}
//TC O(n)
//SC O(1)
