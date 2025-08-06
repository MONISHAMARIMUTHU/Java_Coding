import java.util.HashMap;
import java.util.Map;
public class majorityElement {
    static int majorityElement(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> countMap = new HashMap<>();

        // Traverse the array and count occurrences using the hash map
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
          
            // Check if current element count exceeds n / 2
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }

        // If no majority element is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElement(arr));
    }
}
