public class DeleteMiddleElement {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Original linked list:");
        list.printLinkedList();

        list.deleteMiddleNode();

        System.out.println("\nModified linked list:");
        list.printLinkedList();
    }
}