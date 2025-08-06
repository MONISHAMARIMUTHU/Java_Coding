package subarray;

public class maxSubArr {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};  // sample input
        int result = maxSubArray(nums);

        System.out.println("Maximum subarray sum: " + result);
    }
}
//  find the subarray with the largest sum

//  Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// Example 2:
// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.

// static int maxSubarraySum(int[] arr) {
        
//         // Stores the result (maximum sum found so far)
//         int res = arr[0];
        
//         // Maximum sum of subarray ending at current position
//         int maxEnding = arr[0];

//         for (int i = 1; i < arr.length; i++) {
            
//             // Either extend the previous subarray or start 
//             // new from current element
//             maxEnding = Math.max(maxEnding + arr[i], arr[i]);
          
//             // Update result if the new subarray sum is larger
//             res = Math.max(res, maxEnding);
//         }
//         return res;
//     }