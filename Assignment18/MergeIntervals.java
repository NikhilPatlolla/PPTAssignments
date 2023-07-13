import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
            int[] previousInterval = mergedIntervals.get(mergedIntervals.size() - 1);

            if (currentInterval[0] <= previousInterval[1]) {
                previousInterval[1] = Math.max(previousInterval[1], currentInterval[1]);
            } else {
                mergedIntervals.add(currentInterval);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}

public class MergeIntervals {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = solution.merge(intervals);
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }

    }
}
