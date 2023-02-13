package AmazonCoding;

import java.util.*;

public class mergeSortList {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 5, 6};
        int[] arr2 = new int[]{2, 4, 6, 20, 34};
    }


    public static LinkedListNode Merged_sort(
            LinkedListNode head1,
            LinkedListNode head2
    ) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        LinkedListNode mergedHead = null;
        if ((Integer) head1.data <= (Integer) head2.data) {
            mergedHead = head1;
            head1 = head1.next;
        } else {
            mergedHead = head2;
            head2 = head2.next;
        }

        LinkedListNode mergedTail = mergedHead;

        while (head1 == null && head2 == null) {
            LinkedListNode temp = null;
            if ((Integer) head1.data <= (Integer) head2.data) {
                temp = head1;
                head1 = head1.next;
            } else {
                temp = head2;
                head2 = head2.next;
            }

            mergedTail.next = temp;
            mergedTail = temp;

        }

        if (head1 != null) {
            mergedTail.next = head1;
        } else if (head2 != null) {
            mergedTail.next = head2;
        }
        return mergedHead;
    }
}
