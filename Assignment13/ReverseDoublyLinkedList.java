class DNode {
    int data;
    DNode prev;
    DNode next;

    public DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    DNode head;

    public void addNode(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
        } else {
            DNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void display() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        DNode temp = null;
        DNode current = head;

        // Swap next and prev pointers for all nodes of the doubly linked list
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // Update the head pointer
        if (temp != null) {
            head = temp.prev;
        }
    }
    public void deleteNode(int position) {
        if (head == null) {
            return; // Empty list, nothing to delete
        }

        DNode current = head;
        int count = 1;

        // Traverse to the node at the given position
        while (count < position && current != null) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return; // Invalid position
        }

        // Connect the previous and next nodes, and update the head if needed
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }
}


public class ReverseDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Original List:");
        list.display();

        list.reverse();

        System.out.println("Reversed List:");
        list.display();
    }
}







