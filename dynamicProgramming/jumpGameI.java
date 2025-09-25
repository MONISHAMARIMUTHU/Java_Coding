package dynamicProgramming;
import java.util.*;

public class jumpGameI {
    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) return false;  // stuck before reaching i
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();         // size of array
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(canJump(nums));
    }
}

// You are given an integer array nums. Each element represents the maximum jump length from that position.
// You start at index 0. Return true if you can reach the last index, otherwise return false.