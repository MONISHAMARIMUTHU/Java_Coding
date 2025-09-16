import java.util.Arrays;
public class threesumClosest {    
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closeSum = nums[0] + nums[1] + nums[2];
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int currsum = nums[i] + nums[l] + nums[r]; // ✅ use l and r

                if (currsum == target) {
                    return currsum; // exact match
                }

                if (Math.abs(currsum - target) < Math.abs(closeSum - target)) {
                    closeSum = currsum; // update closest
                }

                if (currsum < target) {
                    l++;  // need bigger sum
                } else {
                    r--;  // need smaller sum
                }
            }
        }
        return closeSum;
    }

    public static void main(String[] args) {

        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("Closest sum: " + threeSumClosest(nums1, target1)); 
        // Expected output: 2

        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println("Closest sum: " + threeSumClosest(nums2, target2)); 
        // Expected output: 0

        int[] nums3 = {1, 1, 1, 1};
        int target3 = 5;
        System.out.println("Closest sum: " + threeSumClosest(nums3, target3)); 
        // Expected output: 3
    }
}
