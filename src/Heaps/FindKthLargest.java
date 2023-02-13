package Heaps;

import java.util.*;

public class FindKthLargest {
    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k = 3;

        System.out.println("k'th largest array element is " + findKthLargest(ints, k));
//
//        int[] inp = {12 ,5, 787, 1, 23};
//
//        int k = 2, n = 5;
//        int[] ans = kLargest(inp,n ,k);
//
//        for(int a : ans){
//            System.out.println(a);
//        }

//        System.out.println("k'th largest array element is " +
//           kLargest(inp,n ,k));
    }


    // Given an integer array, find k’th largest element in the array where k is a positive integer
    // less than or equal to the length of array.

    // Function to find the k'th largest element in an array using min-heap
    // The worst-case time complexity of this approach will be O(n.log(n))
    public static int findKthLargest(List<Integer> nums, int k) {
        if (nums == null || nums.size() < k) {
            return -1;
        }

        // create a min-heap using the `PriorityQueue` class and insert
        // the first `k` array elements into the heap
        System.out.println("nums.subList(0, k) : " + nums.subList(0, k));

        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.subList(0, k));

        // do for remaining array elements
        for (int i = k; i < nums.size(); i++) {

            // if the current element is more than the root of the heap
            if (nums.get(i) > pq.peek()) {

                // replace root with the current element
                pq.poll();

                pq.add(nums.get(i));

            }
        }
        // return the root of min-heap
        return pq.peek();
    }

    // Function to find the k'th largest element in an array using max-heap
    //We can easily solve this problem in O(n + k.log(n)) by using a max-heap.
    public static int findKthLargestMaxHeap(List<Integer> nums, int k) {
        if (nums == null || nums.size() < k) {
            return -1;
        }
        // build a max-heap using the `PriorityQueue` class from all
        // elements in the list
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);   // or pass `Comparator.reverseOrder()`

        pq.addAll(nums);

        System.out.println(pq);

        // pop from max-heap exactly `k-1` times
        while (--k > 0) {
            pq.poll();
        }

        // return the root of max-heap
        return pq.peek();
    }

    public static int findKthLargestMaxArr(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            heap.poll();
        }
        return heap.peek();
    }


  public static   int[] kLargest(int[] arr, int n, int k) {
        // code here
        if(arr==null|| n < k){
            return arr;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i =0; i < k; i++){
            pq.add(arr[i]);
        }

      System.out.println("kkkkk: "+pq);
        for(int i=k; i < n; i++){
            if(pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
      System.out.println("kkkkk1: "+pq);
        int[] ans = new int[k];

        int i = k-1;
        while(pq.size()>0){
            ans[i] = pq.poll();
            i--;
        }

        return ans;
    }

}
