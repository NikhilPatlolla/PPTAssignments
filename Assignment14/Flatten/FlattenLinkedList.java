package Flatten;


//https://pwskills.notion.site/Assignment-Questions-14-f6f7d67e91f548fd892b7c02e7a4d0d5
class BottomNode {
    int data;
    BottomNode next;
    BottomNode bottom;

    public BottomNode(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}

class LinkedList {
    BottomNode head;

    public void display() {
        BottomNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.bottom;
        }
        System.out.println();
    }

    public BottomNode merge(BottomNode a, BottomNode b) {
        // Base cases
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        BottomNode result;

        // Merge the two sub-linked lists recursively
        if (a.data <= b.data) {
            result = a;
            result.bottom = merge(a.bottom, b);
        } else {
            result = b;
            result.bottom = merge(a, b.bottom);
        }

        return result;
    }

    public BottomNode flatten(BottomNode root) {
        // Base case: if the root or root.next is null, return root
        if (root == null || root.next == null) {
            return root;
        }

        // Recursively flatten the next linked list
        root.next = flatten(root.next);

        // Merge the current linked list with the flattened next linked list
        root = merge(root, root.next);

        // Return the merged linked list
        return root;
    }

    public void flattenList() {
        head = flatten(head);
    }
}

public class FlattenLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating the sample linked list with sub-linked lists
        BottomNode head = new BottomNode(5);
        head.bottom = new BottomNode(7);
        head.bottom.bottom = new BottomNode(8);
        head.bottom.bottom.bottom = new BottomNode(30);

        BottomNode head2 = new BottomNode(10);
        head2.bottom = new BottomNode(20);

        BottomNode head3 = new BottomNode(19);
        head3.bottom = new BottomNode(22);
        head3.bottom.bottom = new BottomNode(50);

        BottomNode head4 = new BottomNode(28);
        head4.bottom = new BottomNode(35);
        head4.bottom.bottom = new BottomNode(40);
        head4.bottom.bottom.bottom = new BottomNode(45);

        // Assigning the next pointers
        list.head = head;
        head.next = head2;
        head2.next = head3;
        head3.next = head4;

        System.out.println("Original Linked List:");
        list.display();

        list.flattenList();

        System.out.println("Flattened Linked List:");
        list.display();
    }
}

