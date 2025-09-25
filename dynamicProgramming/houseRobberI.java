package dynamicProgramming;
import java.util.*;
public class houseRobberI {
    public static int dfs(int[] nums,int n,Integer[] memo){
        if (n <= 0) return 0;
        if (n == 1) return nums[0];
        if(memo[n]!=null) return memo[n];
        return memo[n]=Math.max(dfs(nums,n-1,memo),nums[n-1] + dfs(nums,n-2,memo));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Integer[] memo=new Integer[n+1];
        System.out.print( dfs(nums,n,memo));
    } 
}
