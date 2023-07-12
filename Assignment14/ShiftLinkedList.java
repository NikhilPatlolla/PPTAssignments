
public class ShiftLinkedList {
    public Node leftShiftLinkedList(Node head, int k) {
        if (head == null || head.next == null || k <= 0) {
            return head;
        }

        // Find the kth node from the beginning of the list
        Node kthNode = head;
        for (int i = 1; i < k && kthNode != null; i++) {
            kthNode = kthNode.next;
        }

        // If k is greater than the length of the list, wrap around
        if (kthNode == null) {
            return head;
        }

        // Traverse to the end of the list and connect the last node to the original head
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = head;

        // Set the new head and update the new tail
        Node newHead = kthNode.next;
        kthNode.next = null;

        return newHead;
    }
}

