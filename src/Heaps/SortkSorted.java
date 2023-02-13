package Heaps;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SortkSorted {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 4, 5, 2, 3, 7, 8, 6, 10, 9);
        int k = 2;

        sortKSortedArray(nums, k);
        System.out.println(nums);


    }


    //The time complexity of the above solution is O(n.log(k))
    // since each insertion operation takes O(log(k)) time, and there are n elements in the input.
    // The additional space used by the program is O(k).
    public static void sortKSortedArray(List<Integer> arr, int k) {

        System.out.println("input  " + arr);
        PriorityQueue<Integer> pq = new PriorityQueue<>(arr.subList(0, k + 1));

        int index = 0;

        for (int i = k + 1; i < arr.size(); i++) {

            arr.set(index++, pq.poll());

            pq.add(arr.get(i));
        }

        while (!pq.isEmpty()) {
            arr.set(index++, pq.poll());
        }


    }


}
