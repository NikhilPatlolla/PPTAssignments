public class CircularLinkedList {

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.head = new Node(1);
            list.head.next = new Node(2);
            list.head.next.next = new Node(3);
            list.head.next.next.next = new Node(4);
            list.head.next.next.next.next = list.head; // Connect last node to the head

            if (list.isCircular()) {
                System.out.println("The linked list is circular.");
            } else {

                System.out.println("The linked list is not circular.");
            }
        }
    }

