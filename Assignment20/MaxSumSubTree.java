public class MaxSumSubTree {
    private int maxSum = Integer.MIN_VALUE;

    public int maxSubtreeSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = dfs(node.left);
        int rightSum = dfs(node.right);

        // Calculate the sum of the current subtree
        int subtreeSum = leftSum + rightSum + node.val;

        // Update the maximum sum if the current subtree has a larger sum
        maxSum = Math.max(maxSum, subtreeSum);

        // Return the sum of the current subtree to the parent node
        return subtreeSum;
    }
}