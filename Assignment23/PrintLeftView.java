public class PrintLeftView {

    public void printLeftView(TreeNode root) {
        printLeftView(root, 1, 0);
    }

    private void printLeftView(TreeNode node, int level, int maxLevel) {
        if (node == null) {
            return;
        }

        if (level > maxLevel) {
            System.out.print(node.val + " ");
            maxLevel = level;
        }

        printLeftView(node.left, level + 1, maxLevel);
        printLeftView(node.right, level + 1, maxLevel);
    }
}
