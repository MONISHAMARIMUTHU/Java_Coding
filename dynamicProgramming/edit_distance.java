package dynamicProgramming;

public class edit_distance {
        public static int edit(String s1, String s2, int m, int n, Integer[][] memo) {
            if (m == 0) return n; // insert all remaining chars
            if (n == 0) return m; // delete all remaining chars

            if (memo[m][n] != null) return memo[m][n];

            if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
                return memo[m][n] = edit(s1, s2, m - 1, n - 1, memo);
            }

            return memo[m][n] = 1 + Math.min(
                edit(s1, s2, m, n - 1, memo),    // Insert
                Math.min(
                    edit(s1, s2, m - 1, n, memo),    // Delete
                    edit(s1, s2, m - 1, n - 1, memo) // Replace
                )
            );
        }

        public static int minDistance(String word1, String word2) {
            int m = word1.length();
            int n = word2.length();
            Integer[][] memo = new Integer[m + 1][n + 1];
            return edit(word1, word2, m, n, memo);
        }
    

    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        int result = minDistance(word1, word2);
        System.out.println("Edit Distance between \"" + word1 + "\" and \"" + word2 + "\" = " + result);
    }
}
