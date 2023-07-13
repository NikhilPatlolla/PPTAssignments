public class DistBtw2NodesBST {

    public int findDistance(TreeNode root, int p, int q) {
        TreeNode lcaNode = findLCA(root, p, q);
        int distP = findDistanceFromNode(lcaNode, p, 0);
        int distQ = findDistanceFromNode(lcaNode, q, 0);
        return distP + distQ;
    }

    private TreeNode findLCA(TreeNode root, int p, int q) {
        if (root == null || root.val == p || root.val == q) {
            return root;
        }

        if (root.val > p && root.val > q) {
            return findLCA(root.left, p, q);
        }

        if (root.val < p && root.val < q) {
            return findLCA(root.right, p, q);
        }

        return root;
    }

    private int findDistanceFromNode(TreeNode node, int target, int distance) {
        if (node == null) {
            return -1;
        }

        if (node.val == target) {
            return distance;
        }

        if (node.val > target) {
            return findDistanceFromNode(node.left, target, distance + 1);
        } else {
            return findDistanceFromNode(node.right, target, distance + 1);
        }
    }
}
