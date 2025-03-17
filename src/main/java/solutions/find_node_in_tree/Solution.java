package solutions.find_node_in_tree;


//  Definition for a binary tree node.
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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else {
            TreeNode rightResult = searchBST(root.right, val);
            TreeNode leftResult = searchBST(root.left, val);
            return rightResult != null ? rightResult : leftResult;
        }
    }
}