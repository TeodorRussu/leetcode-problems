package solutions.max_depth_of_binary_tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return calculateDepth(root, 0);
    }

    int calculateDepth(TreeNode root, int counter) {
        if (root.left == null && root.right == null) {
            return counter + 1;
        } else if (root.left != null && root.right == null) {
            return (calculateDepth(root.left, counter + 1));
        } else if (root.left == null && root.right != null) {
            return (calculateDepth(root.right, counter + 1));
        } else if (root.left != null && root.right != null) {
            int rightCount = calculateDepth(root.right, counter + 1);
            int leftCount = calculateDepth(root.left, counter + 1);
            return rightCount > leftCount ? rightCount : leftCount;
        }
        return 1;
    }
}