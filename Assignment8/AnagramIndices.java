import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramIndices {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();

        if (s == null || p == null || s.length() < p.length()) {
            return indices;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count the characters in pattern p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int windowSize = p.length();

        // Count the characters in the sliding window of size p.length() in string s
        for (int i = 0; i < windowSize; i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        // Compare the counts of characters in the sliding window with pattern p
        if (Arrays.equals(sCount, pCount)) {
            indices.add(0);
        }

        // Slide the window and compare counts at each position
        for (int i = windowSize; i < s.length(); i++) {
            sCount[s.charAt(i - windowSize) - 'a']--;
            sCount[s.charAt(i) - 'a']++;

            if (Arrays.equals(sCount, pCount)) {
                indices.add(i - windowSize + 1);
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        AnagramIndices solution = new AnagramIndices();
        List<Integer> indices = solution.findAnagrams(s, p);
        System.out.println("Indices of Anagrams: " + indices);
    }
}
