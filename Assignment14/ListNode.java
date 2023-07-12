public class ListNode {
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

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

// Add 1 to the string sum of the values
    public void addOne() {
        reverse(); // Reverse the list to perform the addition

        Node current = head;
        int carry = 1; // Initialize carry to 1 for adding 1

        while (current != null) {
            int sum = current.data + carry;
            current.data = sum % 10; // Update the digit

            carry = sum / 10; // Update the carry

            if (carry == 0) {
                break; // No more carry, exit the loop
            }

            current = current.next;
        }

        if (carry != 0) {
            // If there is still a carry, create a new node
            Node newNode = new Node(carry);
            current.next = newNode;
        }

        reverse(); // Reverse the list back to its original order
    }



    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void detectAndRemoveLoop() {
        if (head == null || head.next == null) {
            return; // Empty list or only one node, no loop
        }

        Node slow = head;
        Node fast = head;

        // Find the meeting point of the slow and fast pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break; // Loop detected
            }
        }

        // If there is no loop, return
        if (slow != fast) {
            return;
        }

        // Move one pointer to the head and keep the other pointer at the meeting point
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Unlink the last node to remove the loop
        fast.next = null;
    }
}

