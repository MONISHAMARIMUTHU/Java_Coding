package dynamicProgramming;
import java.util.*;

public class knapsackUnbounded {
    public static int ksRec(int i,int w,int[] val,int[] wt,Integer[][] memo){
        if(i==val.length|| w == 0) return 0;
        if(memo[i][w]!=null) return memo[i][w];
        int take=0;
        if(wt[i]<=w)
            take=val[i]+ksRec(i,w-wt[i],val,wt,memo);
        int notake=ksRec(i+1,w,val,wt,memo);
        return memo[i][w]=Math.max(take,notake);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int capacity=sc.nextInt();
        int n=sc.nextInt();
        int[] val=new int[n];
        int[] wt=new int[n];
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        Integer[][] memo=new Integer[n][capacity+1];
        System.out.print(ksRec(0, capacity, val, wt, memo));
    }
}
