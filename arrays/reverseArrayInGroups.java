import java.util.*;

class reverseArrayInGroups {
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size(); 

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); 
            
            while (left < right) {
                long temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseArrayInGroups sol = new reverseArrayInGroups();
        ArrayList<Long> arr = new ArrayList<>();
        // arr.add(1L);
        // arr.add(2L);
        // arr.add(3L);
        // arr.add(4L);
        // arr.add(5L);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLong());
        }
        int k = 3;
        sol.reverseInGroups(arr, k);
        System.out.println(arr); // Expected Output: [3, 2, 1, 5, 4]
        sc.close();
    }
}
// void reverseInGroups(ArrayList<Long> arr, int k) {
//     int n = arr.size();
//     for (int i = 0; i < n; i += k) {
//         // Reverse the sublist using built-in method
//         int right = Math.min(i + k, n); // `right` should be exclusive for subList
//         Collections.reverse(arr.subList(i, right));
//     }
    
// } To removes extra variable usage,we use collections.reverse()