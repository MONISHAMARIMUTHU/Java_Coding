package subarray;
import java.util.*;
public class sa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length (n): ");
        int n = sc.nextInt();
        System.out.print("Enter subarray length (m): ");
        int m = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (m > n || m < 1) {
            System.out.println("Invalid subarray length.");
            return;
        }

        // Logic: sliding window
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            int product = arr[i] * arr[i + m - 1];
            min = Math.min(min, product);
        }

        System.out.println("Minimum product of first and last element in subarrays of length " + m + " is: " + min);
    }
}

// Find the minimum product of the first and last elements of all contiguous subarrays of length m.