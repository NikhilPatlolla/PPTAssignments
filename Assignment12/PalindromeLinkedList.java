class LinkedListNode {
    char data;
    LinkedListNode next;

    LinkedListNode(char d) {
        data = d;
        next = null;
    }
}

public class PalindromeLinkedList {
    LinkedListNode head;

    boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // An empty list or a list with one node is a palindrome
        }

        LinkedListNode slow = head;
        LinkedListNode fast = head;
        LinkedListNode prevSlow = head;
        LinkedListNode midNode = null; // To handle odd length linked list

        // Find the midpoint of the linked list and reverse the second half
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prevSlow = slow;
            slow = slow.next;
        }

        // Handle odd length linked list
        if (fast != null) {
            midNode = slow;
            slow = slow.next;
        }

        prevSlow.next = null; // Break the link between first and second half

        // Reverse the second half of the linked list
        LinkedListNode secondHalf = reverseLinkedList(slow);

        // Compare the first half with the reversed second half
        boolean isPalindrome = compareLists(head, secondHalf);

        // Restore the original linked list by reversing the second half again
        secondHalf = reverseLinkedList(secondHalf);

        if (midNode != null) {
            prevSlow.next = midNode;
            midNode.next = secondHalf;
        } else {
            prevSlow.next = secondHalf;
        }

        return isPalindrome;
    }

    LinkedListNode reverseLinkedList(LinkedListNode head) {
        LinkedListNode prev = null;
        LinkedListNode curr = head;
        LinkedListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    boolean compareLists(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode temp1 = head1;
        LinkedListNode temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        // If both lists reach the end, they are identical
        if (temp1 == null && temp2 == null) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        list.head = new LinkedListNode('r');
        list.head.next = new LinkedListNode('a');
        list.head.next.next = new LinkedListNode('d');
        list.head.next.next.next = new LinkedListNode('a');
        list.head.next.next.next.next = new LinkedListNode('r');

        if (list.isPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
