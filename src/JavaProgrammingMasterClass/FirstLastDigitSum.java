package JavaProgrammingMasterClass;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }


    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int firstDigit ;
        int lastDigit ;
        int divisor;
        int originalNum = number;
        int totalDigit = 0, sum = 0;
        lastDigit = number % 10;

        while(number!=0){
            totalDigit++;
            number/=10;
        }
        System.out.println("total "+totalDigit);

        divisor = (int)Math.pow(10, totalDigit -1);

        System.out.println("divisor "+divisor);

        firstDigit = originalNum/divisor;

        System.out.println("firstDigit " +firstDigit);

        sum = firstDigit + lastDigit;
        return sum;
    }
}
