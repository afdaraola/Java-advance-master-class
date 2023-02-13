package Heaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKthSmallest {
    public static void main(String[] args) {

//        List<Integer> input = Arrays.asList(7, 4, 6, 3, 9, 1);
//        int k = 3;
//
//        System.out.println("k'th smallest array element is " +
//                findKthSmallest(input, k));

        int[] inp ={7, 10, 4, 3, 20, 15};
        int k  = 3;
        System.out.println("k'th smallest array element is " +
              findKthSmallestArr(inp, k));
    }

    // Function to find the k'th smallest element in an array using max-heap
    //We can easily solve this problem in O(n.log(k)) time by using a max-heap,
    public static int findKthSmallest(List<Integer> list, int k) {

        if (list == null || list.size() < k) {
            return -1;
        }

        // create a max-heap using the `PriorityQueue` class and
        // insert the first `k` array elements into the heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(list.subList(0, k));

        // do for remaining array elements
        for (int i = k; i < list.size(); i++) {

            // if the current element is less than the root of the heap
            if (list.get(i) < pq.peek()) {

                // replace root with the current element
                pq.poll();
                pq.add(list.get(i));
            }


        }
        // return the root of max-heap
        return pq.peek();
    }

    // Function to find the k'th smallest element in an array using min-heap
    //We can easily solve this problem in O(n + k.log(n)) by using a min-heap.
    public static int findKthSmallestMin(List<Integer> input ,  int  k){
        if (input==null || input.size() < k){
            return -1;
        }
        // create an empty min-heap and initialize it with all input elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(input);

        // pop from min-heap exactly `k-1` times
        while (--k>0){
            pq.poll();
        }
        // return the root of min-heap
        return pq.peek();
    }

    public static int findKthSmallestArr(int[] input ,  int  k){
        if (input==null || input.length < k){
            return -1;
        }
        // create an empty min-heap and initialize it with all input elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();

            for(int   i = 0; i <  input.length; i++){
                pq.add(input[i]);
            }
        System.out.println(pq);
        // pop from min-heap exactly `k-1` times
        while (--k>0){
            pq.poll();
        }
        // return the root of min-heap
        return pq.peek();
    }


}
