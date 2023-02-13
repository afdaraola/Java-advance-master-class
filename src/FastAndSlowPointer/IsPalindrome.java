package FastAndSlowPointer;


import java.util.Stack;

public class IsPalindrome {

    public static void main(String[] args) {

    }

    boolean isPalindrome(Node head) {
        Stack<Integer> s = new Stack<>();

        Node curr = head;
        boolean flag = true;

        while (curr != null) {
            s.push(curr.data);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.data != s.peek()) {
                flag = false;
            }

            curr = curr.next;
            s.pop();
        }

        return flag;

    }



    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node curr = head;
        Node temp = curr;
        Node prev = null;

        while(curr!=null){
            curr = curr.next;
            temp.next = prev;
            prev=temp;
            temp =curr;

        }

        return prev;
    }
}
