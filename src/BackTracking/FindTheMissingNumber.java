package BackTracking;

public class FindTheMissingNumber {

    public static void main(String[] args) {
     int   N = 5;
    int    A[] = {1,2,2,3,5,5};
        findTheMissingNumberDuplicate(A,N);
    }

  public static int  findTheMissingNumber(int array[], int n) {
      // Your Code Here
      int sum =0;

      int summation = n * (n+1)/2;

      for(int i = 0; i < array.length; i ++){
          sum+=array[i];
      }
      return summation-sum;

  }


  public static void findTheMissingNumberDuplicate(int[] arr , int  n){

        int []  register = new int[arr.length];

        for(int inter : arr){
            register[inter] = 1;
        }

        for(int i = 1; i  < register.length;i++){
            if(register[i] == 0){
                System.out.println(i);
            }
        }
  }
}
