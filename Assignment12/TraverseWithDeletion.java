public class TraverseWithDeletion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);

        int M = 2;
        int N = 2;

        System.out.print("Original Linked List: ");
        list.printList();

        list.retainDelete(M, N);

        System.out.print("Modified Linked List: ");
        list.printList();
    }
}
