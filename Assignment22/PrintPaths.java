import java.util.Stack;
class PathNode {
    TreeNode node;
    String path;

    PathNode(TreeNode node, String path) {
        this.node = node;
        this.path = path;
    }
}
public class PrintPaths {
    public void printRootToLeafPaths(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<PathNode> stack = new Stack<>();
        stack.push(new PathNode(root, ""));

        while (!stack.isEmpty()) {
            PathNode pathNode = stack.pop();
            TreeNode node = pathNode.node;
            String path = pathNode.path;

            if (node.left == null && node.right == null) {
                System.out.println(path + node.val);
            }

            if (node.right != null) {
                stack.push(new PathNode(node.right, path + node.val + "->"));
            }

            if (node.left != null) {
                stack.push(new PathNode(node.left, path + node.val + "->"));
            }
        }
    }
}
