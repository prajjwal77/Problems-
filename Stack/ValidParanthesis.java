package HashMapProblems;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

	public static boolean isValid(String str) {
		// Convert the input string into a character array
		char[] chars = str.toCharArray();
		Stack<Character> stack1 = new Stack<>();

		for (char ele : chars) {
		
			if (ele == '(' || ele == '[' || ele == '{') {
				stack1.push(ele);
			} else {
				
				if (stack1.empty()) {
					return false;
				}

				char top = stack1.pop();
				if (top == '(' && ele != ')') {
					return false;
				} else if (top == '{' && ele != '}') {
					return false;
				} else if (top == '[' && ele != ']') {
					return false; 
				}
			}
		}


		return stack1.empty();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter paranthesis : ");
		String str = scanner.nextLine();
		System.out.println("Is the given isValid : " + isValid(str));
	}
}
