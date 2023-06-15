
public class InsertSecondListIntoFirst{


    public static void main(String[] args) {
        LinkedList firstList = new LinkedList();
        firstList.head = new Node(5);
        firstList.head.next = new Node(7);
        firstList.head.next.next = new Node(17);
        firstList.head.next.next.next = new Node(13);
        firstList.head.next.next.next.next = new Node(11);

        LinkedList secondList = new LinkedList();
        secondList.head = new Node(12);
        secondList.head.next = new Node(10);
        secondList.head.next.next = new Node(2);
        secondList.head.next.next.next = new Node(4);
        secondList.head.next.next.next.next = new Node(6);

        System.out.print("First Linked List: ");
        firstList.printList();
        System.out.print("Second Linked List: ");
        secondList.printList();

        firstList.insertAlternate(secondList);

        System.out.print("Modified First Linked List: ");
        firstList.printList();
        System.out.print("Modified Second Linked List: ");
        secondList.printList();
    }
}
