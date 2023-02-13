package FastAndSlowPointer;

public class DetectLoop {

    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){

        // Add code here
        Node slow = head, fast = head.next;

        while(slow!=null){
            if(fast==null||fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }

        return false;
    }
}
