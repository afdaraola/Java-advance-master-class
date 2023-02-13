package ArraysPractice;

import java.util.ArrayList;
import java.util.Stack;

public class Duplicate {

    public static void main(String[] args) {
     int   N = 5;
       int  a[] = {2,3,1,2,3};

        System.out.println(duplicates(a,N));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        if(arr==null|| n < 1){
            return null;
        }
        ArrayList<Integer> list= new ArrayList<>();
        Stack<Integer> stack =new Stack<>();
        for(int i = 0; i < n; i++){

            if(!stack.contains(arr[i])){

                stack.push(arr[i]);
            }else{

                list.add(arr[i]);
            }


        }
        return list;
    }
}
