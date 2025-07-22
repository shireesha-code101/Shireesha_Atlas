package day12_java;

import java.util.*;

class Node {
    int val;
    Node left, right;
    Node(int v) { val = v; }
}

public class PrintCorners {
    public static void printCorners(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (i == 0 || i == size - 1) {
                    System.out.print(node.val + " ");
                }
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // build your example tree:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.right.right.right = new Node(15);

        printCorners(root);
    }
}
