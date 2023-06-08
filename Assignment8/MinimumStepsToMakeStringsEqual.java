public class MinimumStepsToMakeStringsEqual {
    public int minSteps(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // Create a 2D array to store the minimum steps
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the first row and first column
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Calculate the minimum steps
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    // Characters are the same, no deletion required
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Characters are different, choose the minimum steps from deleting in word1 or word2
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[m][n];
    }
}
