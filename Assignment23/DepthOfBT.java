public class DepthOfBT {
    public int calculateDepth(String preorder) {
        int[] index = {0};
        return calculateDepth(preorder, index, 0);
    }

    private int calculateDepth(String preorder, int[] index, int depth) {
        if (index[0] >= preorder.length()) {
            return 0;
        }

        index[0]++;

        if (preorder.charAt(index[0]) == 'n') {
            int leftDepth = calculateDepth(preorder, index, depth + 1);
            int rightDepth = calculateDepth(preorder, index, depth + 1);
            return Math.max(leftDepth, rightDepth);
        }

        return depth;
    }
}
