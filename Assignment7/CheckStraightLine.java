public class CheckStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;

        // If there are only two points, they always form a straight line
        if (n == 2) {
            return true;
        }

        // Calculate the slope between the first two points
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        int deltaX = x1 - x0;
        int deltaY = y1 - y0;

        // Check if all other points lie on the same line
        for (int i = 2; i < n; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((x1 - x0) * (y - y0) != (x - x0) * (y1 - y0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(coordinates)); // Output: true

        coordinates = new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        System.out.println(checkStraightLine(coordinates)); // Output: false
    }
}
