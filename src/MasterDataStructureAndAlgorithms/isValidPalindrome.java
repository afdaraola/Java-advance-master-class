package MasterDataStructureAndAlgorithms;

public class isValidPalindrome {

    public static void main(String[] args) {

        String Input = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(Input));
    }
    public static boolean isPalindrome(String S){

        String fixedString = "";

        for(char c : S.toCharArray()){
            if(Character.isDigit(c)||Character.isLetter(c)){
                fixedString+=c;
            }
        }

            fixedString = fixedString.toLowerCase();

        System.out.println(fixedString);

        int a_pointer = 0;
        int b_pointer = fixedString.length()-1;

        while(a_pointer<=b_pointer){

            System.out.println("a_pointer "+ fixedString.charAt(a_pointer));
            System.out.println("b_pointer "+ fixedString.charAt(b_pointer));

            if(fixedString.charAt(a_pointer)!= fixedString.charAt(b_pointer)){
                return false;
            }

            a_pointer++;
            b_pointer--;
        }

        return true;
    }
}
