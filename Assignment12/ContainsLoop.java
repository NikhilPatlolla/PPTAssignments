
public class ContainsLoop {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = list.head.next; // Creating a loop

        boolean hasLoop = list.hasLoop();

        if (hasLoop) {
            System.out.println("The linked list has a loop");
        } else {
            System.out.println("The linked list does not have a loop");
        }
    }
}
