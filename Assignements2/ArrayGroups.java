package Assignements2;

import java.util.Arrays;

public class ArrayGroups {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2, 9, 8};
        int maxSum = arrayPairSum(nums);
        System.out.println(maxSum);
    }

    public static int arrayPairSum(int[] nums){
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }

        return sum;

    }
}
