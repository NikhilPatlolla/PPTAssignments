class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class FindWinner {
    public int findTheWinner(int n, int k) {
        // Create circular linked list
        ListNode head = new ListNode(1);
        ListNode curr = head;
        for (int i = 2; i <= n; i++) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        curr.next = head; // Connect last node to the first node

        // Simulate the game
        while (curr.next != curr) {
            for (int i = 0; i < k - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next; // Remove the next friend
        }

        return curr.val; // Last remaining friend wins the game
    }

    public static void main(String[] args) {
        FindWinner solution = new FindWinner();
        int n = 5;
        int k = 2;
        int winner = solution.findTheWinner(n, k);
        System.out.println("Winner: " + winner); // Output: 3
    }
}
