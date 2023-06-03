public class MaxIntegerMatrix {
    public static int maxCount(int m, int n, int[][] ops) {
        int minRow = m;
        int minCol = n;

        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }

        return minRow * minCol;
    }

    public static void main(String[] args) {
        int i = maxCount(3, 3, new int[][]{{2, 2}, {3, 3}});
        System.out.println(i);
    }
}
