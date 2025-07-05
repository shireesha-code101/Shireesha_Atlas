package day5_java;

public class BinarySearchTree {
    private static class Node {
        int value;
        Node left, right;
        Node(int v) {
            value = v;
            left = right = null;
        }
    }

    public Node root;
    public BinarySearchTree() {
        root = null;
    }

    public void insertFirst(int value) {
        if (root != null) {
            System.out.println("Tree is not empty — use insert(value) instead.");
            return;
        }
        root = new Node(value);
    }

    public void insert(int value) {
        if (root == null) {
            System.out.println("Tree is empty — using insertFirst instead.");
            insertFirst(value);
        } else {
            root = insertRec(root, value);
        }
    }
    private Node insertRec(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insertRec(node.left, value);
        } else if (value > node.value) {
            node.right = insertRec(node.right, value);
        }
        return node;
    }

    public void inorderTraversal() {
        inorderRec(root);
        System.out.println();
    }

    public void preorderTraversal() {
        inorderRec(root);
        System.out.println();
    }

    public void postorderTraversal() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.value + " ");
            inorderRec(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertFirst(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        System.out.print("Inorder traversal: ");
        tree.inorderTraversal();
        System.out.println("preorder traversal");
        tree.preorderTraversal();
        System.out.println("postorder traversal");
        tree.postorderTraversal();

    }
}
