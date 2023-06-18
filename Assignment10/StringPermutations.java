public class StringPermutations {
    public static void printPermutations(String str) {
        char[] chars = str.toCharArray();
        printPermutationsHelper(chars, 0, chars.length - 1);
    }

    private static void printPermutationsHelper(char[] chars, int left, int right) {
        if (left == right) {
            System.out.println(String.valueOf(chars));
            return;
        }

        for (int i = left; i <= right; i++) {
            swap(chars, left, i);
            printPermutationsHelper(chars, left + 1, right);
            swap(chars, left, i); // Backtracking
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abb";
        printPermutations(str);
    }
}
