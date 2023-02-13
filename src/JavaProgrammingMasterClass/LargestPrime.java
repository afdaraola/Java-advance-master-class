package JavaProgrammingMasterClass;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
    }
    public static int getLargestPrime(int number){
        if(number < 0){
            return -1;
        }

        int i= 2;
        for (; i <= number; i++) {
            if (number % i == 0) {
                number/= i;
                //  break;
            }
        }
        System.out.println(i);
        int prime = (i-1);
        return prime;
    }
}
