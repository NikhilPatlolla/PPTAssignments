public class MaxSumSubArray {

    public static int maxSubarraySumCircular(int[] nums) {
        int maxSum = kadane(nums); // Maximum subarray sum within the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Calculate the minimum subarray sum within the inverted array
        int[] invertedNums = invert(nums);
        int minSum = kadane(invertedNums);

        int maxCircularSum = totalSum + minSum; // Maximum subarray sum with elements wrapping around the ends of the array

        // Return the maximum of the maximum subarray sum within the array and the maximum subarray sum with elements wrapping around the ends of the array
        return Math.max(maxSum, maxCircularSum);
    }

    private static int kadane(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    private static int[] invert(int[] nums) {
        int[] invertedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            invertedNums[i] = -nums[i];
        }
        return invertedNums;
    }

    public static void main(String[] args) {
        int[] nums = {5, -3, 4, -1, 2, 6, -2};
        int result = maxSubarraySumCircular(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

