package BinarySearchPractice;

import java.util.ArrayList;

public class BinarySearchOrTwoPointer {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};//{2, 3, 4, 10, 40};
        int x = 4;
        int n = arr.length - 1;
        int result;
        boolean rest;
       // result = binarySearchIterative(arr, x);
        //  result=binarySearchRecursion(arr,0,n,x);

//        System.out.println(rest = twoSumSlow(arr,x));
//        System.out.println(rest=twoSum(arr,x));

        rotate(arr,x);


//
//        if (result == -1) {
//            System.out.println("element not present");
//        } else {
//            System.out.println("The  element found in index " + result);
//        }

    }


    public static int binarySearchIterative(int array[], int x) {

        //set first to first index
        int l = 0;

        //set last to last elements in array
        int r = array.length - 1;

        //calculate mid of the array
        int mid = (r - l) / 2;

        //while first and last do not overlap
        while (l <= r) {
            //if the mid < key, then key to be searched is in the first half of array
            if (array[mid] < x) {
                l = mid + 1;
            } else if (array[mid] == x) {
                //if key = element at mid, then print the location
                return mid;
            } else {

                //the key is to be searched in the second half of the array
                r = mid - 1;
            }

            mid = (r + l) / 2;
        }
        // if we reach here, then element was
        // not present
        return -1;
    }

    public static int binarySearchRecursion(int[] array, int first, int last, int key) {


        if (first <= last) {
            int mid = first + (last - first) / 2;

            if (array[mid] == key) {
                return mid;
            }


            if (array[mid] > key) {
                return binarySearchRecursion(array, first, mid - 1, key);
            } else {
                return binarySearchRecursion(array, mid + 1, last, key);
            }


        }
        return -1;
    }

    //two pointer technique
    // The time complexity of this solution is O(n^2).
    public static boolean twoSumSlow(int[] input, int targetSum) {

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 1; j < input.length - 1; j++) {

                if (input[i] + input[j] == targetSum) {
                    return true;
                }
            }
        }

        return false;
    }

    //The time complexity of this solution is O(n) and space complexity is O(1),
    public static boolean twoSum(int[] input, int targetValue) {

        int pointOne = 0;
        int pointTwo = input.length - 1;

        while (pointOne < pointTwo) {

            int sum = input[pointOne] + input[pointTwo];

            if (sum == targetValue) {
                return true;
            } else if (sum < targetValue) {
                pointOne++;
            } else {
                pointTwo--;
            }


        }

        return false;
    }

//The time complexity of this solution is O(n) and space complexity is O(1).
    public static void rotate(int[] input, int step){
//        for(int  data = 0; data<input.length; data++){
//
//            System.out.println(input[data]);
//        }
//        System.out.println("=================");

        step%= input.length;


        reverse(input,0,input.length-1);
        reverse(input,0,step-1);
        reverse(input, step,input.length-1);

        System.out.println("=================rotate array");
        for(int  data = 0; data<input.length; data++){

            System.out.println(input[data]);
        }
  }

    public static void reverse(int[] input, int start, int end){

      while(start < end){
          int temp = input[start];
          input[start] = input[end];
          input[end] = temp;
          start++;
          end--;
      }
    }


    public static void  reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here

        for(int i=0; i < n; i+=k){
            if(i+k>n){
                reverseList(arr,i,n-1);
                break;
            }
            int   h = i+k-1;
            reverseList(arr,i,h);

        }
    }

    public static void reverseList(ArrayList<Integer> arr, int start, int end){


        while(start<end)
        {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }



}


