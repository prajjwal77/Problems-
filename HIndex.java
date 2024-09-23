package LeetCode;

import java.util.Arrays;

public class HIndex {

	public static int hIndex(int[] citations) {
        Arrays.sort(citations);
       int n = citations.length;
           for (int i = 0; i < n; i++) {
           int h = n - i;  
               if (citations[i] >= h) {
               return h;
           }
       }
           return 0;
   }
	public static void main(String[] args) {
		int[] arr= {3,0,6,1,5};
		System.out.println("Given array :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		int j = hIndex(arr);
		System.out.println(j);
	}
}
