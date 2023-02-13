package MasterDataStructureAndAlgorithms;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;

public class FindNanoCode {

    public static void main(String[] args) {
       // String[] arr = new String[20];
      //  Arrays.fill(arr, "NAMO");
       // findNano(arr);

        String[] arr1 = {"a","c","f","x"};
        String[] arr2 = {"b", "d", "x"};
        String temp = "D";

     //   System.out.println( ContainCommonItems(arr1,arr2));

        SearchArray(arr1,temp );
    }




    public static void SearchArray(String[]  array1, String temValue){
        int count = 0;
        String[] arr =  new String[array1.length + 1];

        int size = array1.length;
        for(int i = 0; i < array1.length; i ++){

            arr[i] = array1[i];

        count++;

            System.out.println("Array ==> "+count+ " : "+arr[i]);

            if (count == size){
                arr[array1.length] = temValue;

                System.out.println("Value added "+count +" :" +arr[array1.length]);
            }





        }
    }



    public static void findNano(String[] array){
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
       int start =  dt.getSecond();

        for (int i =0; i < array.length; i ++){
            System.out.println(array[i]);
            if (array[i] == "NAMO"){
                System.out.println("We found Nano");
                break;
            }else {
                System.out.println("Not Found");
            }
        }

         int end = dt.getSecond();
        System.out.println(end - start);

    }


    public static boolean ContainCommonItems(String[] array1, String[] array2){

        HashMap<String,Boolean> hashMap = new HashMap<>();

        for (int i = 0; i < array1.length; i++){

               Boolean s = hashMap.get(array1[i]);

               if (s==null){

                String items = array1[i];


                hashMap.put(items,true);


           }

        }
        System.out.println(hashMap);

        for (int j = 0; j<array2.length; j++){

                if(hashMap.containsKey(array2[j])){
           return true;
            }
        }

     return false;
    }
}
