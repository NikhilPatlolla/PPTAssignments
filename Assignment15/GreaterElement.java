import java.util.*;

public class GreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize result array with -1

        Stack<Integer> stack = new Stack<>(); // Stack to store indices of elements

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                // Set the next greater element for the elements in the stack
                result[stack.pop()] = arr[i];
            }
            stack.push(i); // Push current index to the stack
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 25, 7, 8, 6, 10 };
        int[] result = nextGreaterElement(arr);

        System.out.println("Element\tNext Greater Element");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t\t" + result[i]);
        }
    }
}
