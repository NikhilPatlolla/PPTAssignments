import java.util.Arrays;

public class LongestIncreasingSubOrder {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];

        // Initialize the dp array with 1 (minimum subsequence length is 1)
        Arrays.fill(dp, 1);

        int maxLength = 1;

        // Iterate through the array
        for (int i = 1; i < n; i++) {
            // Check all previous elements for a possible subsequence
            for (int j = 0; j < i; j++) {
                // If nums[i] is greater than nums[j], we can extend the subsequence
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxLength = Math.max(maxLength, dp[i]);
                }
            }
        }

        return maxLength;
    }
}
