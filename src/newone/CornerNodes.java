package newone;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

// Node class representing each node of the binary tree
class Node {
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

public class CornerNodes {

    // Function to print the corner nodes at each level
    public static void printCornerNodes(Node root) {
        if (root == null) return;

        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node first = null, last = null;

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                // Capture the first and last node of this level
                if (i == 0) first = current;
                if (i == size - 1) last = current;

                // Add children to queue
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }

            // Print corner nodes
            if (first == last) {
                System.out.println(first.data);
            } else {
                System.out.println(first.data + " " + last.data);
            }
        }
    }

    // Main method: constructs the tree and calls the print function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading 11 values to build the binary tree
        int rootNode = sc.nextInt();
        Node root = new Node(rootNode);

        root.left = new Node(sc.nextInt());
        root.right = new Node(sc.nextInt());

        root.left.left = new Node(sc.nextInt());
        root.right.left = new Node(sc.nextInt());
        root.right.right = new Node(sc.nextInt());

        root.left.left.left = new Node(sc.nextInt());
        root.right.left.left = new Node(sc.nextInt());
        root.right.left.right = new Node(sc.nextInt());
        root.right.right.right = new Node(sc.nextInt());

        // Print corner nodes at each level
        printCornerNodes(root);

        sc.close();
    }
}
