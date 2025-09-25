package dynamicProgramming;
import java.util.*;
public class knapsack01 {
    public static int ksrec(int w,int[] wt,int[] val,int n,Integer[][] memo){
        if(n==0||w==0) return 0;
        if(memo[n][w]!=null) return memo[n][w];
        int pick=0;
        if(wt[n-1]<=w)
            pick=val[n-1]+ksrec(w-wt[n-1],wt,val,n-1,memo);
        int notpick=ksrec(w,wt,val,n-1,memo);
        return memo[n][w]=Math.max(pick,notpick);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int n=sc.nextInt();
        int[] wt=new int[n];
        int[] val=new int[n];
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        Integer[][] memo=new Integer[n+1][w+1];
        System.out.print(ksrec(w,wt,val,n,memo));

    }
}
