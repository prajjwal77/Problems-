package Trees;

public class CountLeavesInBTree {

    class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    private Node root; // Root of the tree

    // Method to insert a value into the tree
    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // In-order traversal method
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    // Count the number of leaf nodes
    public int countLeaves(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaves(node.left) + countLeaves(node.right);
    }
    //count the number of nodes in Complete Binary Tree
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left ==null && root.right==null)
        return 1;

        int leftHeight = countNodes(root.left);
        int rightHeight = countNodes(root.right);
        return 1+leftHeight+rightHeight;
    }
    public static void main(String[] args) {
        CountLeavesInBTree tree = new CountLeavesInBTree();

        // Insert nodes into the tree
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        // Perform in-order traversal
        System.out.println("In-order Traversal:");
        tree.inOrderTraversal(tree.root);

        // Count and print the number of leaf nodes
        System.out.println("\nNumber of leaf nodes: " + tree.countLeaves(tree.root));
    }
}
