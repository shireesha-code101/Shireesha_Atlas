package day12_java;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, 0, result);
        return result;
    }

    private void dfs(TreeNode node, int depth, List<Integer> result) {
        if (node == null) return;
        if (depth == result.size()) {
            result.add(node.val);
        }
        dfs(node.right, depth + 1, result);
        dfs(node.left, depth + 1, result);
    }

    // Example usage for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        System.out.println(sol.rightSideView(root));
        // Expected output: [1, 3, 4]
    }
}
