class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    boolean isCircular() {
        if (head == null) {
            return false; // Empty list is not circular
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false; // No cycle found
    }
    void insertAlternate(LinkedList secondList) {
        if (secondList.head == null) {
            return; // Second list is empty
        }


        Node firstPtr = head;
        Node secondPtr = secondList.head;

        while (firstPtr != null && secondPtr != null) {
            Node firstNext = firstPtr.next;
            Node secondNext = secondPtr.next;

            firstPtr.next = secondPtr;
            secondPtr.next = firstNext;

            firstPtr = firstNext;
            secondPtr = secondNext;
        }

        if (secondPtr != null) {
            // Append remaining nodes from second list to the end of first list
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = secondPtr;
            secondList.head = null; // Empty the second list
        }
    }
    void retainDelete(int M, int N) {
        if (head == null || M <= 0 || N <= 0) {
            return; // Invalid input
        }

        Node current = head;
        Node temp;
        int count;

        while (current != null) {
            // Move current M nodes forward
            for (count = 1; count < M && current != null; count++) {
                current = current.next;
            }

            if (current == null) {
                break;
            }

            // Set temp to the next node of current
            temp = current.next;

            // Move temp N nodes forward
            for (count = 1; count <= N && temp != null; count++) {
                temp = temp.next;
            }

            // Set the next node of current to the next node of temp
            current.next = temp;

            // Move current to the next node
            current = current.next;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void deleteMiddleNode() {
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // If the number of nodes is even, delete the second middle node
        if (fast != null) {
            prev.next = slow.next;
        } else {
            // If the number of nodes is odd, delete the middle node
            prev.next = slow.next;
        }
    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public Node findNthFromEnd(int N) {
        if (head == null || N <= 0) {
            return null;
        }

        Node mainPtr = head;
        Node refPtr = head;

        // Move the refPtr N nodes ahead
        for (int i = 0; i < N; i++) {
            if (refPtr == null) {
                return null; // N is greater than the number of nodes
            }
            refPtr = refPtr.next;
        }

        // Move both pointers until refPtr reaches the end
        while (refPtr != null) {
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }

        return mainPtr;
    }

    public boolean hasLoop() {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Loop detected
            }
        }

        return false; // No loop found
    }

}


