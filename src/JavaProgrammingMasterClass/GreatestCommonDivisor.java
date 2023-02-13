package JavaProgrammingMasterClass;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10,15));
    }

    public static int getGreatestCommonDivisor(int a , int b){
        if (a < 10 || b < 10){
            return -1;
        }
        int largestdivisor = 1;
        for ( int i = 1 ; i <= a && i <= b; i ++){
            if((a%i ==0) && (b%i==0)){
                largestdivisor = i;
            }
        }

        return largestdivisor;
    }
}
