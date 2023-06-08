public class LetterSwap {
    public boolean canBeEqual(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[goal.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "ab";
        String goal = "ba";
        LetterSwap solution = new LetterSwap();
        boolean canBeEqual = solution.canBeEqual(s, goal);
        System.out.println("Can be equal: " + canBeEqual);
    }
}
