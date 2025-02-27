package InterviewProblems;

import java.util.PriorityQueue;



public class KthElement {
	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int num : nums) {
			minHeap.add(num);
			if(minHeap.size() > k) {
				minHeap.remove();
			}
		}
		
		return minHeap.peek();
	}
	public static void main(String[] args) {
		int arr[]= {55,66,33,21,11,345,67};
		System.out.println(findKthLargest(arr, 2));
	}
}
