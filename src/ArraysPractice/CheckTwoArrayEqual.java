package ArraysPractice;

import java.util.Arrays;

public class CheckTwoArrayEqual {
    public static void main(String[] args) {
        int  N = 5;
      int   A[] = {1,2,5,4,0};
      int   B[] = {2,4,5,0,1};

    }
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        if(A.length != B.length){
            return false;
        }

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i =0; i < N; i++){
            if(A[i]!=B[i]){
                return false;
            }
        }
        return true;
    }
}
