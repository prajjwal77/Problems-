package Trees;

import java.util.ArrayList;
import java.util.List;

//BFS

class Node1 {
	int val;
	Node1 left = null;
	Node1 right = null;

	Node1() {
	}

	Node1(int val) {
		this.val = val;
	}
}

public class LevelOrderTraversal {
	public static List<List<Integer>> levelOrder(Node1 root) {
	    // The final result list containing values for each level
	    List<List<Integer>> result = new ArrayList<>();
	    traverse(root, 0, result);
	    return result;
	}

	private static void traverse(Node1 node, int level, List<List<Integer>> result) {
	    if (node == null) {
	        return; 
	    }

	    if (level == result.size()) {
	        result.add(new ArrayList<>()); 
	    }

	    result.get(level).add(node.val);

	    traverse(node.left, level + 1, result);
	    traverse(node.right, level + 1, result);
	}
	public static void main(String[] args) {
		Node1 root = new Node1(1);
		root.left = new Node1(2);
		root.right = new Node1(3);
		root.left.left = new Node1(4);
		root.left.right = new Node1(5);
		root.right.left = new Node1(6);
		root.right.right = new Node1(7);
		
		System.out.println(levelOrder(root));
	}
}
