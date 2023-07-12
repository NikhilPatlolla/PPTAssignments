import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        // Sort the deck in ascending order
        Arrays.sort(deck);

        int n = deck.length;
        Queue<Integer> queue = new LinkedList<>();

        // Initialize the queue with the largest card
        queue.offer(deck[n - 1]);

        // Process the remaining cards
        for (int i = n - 2; i >= 0; i--) {
            queue.offer(queue.poll());
            queue.offer(deck[i]);
        }

        // Convert the queue to an array
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = queue.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        CardsInIncreasingOrder solution = new CardsInIncreasingOrder();
        int[] deck = {17, 13, 11, 2, 3, 5, 7};
        int[] result = solution.deckRevealedIncreasing(deck);
        System.out.println(Arrays.toString(result)); // Output: [2, 13, 3, 11, 5, 17, 7]
    }
}
