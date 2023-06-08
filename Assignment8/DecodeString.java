import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                stringStack.push(currentString);
                currentString = "";
                count = 0;
            } else if (ch == ']') {
                StringBuilder sb = new StringBuilder(stringStack.pop());
                int repeatCount = countStack.pop();
                for (int i = 0; i < repeatCount; i++) {
                    sb.append(currentString);
                }
                currentString = sb.toString();
            } else {
                currentString += ch;
            }
        }

        return currentString;
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        DecodeString solution = new DecodeString();
        String decodedString = solution.decodeString(s);
        System.out.println("Decoded String: " + decodedString);
    }
}
