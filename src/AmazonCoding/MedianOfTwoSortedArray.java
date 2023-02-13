package AmazonCoding;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {

        int[] num1 = {1,2};
        int[] num2 ={3,4};

        System.out.println(MedianOf2Sorted(num1,num2));
    }

    public static double  MedianOf2Sorted(int[] num1, int[] num2){

        int m = num1.length;
        int n  = num2.length;
        int[] result = new int[m+n];

        int i=0; int j=0; int k =0;

        while (i<=m-1 && j <=n-1){
            if(num1[i] <= num2[j]){
                result[k] = num1[i];
                i++;
                k++;
            } else{
                result[k] =num2[j];
                j++;
                k++;
            }
        }

        while(i<=m-1){
            result[k] = num1[i];
            i++;
            k++;

        }

        while(j<=n-1){
            result[k] = num2[j];
            j++;
            k++;
        }

        for (int s =0; s < result.length; s++){
            System.out.println(result[s]);
        }

        double median  = 0;

            if(k%2!=0){
                median = result[(k-1)/2];
            } else {
            median = (result[k/2]+result[(k/2)-1])/2.0;
            }


      /* int first = num1.length;
       int sec = num2.length;

       int[] mergeArray = new int [first+sec];

        System.arraycopy(num1, 0, mergeArray, 0,first);
        System.arraycopy(num2,0,mergeArray,first,sec);

        int len = mergeArray.length;
        int num = len/2;

        double mid=0.0;

        int a;
        int b;

        if(len%2==0){
              a = mergeArray[num-1];
              b = mergeArray[num];

            mid = (a+b)/2.0;
        }else{

            mid = mergeArray[num];
        }
        return mid;

       */
        return median;
    }

}
