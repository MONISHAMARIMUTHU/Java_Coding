import java.util.Stack;

public class validParethesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if(a == '(' || a == '[' || a == '{') {
                stack.push(a);
            } else {
                if(stack.isEmpty()) return false;

                if((stack.peek() == '(' && a == ')') ||
                   (stack.peek() == '[' && a == ']') ||
                   (stack.peek() == '{' && a == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "({[]})";
        boolean result = isValid(input);
        System.out.println("Is valid " + result);
    }
}
