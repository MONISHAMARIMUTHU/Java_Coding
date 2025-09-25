package dynamicProgramming;

public class longestPalindromicSubsequence {
        public static int lps(String s, int low, int high, Integer[][] memo) {
            if (low > high) return 0;       // invalid range
            if (low == high) return 1;      // single char is palindrome

            if (memo[low][high] != null) return memo[low][high];

            if (s.charAt(low) == s.charAt(high)) {
                return memo[low][high] = lps(s, low + 1, high - 1, memo) + 2;
            }

            return memo[low][high] = Math.max(
                lps(s, low, high - 1, memo),
                lps(s, low + 1, high, memo)
            );
        }

        public static int longestPalindromeSubseq(String s) {
            int n = s.length();
            Integer[][] memo = new Integer[n][n];
            return lps(s, 0, n - 1, memo);
        }
    

    public static void main(String[] args) {

        String s1 = "bbbab";
        String s2 = "cbbd";
        System.out.println("LPS length of \"" + s1 + "\" = " + longestPalindromeSubseq(s1));
        System.out.println("LPS length of \"" + s2 + "\" = " + longestPalindromeSubseq(s2));
    }
}

