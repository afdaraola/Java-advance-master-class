package JavaProgrammingMasterClass;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(isOdd(24));
        System.out.println(sumOdd(10,5));
    }
    public static boolean isOdd(int number){
        if (number < 0 ){
            return false;
        }
        if (number % 2 != 0){
            return true;
        }else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        if (start < 0|| end < 0 || (end < start )){
            return -1;
        }
        int sum = 0;
        for (int i = start; i <=end; i++){
            if(isOdd(i)){
                sum +=i;
            }
        }
        return sum;
    }
}
