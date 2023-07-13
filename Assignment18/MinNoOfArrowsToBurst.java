import java.util.Arrays;
import java.util.Comparator;

public class MinNoOfArrowsToBurst {

    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        // Sort the balloons based on their end position
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int count = 1;
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            // If the current balloon's start position is beyond the previous balloon's end position,
            // it means a new arrow needs to be shot
            if (points[i][0] > end) {
                count++;
                end = points[i][1];
            }
        }

        return count;
    }
}
