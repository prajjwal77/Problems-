package Stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleInHistogram {

	public static  int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] ps = new int[n]; // Previous Smaller Elements
        int[] ns = new int[n]; // Next Smaller Elements

        Stack<Integer> stack = new Stack<>();
        
        // Calculate Previous Smaller Elements
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            ps[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Clear the stack 
        stack.clear();

        // Calculating Next Smaller Elements
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            ns[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Calculating the maximum rectangle area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = ns[i] - ps[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the size of array : ");
		Scanner scanner =new Scanner(System.in);
		n=scanner.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the height if histogram : ");
		for(int i=0;i<n;i++) {
			arr[i]= scanner.nextInt();
		}
		int larRectangle = largestRectangleArea(arr);
		System.out.println("Largest height in histogram : "+larRectangle);
	}
}
