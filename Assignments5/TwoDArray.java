import java.util.Arrays;

public class TwoDArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0]; // Return empty 2D array
        }

        int[][] result = new int[m][n];
        int index = 0;

        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                result[row][column] = original[index++];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] ints = construct2DArray(new int[]{1, 2, 3, 4}, 2, 2);
        for (int[] arr: ints
             ) {
            System.out.println(Arrays.toString(arr));

        }
    }
}
