package String;

import java.util.ArrayDeque;
public class BalancedBrackets {


    public static boolean balance(String brackets) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < brackets.length(); i++) {

            char ch = brackets.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {

                stack.push(ch);

            } else if (ch == ')') {
                if (!handlePop(stack, '(')) {
                    return false;
                }
            } else if (ch == ']') {
                if (!handlePop(stack, '[')) {
                    return false;
                }
            } else if (ch == '}') {
                if (!handlePop(stack, '{')) {
                    return false;
                }
            }

        }

        return stack.size() == 0;
    }

    public static boolean handlePop(ArrayDeque<Character> st, char corresOpeningbracket) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != corresOpeningbracket) {
            System.out.println(false);
            return false;
        } else {
            st.pop();
            return true;
        }
    }

    public static void main(String[] args) {

        System.out.println("Is Balanced : " + balance("((a+b))"));
    }
}
