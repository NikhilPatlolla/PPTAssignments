import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BTToBST {

    public TreeNode convertToBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        List<Integer> values = new ArrayList<>();
        inorderTraversal(root, values);

        // Sort the values in ascending order
        Integer[] sortedValues = values.toArray(new Integer[values.size()]);
        Arrays.sort(sortedValues);

        // Update the tree nodes with the sorted values
        TreeNode newRoot = buildBST(sortedValues, 0, sortedValues.length - 1);

        return newRoot;
    }

    private void inorderTraversal(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left, values);
        values.add(node.val);
        inorderTraversal(node.right, values);
    }

    private TreeNode buildBST(Integer[] values, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(values[mid]);
        node.left = buildBST(values, start, mid - 1);
        node.right = buildBST(values, mid + 1, end);

        return node;
    }
}
