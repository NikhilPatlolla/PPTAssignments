package copyLinkedList;

import java.util.HashMap;

class Node {
    int data;
    Node next;
    Node random;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

class LinkedList {
    Node head;

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print("Data: " + temp.data);
            if (temp.random != null) {
                System.out.print(", Random: " + temp.random.data);
            }
            System.out.println();
            temp = temp.next;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();

        Node current = head;
        while (current != null) {
            map.put(current, new Node(current.data));
            current = current.next;
        }

        current = head;
        while (current != null) {
            Node copyNode = map.get(current);
            copyNode.next = map.get(current.next);
            copyNode.random = map.get(current.random);
            current = current.next;
        }

        return map.get(head);
    }
}

public class CopyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating the sample linked list with random pointers
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head.random = head.next.next;
        head.next.random = head.next.next.next;

        list.head = head;

        System.out.println("Original Linked List:");
        list.display();

        Node copiedListHead = list.copyRandomList(head);

        System.out.println("Copied Linked List:");
        list.display();
    }
}
