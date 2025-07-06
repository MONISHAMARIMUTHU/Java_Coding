import java.util.*;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            hm.put(curr,hm.getOrDefault(curr,0)+1);
        }
        int result =0;
        for (char key : hm.keySet()) {
             result+= (key - 'a'+1) * hm.get(key);
        }
        System.out.print(result);
    }
}
// 1.	Given the string, compute and return the value of the string as an integer.
// Input: “babca”
// Output: 9
// Explanation: Value of string is 2*2 + 2*1 + 1*3

