import java.util.ArrayList;
import java.util.List;

public class PermutationReconstructor {
    public static int[] reconstructPermutation(String s) {
        int n = s.length();
        List<Integer> perm = new ArrayList<>();
        int low = 0;
        int high = n;

        for (char ch : s.toCharArray()) {
            if (ch == 'I') {
                perm.add(low);
                low++;
            } else {
                perm.add(high);
                high--;
            }
        }

        // Add the remaining number to perm
        perm.add(low);

        // Convert List<Integer> to int[]
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = perm.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] perm = reconstructPermutation(s);

        // Print the reconstructed permutation
        for (int num : perm) {
            System.out.print(num + " ");
        }
    }
}
