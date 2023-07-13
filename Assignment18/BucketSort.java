import java.util.Arrays;

public class BucketSort {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        int n = nums.length;

        // Find the minimum and maximum values in the array
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        // Calculate the size of each bucket
        int bucketSize = Math.max(1, (maxVal - minVal) / (n - 1));

        // Calculate the number of buckets
        int numBuckets = (maxVal - minVal) / bucketSize + 1;

        // Initialize the buckets
        int[] minBucket = new int[numBuckets];
        int[] maxBucket = new int[numBuckets];
        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        // Distribute the elements into buckets
        for (int num : nums) {
            int bucketIdx = (num - minVal) / bucketSize;
            minBucket[bucketIdx] = Math.min(minBucket[bucketIdx], num);
            maxBucket[bucketIdx] = Math.max(maxBucket[bucketIdx], num);
        }

        // Calculate the maximum gap
        int maxGap = 0;
        int prevMax = minVal;
        for (int i = 0; i < numBuckets; i++) {
            if (minBucket[i] == Integer.MAX_VALUE && maxBucket[i] == Integer.MIN_VALUE) {
                continue; // Skip empty buckets
            }
            maxGap = Math.max(maxGap, minBucket[i] - prevMax);
            prevMax = maxBucket[i];
        }

        return maxGap;
    }
}
