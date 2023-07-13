public class RightFlipBT {
    public TreeNode flipBinaryTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }

        // Recursively flip the left and right subtrees
        TreeNode flippedLeft = flipBinaryTree(root.left);
        TreeNode flippedRight = flipBinaryTree(root.right);

        // Flip the current node
        root.left = null;
        root.right = flippedLeft;

        // Find the new rightmost node
        TreeNode node = flippedLeft;
        while (node != null && node.right != null) {
            node = node.right;
        }

        // Set the right child of the new rightmost node
        if (node != null) {
            node.right = flippedRight;
        }

        return root;
    }
}
