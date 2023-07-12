import java.util.Stack;

public class WordLeftCount {

    public static int countWordsLeft(String[] words) {
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            if (stack.isEmpty() || !word.equals(stack.peek())) {
                stack.push(word);
            } else {
                stack.pop();
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        String[] words1 = {"ab", "aa", "aa", "bcd", "ab"};
        int result1 = countWordsLeft(words1);
        System.out.println("Number of words left: " + result1);

        String[] words2 = {"tom", "jerry", "jerry", "tom"};
        int result2 = countWordsLeft(words2);
        System.out.println("Number of words left: " + result2);
    }
}
