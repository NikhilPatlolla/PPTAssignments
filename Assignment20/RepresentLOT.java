import java.util.Stack;
public class RepresentLOT {

    public boolean isValidLevelOrder(int[] arr) {
        if (arr == null || arr.length <= 2) {
            return true;
        }

        Stack<Integer> stack = new Stack<>();
        int root = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < root) {
                return false;
            }

            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                root = stack.pop();
            }

            stack.push(arr[i]);
        }

        return true;
    }
}
