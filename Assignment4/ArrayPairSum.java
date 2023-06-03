import java.util.Arrays;

public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int i = arrayPairSum(new int[]{1, 4, 3, 2});
        System.out.println(i);
    }
}
