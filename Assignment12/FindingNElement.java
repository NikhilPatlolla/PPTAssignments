
public class FindingNElement {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node prev = null;
        int i = 0;
        while (i < 9) {
            Node newNode = new Node(i);
            if (prev != null) {
                prev.next = newNode;
            } else {
                list.head = newNode;
            }
            prev = newNode;
            i++;
        }

        int N = 2;
        Node nthNodeFromEnd = list.findNthFromEnd(N);

        if (nthNodeFromEnd != null) {
            System.out.println("The " + N + "th node from the end is: " + nthNodeFromEnd.data);
        } else {
            System.out.println("The linked list does not have a " + N + "th node from the end.");
        }
    }
}
