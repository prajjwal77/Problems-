package Trees;


import java.util.ArrayList;
import java.util.List;


class TreeNodes {
	int val;
	TreeNodes left;
	TreeNodes right;

	public TreeNodes() {

	}

	public TreeNodes(int val) {
		this.val = val;
	}

	public TreeNodes(int val, TreeNodes left, TreeNodes right) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class BST {
	 public TreeNode deleteNode(TreeNode root, int key) {
	        TreeNode parent = null;
	        TreeNode curr = root;

	        // Step 1: Find the node to delete
	        while (curr != null && curr.val != key) {
	            parent = curr;
	            if (key < curr.val)
	                curr = curr.left;
	            else
	                curr = curr.right;
	        }

	        // If the node is not found, return the original root
	        if (curr == null) return root;

	        // Step 2: Handle the three cases for deletion

	        // Case 1: Node has 0 children (leaf node)
	        if (curr.left == null && curr.right == null) {
	            if (curr == root) {
	                root = null; // If it's the root node, set the root to null
	            } else {
	                if (parent.left == curr) parent.left = null;
	                else parent.right = null;
	            }
	        }

	        // Case 2: Node has 1 child
	        else if (curr.left == null || curr.right == null) {
	            TreeNode child = (curr.left != null) ? curr.left : curr.right;

	            if (curr == root) {
	                root = child; // If it's the root node, set the root to the child
	            } else {
	                if (parent.left == curr) parent.left = child;
	                else parent.right = child;
	            }
	        }

	        // Case 3: Node has 2 children
	        else {
	            // Find the minimum value in the right subtree
	            TreeNode min = getMin(curr.right);

	            // Store the minimum value
	            int minValue = min.val;

	            // Recursively delete the minimum node
	            root = deleteNode(root, minValue);

	            // Replace the current node's value with the minimum value
	            curr.val = minValue;
	        }

	        return root;
	    }

	    // Helper method to find the minimum value node in a subtree
	    public TreeNode getMin(TreeNode curr) {
	        while (curr.left != null) {
	            curr = curr.left;
	        }
	        return curr;
	    }
	public static TreeNodes insertBST(TreeNodes root, int val) {
		if (root == null) {
			TreeNodes nodes = new TreeNodes(val);
			return nodes;
		}
		if (val < root.val) {
			root.left = insertBST(root.left, val);
		} else {
			root.right = insertBST(root.right, val);
		}
		return root;
	}
	
	public static TreeNodes searchBST(TreeNodes root, int val) {
		if(root == null) return null;
		
		if(root.val == val) {
			return root;
		}
		if(val<root.val) {
			return searchBST(root.left, val);
		}
		else 
			return searchBST(root.right, val);
		
	}
	
//	public static boolean isValid(TreeNodes root, Long min, Long max) {
//		if(root == null){
//			return true;
//		}
//		if(root.val <= min || root.val >= max){ 
//			return false;
//		}
//		
//		return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
//	}
//	
//	public static boolean checkBST(TreeNodes root) {
//		return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
//	}

	static List<Integer> result = new ArrayList<>();

//	in-Order Traversal (left->root->right)
	public static List<Integer> inOrder(TreeNodes root) {

		if (root == null)
			return result;

		inOrder(root.left);
		result.add(root.val);
		inOrder(root.right);

		return result;

	}

	public static void main(String[] args) {
		TreeNodes n1 = new TreeNodes(67);
		insertBST(n1, 10);
		insertBST(n1, 90);
		insertBST(n1, 5);
		insertBST(n1, 55);
		insertBST(n1, 4);
		insertBST(n1, 2);
		insertBST(n1, 20);
		System.out.println(inOrder(n1));
		
	}
}
