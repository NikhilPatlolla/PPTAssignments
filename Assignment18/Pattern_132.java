import java.util.Stack;
public class Pattern_132 {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int potential2 = Integer.MIN_VALUE;

        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Check if nums[i] is smaller than the potential "2" element
            if (nums[i] < potential2) {
                return true;
            }

            // Keep track of the maximum value as potential "2" element
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                potential2 = stack.pop();
            }

            // Push the current element to the stack as a potential candidate for "2"
            stack.push(nums[i]);
        }

        return false;
    }
}

