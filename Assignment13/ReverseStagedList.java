
class NodeList {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node reverseKNodes(Node head, int k) {
        if (head == null || k == 1) {
            return head; // No reversal needed or invalid k value
        }

        Node prev = null;
        Node curr = head;
        Node next = null;

        int count = 0;
        int leftOutNodes = countNodes(head) % k;

        // Reverse first k nodes
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Connect reversed nodes with the next group
        if (next != null && leftOutNodes > 0) {
            head.next = reverseKNodes(next, leftOutNodes);
        } else if (next != null) {
            head.next = reverseKNodes(next, k);
        }

        return prev; // New head of the reversed group
    }

    private int countNodes(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class ReverseStagedList {
    public static void main(String[] args) {
        NodeList list = new NodeList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(2);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);

        System.out.println("Original List:");
        list.display();

        int k = 4;
        list.head = list.reverseKNodes(list.head, k);

        System.out.println("List after reversing every " + k + " nodes:");
        list.display();
    }
}
