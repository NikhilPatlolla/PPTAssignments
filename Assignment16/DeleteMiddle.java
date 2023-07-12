import java.util.Stack;

public class DeleteMiddle {
    public static void deleteMiddle(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int size = stack.size();
        int mid = (size / 2) + 1;

        deleteMiddleHelper(stack, 1, mid);
    }

    public static void deleteMiddleHelper(Stack<Integer> stack, int index, int mid) {
        if (index == mid) {
            stack.pop();
            return;
        }

        int element = stack.pop();
        deleteMiddleHelper(stack, index + 1, mid);
        stack.push(element);
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        System.out.println("Original Stack: " + stack1);
        deleteMiddle(stack1);
        System.out.println("Stack after deleting middle element: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        System.out.println("\nOriginal Stack: " + stack2);
        deleteMiddle(stack2);
        System.out.println("Stack after deleting middle element: " + stack2);
    }
}
