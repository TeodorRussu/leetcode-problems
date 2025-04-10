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
        Deque<TreeNode> currentLevel = new LinkedList<>();

        currentLevel.add(root);
        output.add(root.val);

        while (!currentLevel.isEmpty()) {
            int currentLevelSize = currentLevel.size();
            TreeNode rightMostOnThisLevel = null;
            for (int i = 0; i<currentLevelSize; i++) {
                TreeNode nextElement = currentLevel.poll();
                if (nextElement.left != null) {
                    currentLevel.add(nextElement.left);
                    rightMostOnThisLevel = nextElement.left;
                }
                if (nextElement.right != null) {
                    currentLevel.add(nextElement.right);
                    rightMostOnThisLevel = nextElement.right;
                }
            }

            if (rightMostOnThisLevel != null) {
                output.add(rightMostOnThisLevel.val);
            }
        }
        return output;
    }
}