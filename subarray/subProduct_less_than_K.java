package subarray;

public class subProduct_less_than_K {
    public static int numSubarrayProductLessThanK(int[] arr, int k) {
        if (k <= 1) return 0; // no subarray possible

        int count = 0;
        int left = 0;
        long prod = 1;

        for (int right = 0; right < arr.length; right++) {
            prod *= arr[right];

            while (prod >= k && left <= right) {
                prod /= arr[left];
                left++;
            }

            // all subarrays ending at 'right' and starting from [left..right]
            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int k1 = 10;
        System.out.println(numSubarrayProductLessThanK(arr1, k1)); // 7

        int[] arr2 = {1, 9, 2, 8, 6, 4, 3};
        int k2 = 100;
        System.out.println(numSubarrayProductLessThanK(arr2, k2)); // 16

        int[] arr3 = {10, 5, 2, 6};
        int k3 = 100;
        System.out.println(numSubarrayProductLessThanK(arr3, k3)); // 8
    }
}

// Given an array of positive numbers, 
// calculate the number of possible contiguous subarrays having product lesser than a given number K.