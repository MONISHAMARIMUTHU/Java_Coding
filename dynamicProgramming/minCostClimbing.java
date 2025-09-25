package dynamicProgramming;

public class minCostClimbing {
    
    public static int dfs(int[] cost,int i,Integer[] memo){
        if(i<0) return 0;
        if(i==0||i==1) return cost[i];
        if(memo[i]!=null) return memo[i];
        return memo[i]=cost[i]+Math.min(dfs(cost,i-1,memo),dfs(cost,i-2,memo));
    }
    
    public static int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        Integer[] memo=new Integer[n];
        return Math.min(dfs(cost,n-1,memo),dfs(cost,n-2,memo));
    }
    public static void main(String[] args) {

        // Test Case 1
        int[] cost1 = {10, 15, 20};
        System.out.println("Minimum cost: " + minCostClimbingStairs(cost1));
        // Expected: 15

        // Test Case 2
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println("Minimum cost: " + minCostClimbingStairs(cost2));
        // Expected: 6

    }
}

