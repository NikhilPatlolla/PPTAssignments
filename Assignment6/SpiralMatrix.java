public class SpiralMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int num = 1;

        while (num <= n * n) {
            // Fill top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            if (top > bottom) {
                break;
            }

            // Fill rightmost column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            if (right < left) {
                break;
            }

            // Fill bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            if (bottom < top) {
                break;
            }

            // Fill leftmost column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
