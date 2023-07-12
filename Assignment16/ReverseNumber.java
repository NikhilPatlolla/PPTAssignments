import java.util.Stack;

public class ReverseNumber {

    public static int reverseNumber(int number) {
        String numberString = String.valueOf(number);
        Stack<Character> stack = new Stack<>();

        for (char c : numberString.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return Integer.parseInt(reversedString.toString());
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Original Number: " + number);
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
