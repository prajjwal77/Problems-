package LeetCode;

public class StockMarket1 {
	private static int maxingProfit(int[] arr) {
		 if(arr ==null || arr.length==0) return 0;
		 
		 int minProfit =Integer.MAX_VALUE;
		 int maxprofit =0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]<minProfit) {
				 minProfit=arr[i];
				 
			 }else {
				 int profit = arr[i]-minProfit;
				 
				 int p=profit;
				 if(p>maxprofit) {
					 maxprofit=p;
				 }
			 }
		 }
		return maxprofit;
	}
public static void main(String[] args) {
	int []arr = {7,1,5,3,6,4};
	int maxProfit = maxingProfit(arr);
	System.out.println("Max Profit :"+maxProfit);
}
}
