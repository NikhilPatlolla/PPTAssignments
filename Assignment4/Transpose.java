import java.util.Arrays;

public class Transpose {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                transpose[column][row] = matrix[row][column];
            }
        }

        return transpose;
    }

    public static void main(String[] args) {
        int[][] transpose1 = transpose(new int[][]{{1, 2, 3}, {4, 5, 6},
                {7, 8, 9}});
        for(int[] arr : transpose1){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();

    }

}
