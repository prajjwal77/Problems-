package LeetCode;

import java.util.Stack;

public class LongestValidParanthesis {
	 public int longestValidParentheses(String s) {
	        // Initialize a stack and push a base index -1
	        Stack<Integer> stack = new Stack<>();
	        stack.push(-1);
	        
	        int maxLength = 0;
	        
	        // Iterate through the string
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            
	            if (c == '(') {
	                // Push the index of '(' onto the stack
	                stack.push(i);
	            } else {
	                // Pop the top of the stack for a closing parenthesis
	                stack.pop();
	                
	                if (stack.isEmpty()) {
	                    // If the stack becomes empty, push the current index as a base
	                    stack.push(i);
	                } else {
	                    // Calculate the valid substring length
	                    maxLength = Math.max(maxLength, i - stack.peek());
	                }
	            }
	        }
	        
	        return maxLength;
	    
	    }
	public static void main(String[] args) {
		
	}
}
