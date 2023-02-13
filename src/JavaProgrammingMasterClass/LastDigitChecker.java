package JavaProgrammingMasterClass;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(1,1,2));
    }

    public static boolean hasSameLastDigit(int first, int second, int third){

        if ((!isValid(first)) ||  (!isValid(second)) ||   (!isValid(third)) ){
            return false;
        }



        int lastFirst = first%10;
        int lastSecond = second%10;
        int lastThird = third%10;

        if (lastFirst == lastSecond || lastFirst == lastThird || lastSecond ==  lastFirst || lastSecond == lastThird)  {
            return true;
        }else{
            return false;
        }
    }

    public static boolean isValid(int num){

        if (num < 10 ||num > 1000){
            return false;
        }else {
            System.out.println(num);
            return true;
        }
    }
}
