import java.util.*;

public class ValidateBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
        public static boolean isValidBST(TreeNode root) {
            return isValidBST(root, null, null);
        }

        private static boolean isValidBST(TreeNode node, Integer min, Integer max) {
            if (node == null) {
                return true;
            }

            if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
                return false;
            }

            return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(2);
            root.left = new TreeNode(1);
            root.right = new TreeNode(3);

            System.out.println(isValidBST(root)); // Output should be true

            root.left = new TreeNode(3);
            root.right = new TreeNode(1);

            System.out.println(isValidBST(root)); // Output should be false
        }
    }

