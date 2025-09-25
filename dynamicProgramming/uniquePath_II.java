package dynamicProgramming;

public class uniquePath_II {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        dp[0][0]=(obstacleGrid[0][0]==0)?1:0;
        for(int i=1;i<m;i++){
            if(obstacleGrid[i][0]==0 && dp[i-1][0]==1)
               dp[i][0]=1;
        }
        for(int j=1;j<n;j++){
            if(obstacleGrid[0][j]==0 && dp[0][j-1]==1 )
                dp[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==0)
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                else
                    dp[i][j]=0;
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid1 = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        int[][] obstacleGrid2 = {
            {0, 1},
            {0, 0}
        };

        System.out.println("Unique Paths (Grid 1): " + uniquePathsWithObstacles(obstacleGrid1)); // Expected 2
        System.out.println("Unique Paths (Grid 2): " + uniquePathsWithObstacles(obstacleGrid2)); // Expected 1
    }
}
