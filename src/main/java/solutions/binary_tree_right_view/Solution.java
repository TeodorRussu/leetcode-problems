package solutions.binary_tree_right_view;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<>();

        if (root == null) {
            return output;
        }

        Deque<TreeNode> current = new LinkedList<>();
        Deque<TreeNode> next = new LinkedList<>();
        current.add(root);
        output.add(root.val);

        while (!current.isEmpty()) {
            while (!current.isEmpty()) {
                TreeNode nextElement = current.poll();
                if (nextElement.left != null) {
                    next.add(nextElement.left);
                }
                if (nextElement.right != null) {
                    next.add(nextElement.right);
                }
            }
            TreeNode mostRightNode = next.peekLast();
            if (mostRightNode != null) {
                output.add(mostRightNode.val);
            }

            current = next;
            next = new LinkedList<>();
        }
        return output;
    }
}