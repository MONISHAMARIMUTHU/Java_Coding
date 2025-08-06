package subarray;

public class subsum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int totalSum = 0;

        // Loop over all subarrays
        for (int start = 0; start < arr.length; start++) {
            int subSum = 0;
            for (int end = start; end < arr.length; end++) {
                subSum += arr[end];          // Add current element
                totalSum += subSum;          // Add to total
            }
        }

        System.out.println("Total sum of all subarrays: " + totalSum);
    }
}

// for (int i = 0; i < n; i++) {
//      int contribution = arr[i] * (i + 1) * (n - i);
//      totalSum += contribution;
// }

// Find the sum of all subarrays
// Input: [1, 2, 3]
// Output: 1+2+3+3+5+6 = 20