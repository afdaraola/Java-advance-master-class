package IGotAnOffer;

import java.util.LinkedList;


public class CheckForPalindrome {
    public static void main(String[] args) {
        boolean result;
        System.out.println(result = checkForPalindrome("A man, a plan, a canal: Panama"));

    }

    public static boolean checkForPalindrome(String inputString) {

        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();

        String lowercase = inputString.toLowerCase();

        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);

            if (c >= 'a' && c <= 'z') {
              //  System.out.println("character push "+c);
                queue.addLast(c);
                stack.push(c);
            }

        }
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }
}
