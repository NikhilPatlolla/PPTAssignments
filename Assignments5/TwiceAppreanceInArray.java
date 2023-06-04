import java.util.ArrayList;
import java.util.List;

public class TwiceAppreanceInArray {
    public static List<Integer> onceOrTwice(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;

            if (nums[index] < 0) {
                result.add(Math.abs(num));
            } else {
                nums[index] *= -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> integers = onceOrTwice(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(integers);
    }
}
