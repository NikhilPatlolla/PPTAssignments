
import java.util.*;

public class NearestSmallestElement {
    public static int[] nearestSmallerElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize result array with -1

        Stack<Integer> stack = new Stack<>(); // Stack to store indices of elements

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop(); // Pop elements that are greater than or equal to the current element
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek(); // Set the nearest smaller element from the stack
            }
            stack.push(arr[i]); // Push current element to the stack
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 25, 7, 8 };
        int[] result = nearestSmallerElements(arr);

        System.out.println("Element\tNearest Smaller Element");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t\t" + result[i]);
        }
    }
}
