package day14_java;

public class task001 {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node createList(int a, int b, int c, int d) {
        Node head = new Node(a);
        head.next = new Node(b);
        head.next.next = new Node(c);
        head.next.next.next = new Node(d);
        return head;
    }
    static void traverse(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = createList(10, 20, 30, 40);

        System.out.print("List contents: ");
        traverse(head);  // prints: 10 20 30 40
    }
}
