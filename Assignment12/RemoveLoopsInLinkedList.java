

class LinkedListNode2 {
    int data;
    LinkedListNode2 next;

    LinkedListNode2(int d) {
        data = d;
        next = null;
    }
}

public class RemoveLoopsInLinkedList {
    LinkedListNode2 head;

    void removeLoop() {
        if (head == null || head.next == null) {
            return; // Empty list or list with only one node, no loop
        }

        LinkedListNode2 slow = head;
        LinkedListNode2 fast = head;

        // Detect if there is a loop
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

        // Find the start of the loop
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the loop by setting the next pointer of the last node in the loop to null
        fast.next = null;
    }

    public static void main(String[] args) {
        RemoveLoopsInLinkedList list = new RemoveLoopsInLinkedList();
        list.head = new LinkedListNode2(1);
        list.head.next = new LinkedListNode2(2);
        list.head.next.next = new LinkedListNode2(3);
        list.head.next.next.next = new LinkedListNode2(4);
        list.head.next.next.next.next = new LinkedListNode2(5);

        // Create a loop by connecting the last node to the second node
        list.head.next.next.next.next.next = list.head.next;

        list.removeLoop();

        // Check if the loop is removed
        if (list.head.next == null) {
            System.out.println("The loop is successfully removed from the linked list.");
        } else {
            System.out.println("The linked list still contains a loop.");
        }
    }
}
