import java.util.*;
public class PrintBottomView {
    public void printBottomView(TreeNode root) {
        if (root == null) {
            return;
        }

        Map<Integer, Integer> bottomViewMap = new TreeMap<>();
        Queue<NodeInfo> queue = new LinkedList<>();
        queue.offer(new NodeInfo(root, 0));

        while (!queue.isEmpty()) {
            NodeInfo nodeInfo = queue.poll();
            TreeNode node = nodeInfo.node;
            int horizontalDistance = nodeInfo.horizontalDistance;

            bottomViewMap.put(horizontalDistance, node.val);

            if (node.left != null) {
                queue.offer(new NodeInfo(node.left, horizontalDistance - 1));
            }

            if (node.right != null) {
                queue.offer(new NodeInfo(node.right, horizontalDistance + 1));
            }
        }

        for (int value : bottomViewMap.values()) {
            System.out.print(value + " ");
        }
    }

    class NodeInfo {
        TreeNode node;
        int horizontalDistance;

        NodeInfo(TreeNode node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }
}
