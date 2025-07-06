public class q2 {
    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "Hello from here";
        String s2 = "reHello from he";

        if (areRotations(s1, s2)) {
            System.out.println("Output: Yes");
        } else {
            System.out.println("Output: No");
        }
    }
}

// How do you check if two strings are rotations of each other?

// Input: 
// 	“Hello from here”
// 	“reHello from he”
// Output: Yes
// Explanation: String 2 is a rotated string of String 1.
