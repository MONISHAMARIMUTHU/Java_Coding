package subarray;
import java.util.*;
public class PrimeTransform {
    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0)
                return false;
        return true;
    }

    // Find steps to convert num to nearest prime
    public static int stepsToNearestPrime(int num) {
        if (isPrime(num)) return 0;

        int lower = num - 1;
        int upper = num + 1;

        while (true) {
            if (lower >= 2 && isPrime(lower)) return num - lower;
            if (isPrime(upper)) return upper - num;
            lower--;
            upper++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter array length (n): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Compute total steps
        int totalSteps = 0;
        for (int num : arr) {
            totalSteps += stepsToNearestPrime(num);
        }

        // Output
        System.out.println("Total steps: " + totalSteps);
    }
}


// Convert each number in the array to a prime number.

// You can either increment (+1) or decrement (-1) to reach the nearest prime.

// Each ±1 operation counts as 1 step.

// Your goal is to find the total number of steps(minimum  steps) required to convert all numbers into their nearest primes.

