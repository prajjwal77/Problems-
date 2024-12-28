package Trees;

import java.util.ArrayList;
import java.util.List;


class TreeNode {
	int val;
	TreeNode left = null;
	TreeNode right = null;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}
}

public class TraversalOfBTree {
	static List<Integer> result1 = new ArrayList<>();
	static List<Integer> result2 = new ArrayList<>();
	static List<Integer> result3 = new ArrayList<>();

	// pre-Order Traversal (root->left->right)
	public static List<Integer> preOrder(TreeNode root) {

		if (root == null)
			return result1;

		result1.add(root.val);
		preOrder(root.left);
		preOrder(root.right);

		return result1;

	}

//	in-Order Traversal (left->root->right)
	public static List<Integer> inOrder(TreeNode root) {
		
		if (root == null)
			return result2;

		inOrder(root.left);
		result2.add(root.val);
		inOrder(root.right);

		return result2;

	}

	// post-Order traversal (left->right->root)
	public static List<Integer> postOrder(TreeNode root) {
		
		if (root == null)
			return result3;

		postOrder(root.left);
		postOrder(root.right);
		result3.add(root.val);

		return result3;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		System.out.println(preOrder(root));
		System.out.println(inOrder(root));
		System.out.println(postOrder(root));
	}
}
