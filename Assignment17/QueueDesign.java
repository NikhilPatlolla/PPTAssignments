import java.util.Deque;
import java.util.LinkedList;

class FrontMiddleBackQueue {
    private Deque<Integer> frontDeque;
    private Deque<Integer> backDeque;

    public FrontMiddleBackQueue() {
        frontDeque = new LinkedList<>();
        backDeque = new LinkedList<>();
    }

    public void pushFront(int val) {
        frontDeque.addFirst(val);
        balanceQueues();
    }

    public void pushMiddle(int val) {
        if (frontDeque.size() == backDeque.size()) {
            frontDeque.addLast(val);
        } else {
            frontDeque.addLast(backDeque.removeFirst());
            frontDeque.addFirst(val);
        }
    }

    public void pushBack(int val) {
        backDeque.addLast(val);
        balanceQueues();
    }

    public int popFront() {
        if (isEmpty())
            return -1;

        if (!frontDeque.isEmpty())
            return frontDeque.removeFirst();

        int val = backDeque.removeFirst();
        balanceQueues();
        return val;
    }

    public int popMiddle() {
        if (isEmpty())
            return -1;

        if (frontDeque.size() == backDeque.size())
            return frontDeque.removeLast();

        return frontDeque.removeFirst();
    }

    public int popBack() {
        if (isEmpty())
            return -1;

        if (!backDeque.isEmpty())
            return backDeque.removeLast();

        int val = frontDeque.removeLast();
        balanceQueues();
        return val;
    }

    private void balanceQueues() {
        while (frontDeque.size() > backDeque.size()) {
            backDeque.addFirst(frontDeque.removeLast());
        }

        while (frontDeque.size() < backDeque.size() - 1) {
            frontDeque.addLast(backDeque.removeFirst());
        }
    }

    private boolean isEmpty() {
        return frontDeque.isEmpty() && backDeque.isEmpty();
    }
}

public class QueueDesign {
    public static void main(String[] args) {
        FrontMiddleBackQueue queue = new FrontMiddleBackQueue();
        queue.pushFront(1);
        queue.pushMiddle(2);
        queue.pushMiddle(3);
        queue.pushBack(4);
        System.out.println(queue.popFront());  // Output: 1
        System.out.println(queue.popMiddle()); // Output: 3
        System.out.println(queue.popMiddle()); // Output: 2
        System.out.println(queue.popBack());   // Output: 4
    }
}
