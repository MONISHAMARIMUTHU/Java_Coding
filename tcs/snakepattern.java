package tcs;

public class snakepattern {
    static void print(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] arr=new int[m][n];
        
        for (int i = 0; i < m; i++) {
            
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++)
                    arr[i][j]=mat[i][j];
                    
            } else { 
                for (int j = n - 1; j >= 0; j--)
                    arr[i][j]=mat[i][n - 1 - j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {45, 48, 54},
            {21, 89, 87},
            {70, 78, 15}
        };

        print(mat);
    }
}
