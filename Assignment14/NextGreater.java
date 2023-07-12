import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreater {
    public int[] nextGreaterNodes(Node head) {
        List<Integer> list = new ArrayList<>();

        // Convert the linked list to an array list
        Node curr = head;
        while (curr != null) {
            list.add(curr.data);
            curr = curr.next;
        }

        int[] result = new int[list.size()];
        Stack<Integer> stack = new Stack<>();

        // Iterate through the array list in reverse order
        for (int i = list.size() - 1; i >= 0; i--) {
            int value = list.get(i);

            // Pop elements from the stack until a greater element is found
            while (!stack.isEmpty() && stack.peek() <= value) {
                stack.pop();
            }

            // Set the result for the current index
            if (stack.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = stack.peek();
            }

            // Push the current value to the stack
            stack.push(value);
        }

        return result;
    }
}