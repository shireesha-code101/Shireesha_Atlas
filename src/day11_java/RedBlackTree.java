package day11_java;

enum Color { RED, BLACK; }

class Node1 {
    int data;
    Node1 left, right, parent;
    Color color;

    Node1(int data) {
        this.data = data;
        this.color = Color.RED; // new nodes are red
    }
}

public class RedBlackTree {
    private Node1 root;

    public void insert(int data) {
        Node1 node = new Node1(data);
        bstInsert(node);
        fixInsert(node);
    }

    private void bstInsert(Node1 z) {
        Node1 y = null;
        Node1 x = root;
        while (x != null) {
            y = x;
            if (z.data < x.data) x = x.left;
            else if (z.data > x.data) x = x.right;
            else return; // no duplicates
        }
        z.parent = y;
        if (y == null) root = z;
        else if (z.data < y.data) y.left = z;
        else y.right = z;
    }

    private void fixInsert(Node1 z) {
        while (z.parent != null && z.parent.color == Color.RED) {
            Node1 gp = z.parent.parent;
            if (gp == null) break;

            if (z.parent == gp.left) {
                Node1 y = gp.right;
                if (y != null && y.color == Color.RED) {
                    z.parent.color = y.color = Color.BLACK;
                    gp.color = Color.RED;
                    z = gp;
                } else {
                    if (z == z.parent.right) {
                        z = z.parent;
                        rotateLeft(z);
                    }
                    z.parent.color = Color.BLACK;
                    gp.color = Color.RED;
                    rotateRight(gp);
                }
            } else {
                Node1 y = gp.left;
                if (y != null && y.color == Color.RED) {
                    z.parent.color = y.color = Color.BLACK;
                    gp.color = Color.RED;
                    z = gp;
                } else {
                    if (z == z.parent.left) {
                        z = z.parent;
                        rotateRight(z);
                    }
                    z.parent.color = Color.BLACK;
                    gp.color = Color.RED;
                    rotateLeft(gp);
                }
            }
        }
        root.color = Color.BLACK;
    }

    private void rotateLeft(Node1 x) {
        Node1 y = x.right;
        x.right = y.left;
        if (y.left != null) y.left.parent = x;
        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;
        y.left = x;
        x.parent = y;
    }

    private void rotateRight(Node1 x) {
        Node1 y = x.left;
        x.left = y.right;
        if (y.right != null) y.right.parent = x;
        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.right) x.parent.right = y;
        else x.parent.left = y;
        y.right = x;
        x.parent = y;
    }

    // Optional: in-order traversal for testing
    public void inorder() {
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(Node1 node) {
        if (node != null) {
            inorderHelper(node.left);
            System.out.print(node.data + "(" + node.color + ") ");
            inorderHelper(node.right);
        }
    }

    // Optional: find
    public Node1 find(int key) {
        Node1 x = root;
        while (x != null) {
            if (key < x.data) x = x.left;
            else if (key > x.data) x = x.right;
            else return x;
        }
        return null;
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        int[] keys = {10, 20, 30, 15, 25};
        for (int k : keys) {
            tree.insert(k);
            tree.inorder();
        }
    }
}
