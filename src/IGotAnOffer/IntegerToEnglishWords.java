package IGotAnOffer;

public class IntegerToEnglishWords {

    /*
    Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1

     */

    private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public static void main(String[] args) {
        int num = 1234567;
        System.out.println(NumberToWords(num));
    }


    public static String NumberToWords(int num){

        if(num < 0){
         return "Zero";
        }

        int i =  0;
        String words = "";

        while(num>0){
            System.out.println("num%1000 : "+ num%1000 + " i "+ i);

            if(num%1000!=0){
                words  = helper(num %1000) + THOUSANDS[i] + " " + words;
                num/=1000;
                i++;
            }
        }

        return words.trim();
    }

    public static  String helper(int num){

        if(num ==  0){
            return "";
        } else if (num < 20){
            return LESS_THAN_20[num] + " ";
        }else if(num < 100){
            return TENS[num/10] + " " + helper(num%10) ;
        } else {
            return LESS_THAN_20[num/100] +" Hundred "+ helper(num%100);
        }

    }
}
