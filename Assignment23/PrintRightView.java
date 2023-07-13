public class PrintRightView {
    public void printRightView(TreeNode root) {
        printRightView(root, 1, 0);
    }

    private void printRightView(TreeNode node, int level, int maxLevel) {
        if (node == null) {
            return;
        }

        if (level > maxLevel) {
            System.out.print(node.val + " ");
            maxLevel = level;
        }

        printRightView(node.right, level + 1, maxLevel);
        printRightView(node.left, level + 1, maxLevel);
    }
}
