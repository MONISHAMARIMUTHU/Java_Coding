public class removeNthWord {
    public static void main(String[] args) {
        String sentence = "zoho is a great company to work for";
        int n = 4; // remove 4th word

        String[] words = sentence.split(" ");
        if (n <= 0 || n > words.length) {
            System.out.println("Invalid position.");
            return;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i != n - 1) {
                result.append(words[i]).append(" ");
            }
        }

        System.out.println("Updated sentence: " + result.toString().trim());
    }
}

