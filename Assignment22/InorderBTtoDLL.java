public class InorderBTtoDLL {
    TreeNode head = null;
    TreeNode prev = null;

    public TreeNode convertToDLL(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Convert the left subtree
        convertToDLL(root.left);

        // Set the previous and next pointers
        if (prev == null) {
            head = root; // Set the head of the DLL
        } else {
            prev.right = root;
            root.left = prev;
        }

        prev = root; // Update prev to the current node

        // Convert the right subtree
        convertToDLL(root.right);

        return head;
    }
}
