package Hard_Problems;

public class trapping_rain_water {
    public static int trap(int[] height) {
        int left[] = maxToLeft(height);
        int right[] = maxToRight(height);
        int totalWater = 0;

        for (int i = 0; i < height.length; i++) {
            totalWater += Math.min(left[i], right[i]) - height[i];
        }
        return totalWater;
    }

    public static int[] maxToLeft(int[] height) {
        int left[] = new int[height.length];
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            left[i] = max;
        }
        return left;
    }

    public static int[] maxToRight(int[] height) {
        int right[] = new int[height.length];
        int max = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            right[i] = max;
        }
        return right;
    }

    public static void main(String[] args) {

        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Water: " + trap(height1)); 
        // Expected output: 6

        int[] height2 = {4,2,0,3,2,5};
        System.out.println("Trapped Water: " + trap(height2)); 
        // Expected output: 9

        int[] height3 = {2,0,2};
        System.out.println("Trapped Water: " + trap(height3)); 
        // Expected output: 2
    }
}
