package dynamicProgramming;
import java.util.*;

public class jumpGameII {

    public static int jump(int[] nums) {
        int jumps = 0, farthest = 0, end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == end) {
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=jump(arr);
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