package Turing;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{}[](";
        System.out.println(validateString(s));
    }


    public static boolean validateString(String s) {

        boolean result = false;

        if (s == null) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char a : s.toCharArray()) {

            if (a == '(' || a == '[' || a == '{') {
                stack.push(a);
            }

            if (!stack.empty()) {
                if (a == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                        continue;
                    } else {
                        break;
                    }

                }

                if (a == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                        continue;
                    } else {
                        break;
                    }
                }

                if (a == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                        continue;
                    } else {
                        break;
                    }
                }

            }
        }

        return stack.empty() ? true : false;
    }
}
