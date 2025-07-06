package tcs;

import java.util.*;

public class permutation {
    static List<String> result = new ArrayList<>();
    public static void permute(String prefix, String str) {
        if (str.isEmpty()) {
            result.add(prefix); 
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        result.clear(); // Clear the result list for fresh input
        permute("", str);

        System.out.println("Permutations are:");
        for (String s : result) {
            System.out.println(s);
        }
        System.out.println("Total permutations: " + result.size());
    }
}

