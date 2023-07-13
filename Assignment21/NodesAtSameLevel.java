class TreeNodeN {
    int val;
    TreeNodeN left;
    TreeNodeN right;
    TreeNodeN nextRight;

    TreeNodeN(int val) {
        this.val = val;
    }
}
public class NodesAtSameLevel {

    public void connectNodes(TreeNodeN root) {
        if (root == null) {
            return;
        }

        TreeNodeN levelStart = root;

        while (levelStart != null) {
            TreeNodeN curr = levelStart;
            TreeNodeN dummyNode = new TreeNodeN(-1);
            TreeNodeN prev = dummyNode;

            while (curr != null) {
                if (curr.left != null) {
                    prev.nextRight = curr.left;
                    prev = prev.nextRight;
                }

                if (curr.right != null) {
                    prev.nextRight = curr.right;
                    prev = prev.nextRight;
                }

                curr = curr.nextRight;
            }

            levelStart = dummyNode.nextRight;
        }
    }
}
