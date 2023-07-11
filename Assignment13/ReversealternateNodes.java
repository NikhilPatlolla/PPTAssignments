public class ReversealternateNodes {


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);

        System.out.println("Original List:");
        list.display();

        int k = 3;
        list.head = list.reverseAlternateKNodes(list.head, k);

        System.out.println("List after reversing every alternate " + k + " nodes:");
        list.display();
    }
}


//time complexity
/*
The revised time complexity of the algorithm is O(N), where N is the number of nodes in the linked list, multiplied by the number of groups of k nodes.

        When the function is called recursively, it processes each group of k nodes. Since each group contains k nodes, the total number of groups is N/k. Therefore, the algorithm performs a constant amount of work for each node, and the total number of nodes processed is N. Hence, the time complexity remains O(N).

        The space complexity remains O(1) as it uses a constant amount of extra space for variables, regardless of the size of the linked list.*/
