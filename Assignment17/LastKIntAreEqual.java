import java.util.LinkedList;
import java.util.Queue;

class DataStream {
    private int value;
    private int k;
    private Queue<Integer> queue;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        this.queue = new LinkedList<>();
    }

    public boolean consec(int num) {
        queue.add(num);

        if (queue.size() > k) {
            queue.remove();
        }

        if (queue.size() == k) {
            for (int i : queue) {
                if (i != value) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}

public class LastKIntAreEqual {
    public static void main(String[] args) {
        DataStream dataStream = new DataStream(2, 3);
        System.out.println(dataStream.consec(2));   // Output: false
        System.out.println(dataStream.consec(2));   // Output: false
        System.out.println(dataStream.consec(2));   // Output: true
        System.out.println(dataStream.consec(2));   // Output: true
        System.out.println(dataStream.consec(2));   // Output: true
        System.out.println(dataStream.consec(2));   // Output: true
        System.out.println(dataStream.consec(3));   // Output: false
        System.out.println(dataStream.consec(2));   // Output: false
    }
}
