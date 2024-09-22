package LeetCode;

public class StockMarket2 {
	public static int maxProfit(int[] prices) {
        if(prices==null||prices.length==0) return 0;
        int totalProfit = 0;

       for (int i = 1; i < prices.length; i++) {
           if (prices[i] > prices[i - 1]) {
               totalProfit += prices[i] - prices[i - 1];
           }
       }

       return totalProfit;
   }
public static void main(String[] args) {
	int []arr = {7,1,5,3,6,4};
	int maxProfit = maxProfit(arr);
	System.out.println("Max Profit :"+maxProfit);
}
}
