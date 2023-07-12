import java.util.HashMap;

public class RemoveZeroSum {

    public static Node removeZeroSumSublists(Node head) {

        HashMap<Integer, Node> sumNodeMap = new HashMap<>();

        Node dummyPreHead = new Node(0);
        dummyPreHead.next = head;

        sumNodeMap.put(0, dummyPreHead);                                    //Init the stack with prehead.

        Node currNode = head;

        int sum = 0;

        while(currNode!=null){

            sum += currNode.data;

            if(sumNodeMap.containsKey(sum)){

                Node oldNodeWithSameSum = sumNodeMap.get(sum);          //Old node with same sum

                Node toBeRemovedNode = oldNodeWithSameSum.next;         //Remove zero-sum in-between nodes from sumNodeMap
                int toBeRemovedSum = sum;
                while(toBeRemovedNode != currNode){
                    toBeRemovedSum = toBeRemovedSum + toBeRemovedNode.data;
                    sumNodeMap.remove(toBeRemovedSum);
                    toBeRemovedNode = toBeRemovedNode.next;
                }
                oldNodeWithSameSum.next = currNode.next;                    //Point old node to current next node
            }
            else{
                sumNodeMap.put(sum, currNode);
            }

            currNode = currNode.next;
        }

        return dummyPreHead.next;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(-3);
        root.next.next.next.next = new Node(4);
        Node node = removeZeroSumSublists(root);
        while(node!=null) {
            System.out.println(node.data);
            node=node.next;
        }
    }
}