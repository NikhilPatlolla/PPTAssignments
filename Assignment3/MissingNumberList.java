import java.util.ArrayList;
import java.util.List;

public class MissingNumberList {
    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();
        int start = lower;

        for (int num : nums) {
            if (num == start) {
                start++;
            } else if (num > start) {
                result.add(createRange(start, num - 1));
                start = num + 1;
            }
        }

        if (start <= upper) {
            result.add(createRange(start, upper));
        }

        return result;
    }

    private static List<Integer> createRange(int start, int end) {
        List<Integer> range = new ArrayList<>();
        range.add(start);
        range.add(end);
        return range;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,3,50,75};
        List<List<Integer>> listList = findMissingRanges(arr, 0, 99);
        System.out.println(listList);
    }
}
