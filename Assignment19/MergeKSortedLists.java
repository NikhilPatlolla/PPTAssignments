import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        // Create a min-heap using a priority queue
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Insert the head nodes of all linked lists into the min-heap
        for (ListNode head : lists) {
            if (head != null) {
                minHeap.offer(head);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // Process nodes from the min-heap
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            curr.next = node;
            curr = curr.next;

            // Insert the next node from the linked list into the min-heap
            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }

        return dummy.next;
    }
}
