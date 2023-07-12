import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingLetter {

    public static int firstUniqChar(String s) {
        Queue<Character> queue = new LinkedList<>();
        int[] frequency = new int[26]; // Assuming lowercase English letters

        // Enqueue characters and update frequency array
        for (char c : s.toCharArray()) {
            queue.offer(c);
            frequency[c - 'a']++;
        }

        // Check frequency and dequeue characters
        while (!queue.isEmpty()) {
            char c = queue.peek();
            if (frequency[c - 'a'] == 1) {
                return s.indexOf(c);
            }
            queue.poll();
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int result = firstUniqChar(s);
        System.out.println("First non-repeating character index: " + result);
    }
}
