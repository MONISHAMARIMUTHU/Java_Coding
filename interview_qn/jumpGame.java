import java.util.*;

public class jumpGame {

    public static int jump(int i,int[] arr,int[] memo){
        if(i==arr.length-1) return 0;
        if(memo[i]!=-1) return memo[i];
        int ans = Integer.MAX_VALUE;
        for(int j=i+1;j<=arr[i]+i && j<arr.length;j++){
            int val=jump(j,arr,memo);
            if(val!=Integer.MAX_VALUE){
                ans=Math.min(ans,1+val);
            }
        }
        return memo[i]=ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] memo = new int[n];
        for(int i=0;i<n;i++){
            memo[i]=-1;
        }
        int ans=jump(0,arr,memo);
        if (ans==Integer.MAX_VALUE){
            System.out.print("-1");
        }
        else{
            System.out.println(ans);
        }
    }
}

// IP : 11
//      1 3 5 8 9 2 6 7 6 8 9
// OP : 3