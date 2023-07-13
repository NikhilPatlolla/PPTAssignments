public class ConstrctBT_BFS {
    public TreeNode constructBST(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            insert(root, arr[i]);
        }

        return root;
    }

    private void insert(TreeNode node, int value) {
        if (value < node.val) {
            if (node.left == null) {
                node.left = new TreeNode(value);
            } else {
                insert(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new TreeNode(value);
            } else {
                insert(node.right, value);
            }
        }
    }
}
