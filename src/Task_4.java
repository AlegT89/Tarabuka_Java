
import java.util.Stack;

public class Task_4 {
    public static void main(String[] args) {
        String brackets = "[((())()(()))]]";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < brackets.length(); i++) {
            char c = brackets.charAt(i);
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if ((c == ')' || c == ']') && !stack.isEmpty()) {
                char upper = stack.peek();
                if ((c == ')' && upper == '(') || (c == ']' && upper == '[')) {
                    stack.pop();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Правильная скобочная последовательность");
        } else {
            System.out.println("Неправильная скобочная последовательность");
        }
    }
}