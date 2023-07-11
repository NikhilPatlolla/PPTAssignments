
class SortedLinkedList {
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class RemoveDuplicatesFromSortedLinkedList {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
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
