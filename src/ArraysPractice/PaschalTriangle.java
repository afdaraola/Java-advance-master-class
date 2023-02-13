package ArraysPractice;

import java.util.ArrayList;

public class PaschalTriangle {
    public static void main(String[] args) {
      //  System.out.println(nthNumberPaschalTriangle(4));


        int[] arr = {1,2};
//        int[] arrs = rotate(arr);
//
//        for(int i =0; i < arrs.length; i++){
//            System.out.println(arrs[i]);
//        }


        int d = 3;
        int n = arr.length;

        int p = 1;

        while (p <= d) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            p++;
        }

         for (int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");
         }



     //   System.out.println(ugly(14));
    }

    public static ArrayList<Long> nthNumberPaschalTriangle(int n){

        long[][] arr = new long[n][n];

        for(int i =0; i <  n ; i++){
            arr[i][0] = 1;
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                arr[i][j]=(arr[i-1][j] + arr[i-1][j-1])/1000007;
            }
        }
       ArrayList<Long> list = new ArrayList<>();
        for(int i = n-1; i < n ; i++){
            for (int j = 0; j < n; j++){
                list.add(arr[i][j]);
            }
        }
return  list;
    }

    public static void paschalTriangle(int n){
        ArrayList<Long> longArrayList = new ArrayList<>();
        int[][] paschal  = new int[n][n];
        int row, col;
        for(row = 0; row < n;row++){
            for(col=0;col<n;col++){
                paschal[row][col]=0;
            }
        }
        paschal[0][0]=1;
        paschal[1][0]=1;
        paschal[1][1]=1;

        for(row =2; row < n; row++){
            paschal[row][0]=1;
            for(col=1; col <=row; col++){
                paschal[row][col]=paschal[row-1][col-1]+paschal[row-1][col];
            }
        }

        for(int i =0; i < n; i++){
            for(int j=0; j<=i;j++){
                System.out.print(paschal[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static ArrayList<Long> paschalTriangleRt(int n){
        ArrayList<Long> longArrayList = new ArrayList<>();
        int[][] paschal  = new int[n][n];
        int row, col;
        for(row = 0; row < n;row++){
            for(col=0;col<n;col++){
                paschal[row][col]=0;
            }
        }
        paschal[0][0]=1;
        paschal[1][0]=1;
        paschal[1][1]=1;

        for(row =2; row < n; row++){
            paschal[row][0]=1;
            for(col=1; col <=row; col++){
                paschal[row][col]=paschal[row-1][col-1]+paschal[row-1][col];
            }
        }

        for(int i =0; i < n; i++){
            for(int j=0; j<=i;j++){
                longArrayList.add((long)paschal[i][j] );
            }
            System.out.println("\n");
        }
     return longArrayList;
    }



    public static int[] rotate(int[] arr) {

        // Enter your code here
        int k = 3;

        if(k==0 || k%arr.length==0)
            return arr;
        k = k%arr.length;
        for(int i = 0 ; i<k ; i++) {
            int firstele = arr[0];
            for(int j = 0 ; j < arr.length - 1 ; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = firstele;
        }



        /* You do not need to worry about the return statement for the
        moment and just set the values in “arr” correctly*/
        return arr;
    }


    public static boolean checkPass(char[] password) {
        boolean isValid = true;
        int digit=0;

        if(password.length <8) {
            isValid = false;
        }
        else {
            for (int i = 0; i < password.length; i++) {
                if (!Character.isLetterOrDigit(password[i])) {
                    isValid = false;
                    break;
                }
                else if(Character.isDigit(password[i])) {
                    digit++;
                    if(digit==2) {
                        break;
                    }
                }
            }
            if (digit != 2) {
                isValid =false;
            }
        }
        if(isValid){
            return isValid;
        }
        return isValid;
    }

    public static boolean ugly(int n){

        if(n < 1){
            return false;
        }

        while(n!=1){
            if(n%2==0){
                n/=2;
            }else if (n%3==0){
                n/=3;
            }else if(n%5==0){
                n/=5;
            } else {
                return false;
            }
        }


        return true;
    }
}
