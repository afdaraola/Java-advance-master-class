package JavaProgrammingMasterClass;

public class NumberToWords {

    private static final String[] units = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine"
    };

    public static void numberToWords(int number){
        if(number < 0 ){
            System.out.println("Invalid Value");
        }

    }

    public static int reverse(int number){

        int remainder;
        int reversed = 0;
        while(number >0){
            remainder = number%10;
            reversed = reversed * 10 + remainder;
            number/= 10;
        }

        return number;
    }

    public static int getDigiCount(int number){
        if(number < 0){
            return -1;
        }

        int count = 0;

        while(number>0){
            number = number/10;

            count += 1;
        }
return count;
    }


}
