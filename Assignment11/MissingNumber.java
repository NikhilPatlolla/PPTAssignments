public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing number: " + missingNumber);
    }
}
