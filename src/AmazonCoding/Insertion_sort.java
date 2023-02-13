package AmazonCoding;

import java.util.Stack;

public class Insertion_sort {
    public static void main(String[] args) {
        int [] arr = new int[] {4,2,7,1,3};
        sort(arr);
    }

    public static void sort (int [] array){
        for (int i = 0; i<array.length; i++) {
            int position = i;

            int temp_value = array[i];
            while (position > 0 && array[position - 1] > temp_value) {
                array[position] = array[position - 1];
                position = position - 1;
                array[position] = temp_value;

            }

        }
        for (int element : array){
            System.out.println(element);
        }
    }

    public static void Intersection(int [] first_arry, int[] second_arry){

        Stack<Integer> res = new Stack<Integer>();

        for (int i = 0; i<first_arry.length; i++){
            for(int j=0; j<second_arry.length; j++){
                if(first_arry[i] == second_arry[j]){
                    res.push(first_arry[i]);
                    break;
                }
            }
        }
        System.out.println(res);
    }

}
