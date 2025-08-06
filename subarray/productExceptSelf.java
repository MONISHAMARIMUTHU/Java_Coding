package subarray;
import java.util.Arrays;

public class productExceptSelf {
    static int[] productExceptSelf(int[] arr) {
        int zeros = 0, idx = -1, prod = 1;
        int n = arr.length;

        // Count zeros and track the index of the zero
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
                idx = i;
            } else {
                prod *= arr[i];
            }
        }

        int[] res = new int[n];
        Arrays.fill(res, 0);

        // If no zeros, calculate the product for all elements
        if (zeros == 0) {
            for (int i = 0; i < n; i++) 
                res[i] = prod / arr[i];
        }
        // If one zero, set product only at the zero's index
        else if (zeros == 1)
            res[idx] = prod;

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productExceptSelf(arr);

        for (int val : res)
            System.out.print(val + " ");
    }
}
// Input: arr[] = [10, 3, 5, 6, 2]
// Output: [180, 600, 360, 300, 900]
// Explanation: 

// For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
// For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
// For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
// For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
// For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.