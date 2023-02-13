package MasterDataStructureAndAlgorithms;

public class MergedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6};
        int[] arr2 = {3,4,5,6};

        int[] arr =  MergedTwoArrays(arr1,arr2);

        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }

    public static int[] MergedTwoArrays(int[] arr1, int[] arr2){

        if(arr1.length == 0){
            return arr2;
        }

        if(arr2.length == 0){
            return arr1;
        }
final int[] mergedArray = new int[arr1.length+arr2.length];

        int j = 0;
        int k = 0;

        for (int i = 0; i < mergedArray.length; i ++){

            if((j!=arr1.length) && (k==arr2.length || arr1[j] < arr2[k])){

               mergedArray[i] = arr1[j];
               j++;

            }else{
                mergedArray[i] = arr2[k];
                k++;
            }

        }

        return  mergedArray;
    }

}
