package dynamicProgramming;

public class minPathSum {
    public static int dfs(int[][] grid, int i, int j, Integer[][] memo) {
        // Out of bounds → invalid path
        if (i < 0 || j < 0) return Integer.MAX_VALUE;

        // Base case: starting cell
        if (i == 0 && j == 0) return grid[0][0];

        // Return memoized result if available
        if (memo[i][j] != null) return memo[i][j];

        // Recurrence: take min path from top or left
        return memo[i][j] = grid[i][j] + Math.min(
            dfs(grid, i - 1, j, memo),
            dfs(grid, i, j - 1, memo)
        );
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Integer[][] memo = new Integer[m][n];
        return dfs(grid, m - 1, n - 1, memo);
    }
    public static void main(String[] args) {

        int[][] grid1 = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int[][] grid2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Minimum Path Sum (grid1): " + minPathSum(grid1)); // 7
        System.out.println("Minimum Path Sum (grid2): " + minPathSum(grid2)); // 12
    }
}

