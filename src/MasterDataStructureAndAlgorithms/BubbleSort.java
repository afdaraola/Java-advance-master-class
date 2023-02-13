package MasterDataStructureAndAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] sortedArray = {2,5,6,10,79};
        Arrays.sort(sortedArray);
        BubbleSort bubbleSort = new BubbleSort();

       bubbleSort.BubbleSortExercise(sortedArray);

        Arrays.stream(sortedArray).forEach(System.out::println);

    }

    public Integer[] BubbleSortExercise(Integer[] array){
        if(array.length ==0){
            return array;
        }



        int temp = 0;

        for(int i =0; i < array.length-1; i++){
            for(int j = 0; j < array.length-1; j++){

             if ( array[j] > array[j+1]){
                 temp = array[j];

                 array[j] = array[j+1];

                 array[j+1] = temp;
             }

            }
        }
     return array;
    }

    public Integer[] SelectionSorts(Integer[] arrays){

        int arraySize = arrays.length-1;

        int temp =0;

        for (int i = 0; i < arraySize-1; i ++){

            int minValue = arrays[i];
            int minIndex = i;

            for(int j = i+1; j < arraySize-1;  j++){

                if(minValue > arrays[j]){
                    minValue = arrays[j];
                    minIndex = j;
                }

                temp = arrays[i];
                arrays[i] = minValue;
                arrays[minIndex] = temp;
            }
        }

        return null;
    }
}
