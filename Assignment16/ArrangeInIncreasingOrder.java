import java.util.*;

public class ArrangeInIncreasingOrder {
    public static String arrangeInIncreasingOrder(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> resultQueue = new LinkedList<>();

        int expectedNumber = 1;

        while (!queue.isEmpty()) {
            int currentElement = queue.poll();

            if (currentElement == expectedNumber) {
                resultQueue.offer(currentElement);
                expectedNumber++;
            } else {
                if (!stack.isEmpty() && stack.peek() < currentElement) {
                    return "No";
                }
                stack.push(currentElement);
            }

            while (!stack.isEmpty() && stack.peek() == expectedNumber) {
                resultQueue.offer(stack.pop());
                expectedNumber++;
            }
        }

        while (!stack.isEmpty() && stack.peek() == expectedNumber) {
            resultQueue.offer(stack.pop());
            expectedNumber++;
        }

        if (!stack.isEmpty()) {
            return "No";
        }

        return "Yes";
    }

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(5, 1, 2, 3, 4));
        System.out.println("Can be arranged in increasing order? " + arrangeInIncreasingOrder(queue1));

        Queue<Integer> queue2 = new LinkedList<>(Arrays.asList(5, 1, 2, 6, 3, 4));
        System.out.println("Can be arranged in increasing order? " + arrangeInIncreasingOrder(queue2));
    }
}
