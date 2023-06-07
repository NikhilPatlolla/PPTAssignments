public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }

        // Remove the trailing whitespace
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s)); // Output: "s'teL ekat edoCteeL tsetnoc"

        s = "Hello World";
        System.out.println(reverseWords(s)); // Output: "olleH dlroW"

        s = "I love Java programming";
        System.out.println(reverseWords(s)); // Output: "I evol avaJ gnimmargorp"
    }
}
