import java.util.*;

class StackUsingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.offer(x);
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int peek() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

public class StackWithQueue {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek()); // Output: 3

        System.out.println("Pop: " + stack.pop()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 2

        System.out.println("Empty: " + stack.empty()); // Output: false

        stack.push(4);
        System.out.println("Top element: " + stack.peek()); // Output: 4
    }
}
