package subarray;

public class allsubarraypairs {
    static void printSubArrays(int[] arr, int start, int end)
    { 
        // Stop if we have reached the end of the array
        if (end == arr.length)
            return;
        // Increment the end point and start from 0
        else if (start > end)
            printSubArrays(arr, 0, end + 1);
        // Print the subarray and increment the starting point
        else {
            System.out.print("[");
            for (int i = start; i < end; i++)
                System.out.print(arr[i] + ", ");
            System.out.println(arr[end] + "]");
            printSubArrays(arr, start + 1, end);
        }
        return;
    }

    public static void main(String args[])
    {
        int[] arr = { 1, 2, 3 };
        printSubArrays(arr, 0, 0);
    }
}

// Generating All Subarrays
// Example: 
// Input: arr[] = [1, 2, 3]
// Output: [ [1], [1, 2], [2], [1, 2, 3], [2, 3], [3] ]