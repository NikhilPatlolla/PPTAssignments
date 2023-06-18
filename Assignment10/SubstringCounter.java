public class SubstringCounter {
    public static int countSubstrings(String str) {
        if (str.length() <= 1) {
            return str.length();
        }

        int count = 0;

        // Check if the first and last characters are the same
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            count++;
        }

        // Recursively count substrings excluding the first and last characters
        count += countSubstrings(str.substring(1, str.length() - 1));

        return count;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int count = countSubstrings(str);
        System.out.println("Count of substrings: " + count);
    }
}
