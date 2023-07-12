import java.util.Arrays;
import java.util.Stack;

public class MaxAbsoluteDifference {
    public static int maxAbsoluteDifference(int[] arr) {
        int n = arr.length;

        int[] leftSmaller = new int[n];
        int[] rightSmaller = new int[n];
        Arrays.fill(leftSmaller, 0);
        Arrays.fill(rightSmaller, 0);

        Stack<Integer> stack = new Stack<>();

        // Find the nearest smaller element on the right side
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                rightSmaller[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        stack.clear();

        // Find the nearest smaller element on the left side
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                leftSmaller[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        int maxDifference = 0;

        // Calculate the maximum absolute difference
        for (int i = 0; i < n; i++) {
            int difference = Math.abs(leftSmaller[i] - rightSmaller[i]);
            maxDifference = Math.max(maxDifference, difference);
        }

        return maxDifference;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 7, 7, 9, 3};
        int result = maxAbsoluteDifference(arr);
        System.out.println("Maximum Absolute Difference: " + result);
    }
}
