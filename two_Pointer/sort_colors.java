public class sort_colors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Driver
    public static void main(String[] args) {

        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors(nums1);
        System.out.println(java.util.Arrays.toString(nums1)); 
        // [0, 0, 1, 1, 2, 2]

        int[] nums2 = {2, 0, 1};
        sortColors(nums2);
        System.out.println(java.util.Arrays.toString(nums2)); 
        // [0, 1, 2]
    }
}

