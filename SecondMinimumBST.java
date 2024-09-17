class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SecondMinimumBST {

    private int firstMin;
    private int secondMin;
    private boolean foundSecond;

    public int findSecondMinimum(TreeNode root) {
        firstMin = root.val;
        secondMin = Integer.MAX_VALUE;
        foundSecond = false;
        inorderTraversal(root);

        if (foundSecond) {
            return secondMin;
        } else {
            return -1; // No second minimum found
        }
    }

    private void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);

        if (node.val > firstMin && node.val < secondMin) {
            secondMin = node.val;
            foundSecond = true;
        }

        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        // Create a sample BST
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        SecondMinimumBST finder = new SecondMinimumBST();
        int secondMin = finder.findSecondMinimum(root);

        if (secondMin != -1) {
            System.out.println("Second minimum: " + secondMin);
        } else {
            System.out.println("No second minimum found.");
        }
    }
}
