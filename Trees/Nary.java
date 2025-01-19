package Trees;
//N-ary  tree 

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Nary {
	static class Node {
		int key;
		// all the children stored in a list
		ArrayList<Node> child;

		Node(int val) {
			key = val;
			child = new ArrayList<>();
		}
	}

	public static List<Integer> preorderTraversal(Node root) {
		Stack<Node> stack = new Stack<>();

		// 'Preorder'-> contains all the
		// visited nodes
		ArrayList<Integer> Preorder = new ArrayList<>();

		stack.push(root);

		while (!stack.isEmpty()) {
			Node temp = stack.peek();
			stack.pop();
			// store the key in preorder vector(visited
			// list)
			Preorder.add(temp.key);
			// Push all of the child nodes of temp into
			// the stack from right to left.
			for (int i = temp.child.size() - 1; i >= 0; i--) {
				stack.push(temp.child.get(i));
			}
		}
		return Preorder;
	}

	public static List<Integer> postorder(Node root) {
		List<Integer> postorder = new ArrayList<>();
		if (root == null) {
			return postorder; // Return an empty list if root is null
		}

		Stack<Node> stack = new Stack<>();
		Stack<Node> output = new Stack<>(); // Auxiliary stack to store nodes in postorder sequence

		stack.push(root);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			output.push(node); // Add the current node to the output stack

			// Push children onto the stack to process them before the parent
			for (Node child : node.child) {
				stack.push(child);
			}
		}

		// Reverse the nodes in the output stack into the postorder list
		while (!output.isEmpty()) {
			postorder.add(output.pop().key);
		}

		return postorder;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.child.add(new Node(2));
		root.child.add(new Node(3));
		root.child.add(new Node(4));

		root.child.get(0).child.add(new Node(5));
		root.child.get(0).child.get(0).child.add(new Node(10));
		root.child.get(0).child.add(new Node(6));
		root.child.get(0).child.get(1).child.add(new Node(11));
		root.child.get(0).child.get(1).child.add(new Node(12));
		root.child.get(0).child.get(1).child.add(new Node(13));
		root.child.get(2).child.add(new Node(7));
		root.child.get(2).child.add(new Node(8));
		root.child.get(2).child.add(new Node(9));

		System.out.println("PreOrder Traversal : " + preorderTraversal(root));
		System.out.println("PostOrder Traversal : " + postorder(root));

	}
}
