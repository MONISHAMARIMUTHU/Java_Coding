public class removeKdigits {
    public String removeKdigits1(String num, int k) {
        StringBuilder Sb = new StringBuilder();

        for (char digit : num.toCharArray()) {
            while (k > 0 && Sb.length() > 0 && Sb.charAt(Sb.length() - 1) > digit) {
                Sb.deleteCharAt(Sb.length() - 1);
                k--;
            }
            Sb.append(digit);
        }

        while (k > 0 && Sb.length() > 0) {
            Sb.deleteCharAt(Sb.length() - 1);
            k--;
        }

        int index = 0;
        while (index < Sb.length() && Sb.charAt(index) == '0') {
            index++;
        }

        String s = Sb.substring(index);
        return s.isEmpty() ? "0" : s;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        System.out.println(sol.removeKdigits1("1432219", 3));  // Output: "1219"
        System.out.println(sol.removeKdigits1("10200", 1));    // Output: "200"
        System.out.println(sol.removeKdigits1("10", 2));       // Output: "0"
        System.out.println(sol.removeKdigits1("112", 1));      // Output: "11"
        System.out.println(sol.removeKdigits1("1234567890", 9)); // Output: "0"
    }
}
