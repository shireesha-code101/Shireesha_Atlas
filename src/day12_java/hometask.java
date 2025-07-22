package day12_java;


import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class hometask {
    TreeNode root;

    public void printCorner(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();

                // If this is the first or last node of this level
                if (i == 0 || i == n - 1) {
                    System.out.print(node.val + " ");
                }

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        hometask tree = new hometask();
        tree.root = new TreeNode(15);
        tree.root.left = new TreeNode(10);
        tree.root.right = new TreeNode(20);
        tree.root.left.left = new TreeNode(8);
        tree.root.left.right = new TreeNode(12);
        tree.root.right.left = new TreeNode(16);
        tree.root.right.right = new TreeNode(25);

        tree.printCorner(tree.root);
        // Output: 15 10 20 8 25
    }
}


