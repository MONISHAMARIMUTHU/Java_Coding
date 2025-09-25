package dynamicProgramming;
import java.util.*;
public class Nth_fibonacci {
    public static int fib(int n){
        if (n == 0) return 0;   // handle base case
        if (n == 1) return 1; 
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    // public static int fibOptimized(int n) {
    // if (n <= 1) return n;
    // int a = 0, b = 1;
    // for (int i = 2; i <= n; i++) {
    //     int c = a + b;
    //     a = b;
    //     b = c;
    // }
    // return b;
    // }

    // public static int fibRecursive(int n) {
    //     if (n <= 1) return n;
    //     return fibRecursive(n - 1) + fibRecursive(n - 2);
    // }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fib(n));
    }
}
