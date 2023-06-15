public class CountConsonants {
    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase for easier comparison

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && !isVowel(ch)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks portal";
        int consonantCount = countConsonants(str);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
