
class DoublyLinkedListNode {
    int val;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;

    DoublyLinkedListNode(int val) {
        this.val = val;
    }
}
public class BTToDLL {

    DoublyLinkedListNode head;
    DoublyLinkedListNode prev;

    public DoublyLinkedListNode convertToDoublyLinkedList(TreeNode root) {
        if (root == null) {
            return null;
        }

        convertHelper(root);

        return head;
    }

    private void convertHelper(TreeNode node) {
        if (node == null) {
            return;
        }

        // Convert left subtree
        convertHelper(node.left);

        // Process current node
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(node.val);

        if (head == null) {
            head = newNode;
        } else {
            prev.next = newNode;
            newNode.prev = prev;
        }

        prev = newNode;

        // Convert right subtree
        convertHelper(node.right);
    }
}
