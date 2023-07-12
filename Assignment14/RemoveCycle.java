
//https://pwskills.notion.site/Assignment-Questions-14-f6f7d67e91f548fd892b7c02e7a4d0d5
public class RemoveCycle {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        // Create a loop for testing
        list.head.next.next.next.next.next = list.head.next;

        System.out.println("Original List:");
        list.display();

        list.detectAndRemoveLoop();

        System.out.println("List after removing the loop:");
        list.display();
    }
}
