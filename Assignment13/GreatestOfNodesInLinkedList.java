

class LinkedList {
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

    public void removeDuplicates() {
        if (head == null) {
            return; // Empty list, nothing to remove
        }

        Node current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next; // Move to the next distinct node
            }
        }
    }
    public Node reverseAlternateKNodes(Node head, int k) {
        if (head == null || k <= 1) {
            return head; // No reversal needed or invalid k value
        }

        Node curr = head;
        Node prev = null;
        Node next = null;

        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            if (count % 2 == 1) {
                curr.next = prev;
                prev = curr;
            } else {
                curr.next = next;
            }
            curr = next;
            count++;
        }

        if (count % 2 == 1) {
            head.next = reverseAlternateKNodes(curr, k);
        } else {
            if (next != null) {
                curr.next = reverseAlternateKNodes(next, k);
            }
        }

        return prev != null ? prev : head;
    }


    public void deleteLastOccurrence(int key) {
        if (head == null) {
            return; // Empty list, nothing to delete
        }

        Node lastOccurrence = null;
        Node prevLastOccurrence = null;
        Node current = head;
        Node prev = null;

        // Traverse the list and find the last occurrence of the key
        while (current != null) {
            if (current.data == key) {
                lastOccurrence = current;
                prevLastOccurrence = prev;
            }
            prev = current;
            current = current.next;
        }

        // If the key is found, delete the last occurrence
        if (lastOccurrence != null) {
            if (prevLastOccurrence == null) {
                head = lastOccurrence.next;
            } else {
                prevLastOccurrence.next = lastOccurrence.next;
            }
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
}

public class GreatestOfNodesInLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(11);
        list.addNode(11);
        list.addNode(11);
        list.addNode(21);
        list.addNode(43);
        list.addNode(43);
        list.addNode(60);

        System.out.println("Original List:");
        list.display();

        list.removeDuplicates();

        System.out.println("List after removing duplicates:");
        list.display();
    }
}
