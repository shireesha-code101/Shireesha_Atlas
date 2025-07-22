import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Main {

    // Prints the tree in level-order after inversion
    public static void levelOrderTraversal(Node root) {
        if (root == null) return;

        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null) queue.offer(curr.left);
            if (curr.right != null) queue.offer(curr.right);
        }
    }

    // Inverts alternate levels of a perfect binary tree
    public static void invertBinaryTree(Node root) {
        if (root == null) return;

        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        boolean isEvenLevel = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Node> levelNodes = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();

                // Collect current level nodes if it's an even level (0-based indexing)
                if (isEvenLevel) {
                    levelNodes.add(curr);
                }

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            // Reverse node data at current level if it's even
            if (isEvenLevel) {
                int i = 0, j = levelNodes.size() - 1;
                while (i < j) {
                    int temp = levelNodes.get(i).data;
                    levelNodes.get(i).data = levelNodes.get(j).data;
                    levelNodes.get(j).data = temp;
                    i++;
                    j--;
                }
            }

            isEvenLevel = !isEvenLevel;
        }
    }

    // Non-editable code starts here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rootNode = scanner.nextInt();
        Node root = new Node(rootNode);

        root.left = new Node(scanner.nextInt());
        root.right = new Node(scanner.nextInt());

        root.left.left = new Node(scanner.nextInt());
        root.left.right = new Node(scanner.nextInt());
        root.right.left = new Node(scanner.nextInt());
        root.right.right = new Node(scanner.nextInt());

        root.left.left.left = new Node(scanner.nextInt());
        root.left.left.right = new Node(scanner.nextInt());
        root.left.right.left = new Node(scanner.nextInt());
        root.left.right.right = new Node(scanner.nextInt());

        root.right.left.left = new Node(scanner.nextInt());
        root.right.left.right = new Node(scanner.nextInt());
        root.right.right.left = new Node(scanner.nextInt());
        root.right.right.right = new Node(scanner.nextInt());

        invertBinaryTree(root);
        levelOrderTraversal(root);

        scanner.close();
    }
    // Non-editable code ends here
}

