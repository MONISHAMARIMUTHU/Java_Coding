package dynamicProgramming;

public class uniquePath_I {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // First row and column = only 1 way
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;

        // Fill the DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    // Main method to test
    public static void main(String[] args) {

        System.out.println("Unique Paths (3x7): " + uniquePaths(3, 7)); // 28
        System.out.println("Unique Paths (3x2): " + uniquePaths(3, 2)); // 3
        System.out.println("Unique Paths (1x1): " + uniquePaths(1, 1)); // 1
    }
}
