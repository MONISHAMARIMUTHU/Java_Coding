import java.util.*;

public class kthDistinctString {
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        
        for (String s : arr) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

        for (String word : arr) {
            if (hm.get(word) == 1) {
                ans.add(word);
            }
        }

        if (k <= ans.size())
            return ans.get(k - 1);
        return "";
    }

    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "c", "d", "d"};
        int k = 2;
        String result = kthDistinct(arr, k);
        System.out.println("The " + k + "th distinct string is: " + result);
    }
}
