import java.util.Arrays;

public class TimeInterval {
    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean b = canAttendMeetings(new int[][]{{0, 3}, {5, 10}, {15, 20}});
        System.out.println(b);
    }
}
