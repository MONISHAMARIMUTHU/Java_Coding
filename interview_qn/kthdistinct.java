import java.util.*;

public class kthdistinct {
    static int printKDistinct(int arr[], int k) 
    { 
        int n = arr.length; 
        Map <Integer, Integer> h = new HashMap<Integer, Integer> (); 
        
        for (int i = 0; i < n; i++) 
        {
            if(h.containsKey(arr[i]))
                h.put(arr[i], h.get(arr[i]) + 1);
            else
                h.put(arr[i], 1);
        }

        // If size of hash is 
        // less than k. 
        if (h.size() < k) 
            return -1; 

        // Traverse array again and 
        // find k-th element with 
        // count as 1. 
        int dist_count = 0; 
        for (int i = 0; i < n; i++) 
        { 
            if (h.get(arr[i]) == 1) 
                dist_count++; 
            if (dist_count == k) 
                return arr[i]; 
        } 
        return -1; 
    } 

    public static void main (String[] args) 
    { 
        int arr[] = {1, 2, 1, 3, 4, 2}; 
        System.out.println(printKDistinct(arr, 2)); 
    }
}
