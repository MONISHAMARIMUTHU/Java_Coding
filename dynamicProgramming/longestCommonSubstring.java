package dynamicProgramming;
import java.util.*;
public class longestCommonSubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int m=s1.length();
        int n=s2.length();
        int res=0;
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    res=Math.max(res,dp[i][j]);
                }
                else
                    dp[i][j]=0;
            }
        }
        System.out.print(res);
    }
}
