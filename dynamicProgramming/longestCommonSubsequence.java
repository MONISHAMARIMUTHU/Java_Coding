package dynamicProgramming;

public class longestCommonSubsequence {

    public static int longestCommonSubsequence1(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        Integer[][] memo = new Integer[m][n]; // default null values

        return lcs(text1, text2, 0, 0, memo);
    }

    private static int lcs(String s1, String s2, int i, int j, Integer[][] memo) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }

        if (memo[i][j] != null) {
            return memo[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            memo[i][j] = 1 + lcs(s1, s2, i + 1, j + 1, memo);
        } else {
            memo[i][j] = Math.max(
                lcs(s1, s2, i + 1, j, memo),
                lcs(s1, s2, i, j + 1, memo)
            );
        }

        return memo[i][j];
    }

    public static void main(String[] args) {
        
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println("LCS length: " + longestCommonSubsequence1(text1, text2)); // 3

        text1 = "pmjghexybyrgzczy";
        text2 = "hafcdqbgncrcbihkd";
        System.out.println("LCS length: " + longestCommonSubsequence1(text1, text2)); // 4
    }
}

// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         return lcs(text1,text2,0,0);
//     }
//     private int lcs(String s1,String s2,int i,int j){
//         if(i==s1.length()||j==s2.length())
//             return 0;
//         if(s1.charAt(i)==s2.charAt(j))
//             return 1+lcs(s1,s2,i+1,j+1);
//         return Math.max(lcs(s1,s2,i+1,j),lcs(s1,s2,i,j+1));
//     }
// }
