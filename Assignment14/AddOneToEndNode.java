
//https://pwskills.notion.site/Assignment-Questions-14-f6f7d67e91f548fd892b7c02e7a4d0d5
public class AddOneToEndNode {

    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);

        System.out.print("Original Number: ");
        list.display();

        list.addOne();

        System.out.print("Modified Number: ");
        list.display();
    }
}