package hfjfvikhfj;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    void rightView() {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();

                // Print the last node of each level (rightmost)
                if (i == levelSize - 1) {
                    System.out.print(current.data + " ");
                }

                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }
        }
    }

    public void constructTreeFromInput() {
        Scanner scanner = new Scanner(System.in);
        Queue<Node> queue = new LinkedList<>();

        String inputData = scanner.nextLine();
        if (!inputData.equalsIgnoreCase("null")) {
            root = new Node(Integer.parseInt(inputData));
            queue.offer(root);
        } else {
            return;
        }

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            inputData = scanner.nextLine();
            if (!inputData.equalsIgnoreCase("null")) {
                current.left = new Node(Integer.parseInt(inputData));
                queue.offer(current.left);
            }

            inputData = scanner.nextLine();
            if (!inputData.equalsIgnoreCase("null")) {
                current.right = new Node(Integer.parseInt(inputData));
                queue.offer(current.right);
            }
        }
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.constructTreeFromInput();
        tree.rightView();
    }
}
