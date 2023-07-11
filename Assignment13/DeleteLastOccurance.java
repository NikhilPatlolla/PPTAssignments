
public class DeleteLastOccurance {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(2);
        list.addNode(4);
        list.addNode(5);
        list.addNode(2);
        list.addNode(6);

        System.out.println("Original List:");
        list.display();

        int key = 2;
        list.deleteLastOccurrence(key);

        System.out.println("List after deleting last occurrence of " + key + ":");
        list.display();
    }
}
