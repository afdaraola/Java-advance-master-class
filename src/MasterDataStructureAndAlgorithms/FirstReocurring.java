package MasterDataStructureAndAlgorithms;


import java.util.Arrays;
import java.util.HashSet;

public class FirstReocurring {

    public static void main(String[] args) {

        Object[] arr = {8,4,5,6,9,8,4,0};

       Object result1 = firstReoccuringWorld(arr);
        Object results = firstReoccuringWorld2(arr);
        Object result = firstReoccuringWorld3(arr);

        System.out.println("O(n) best approach , space complexity 0(1) : " +result);
        System.out.println("O(n) Second best approach , Space complixity 0(n) : "+results);
        System.out.println("O(n*n) worst approach, Space complixity is O(1) : "+result1);
    }
    public static Object firstReoccuringWorld(Object[] array){

        if(array.length == 0){
            return -1;
        }

        for(int s = 0; s <  array.length; s ++){

            for(int i = s+1; i < array.length; i ++){

                if(array[s] == array[i]){
                    return  array[s];
                }
            }

        } //O(n*2) n squares

        return -1;
    }


    public static Object firstReoccuringWorld2(Object [] array){
        if(array.length == 0){
            return -1;
        }

        HashSet<Object> map = new HashSet<>();

        for(int i = 0; i < array.length; i ++){

            if(map.contains(array[i])){
                return array[i];
            }else{
                map.add(array[i]);
            }

        } //O(n)


        return -1;
    }

    public static Object  firstReoccuringWorld3(Object [] array){
        if(array.length == 0){
            return -1;
        }

        HashSet<Object> map = new HashSet<Object>(Arrays.asList(array));

        for(Object obj : array){
            if(map.contains(obj)){
                return obj;
            }
        }


        return -1;

    }

}
