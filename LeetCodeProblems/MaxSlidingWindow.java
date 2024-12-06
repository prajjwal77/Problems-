package LeetCode;
//TC = O(n)
//SC = O(n)
import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow {

	public int[] slidingWindow(int[] nums , int k) {
		int n = nums.length;
		int[] r = new int[n-k+1];
		int ri =0;
		Deque<Integer>  q = new ArrayDeque<>();
		for(int i=0;i<nums.length;i++) {
			while(!q.isEmpty() && q.peek()<i-k+1) {
				q.poll();
			}
			while(!q.isEmpty() && nums[q.peekLast()]<nums[i]) {
				q.pollLast();
			}
			q.offer(i);
			if(i>= k-1) {
				r[ri++] =  nums[q.peek()];
			}
		}
		return r;
	}
	public static void main(String[] args) {
		
	}
}
