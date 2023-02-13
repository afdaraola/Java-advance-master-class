package StringPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class StringsText {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first string: ");

        String first = sc.nextLine();

        System.out.println("Input the second string: ");

        String second = sc.nextLine();

//        System.out.println("Input the second string: ");
//
//        int  position = sc.nextInt();
//
//        System.out.println("Input the second string: ");
//
//        int  position1 = sc.nextInt();

        //1. Write a Java program to get the character at the given index within the String.

//        System.out.println("character at index " +position + " is :  "+ first.charAt(position));
//
//        //2. Write a Java program to get the character (Unicode code point) at the given index within the String
//        System.out.println("Unicode code point: "+ first.codePointAt(position));
//
//        //Write a Java program to get the character (Unicode code point) before the specified index within the String.
//        System.out.println("Unicode code point) before the specified index  "+ first.codePointBefore(position));
//
//        //4. Write a Java program to count a number of Unicode code points in the specified text range of a String.
//        System.out.println("count a number of Unicode code points in the specified text: " +  first.codePointCount(position, position1));

        //   System.out.println(checkString("Check first string contains letters from the second string: \n" + first,second));

        //5. Write a Java program to compare two strings lexicographically.
        // Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
//        System.out.println(" lexicographically: "+lexicographically(first, second));
//        System.out.println(" lexicographicallyIgnoreCase : "+lexicographicallyIgnoreCase(first, second));

        //8. Write a Java program to test if a given string contains the specified sequence of char values.
     //   System.out.println("specifiedSequence: "+ specifiedSequence(first,second));

        //12. Write a Java program to check whether a given string ends with the contents of another string.

      //  System.out.println(first.endsWith(second));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }


    public static boolean checkString(String first, String second) {

        if (second.length() > first.length()) {
            return false;
        }

        if (second.isEmpty()) {
            return true;
        }

        for (int i = 0; i < second.length(); i++) {

            if (!first.contains(String.valueOf(second.charAt(i)))) {
                return false;
            }
        }
        return true;
    }


    private static boolean lexicographically(String str, String str2) {

        if (str.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {

            if (!(str.charAt(i) == str2.charAt(i))) {
                return false;
            }


        }

        return true;
    }

    private static boolean lexicographicallyIgnoreCase(String str, String str2) {
        if (str.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {

            if (!(str.toLowerCase().charAt(i) == str2.toLowerCase().charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean specifiedSequence(String str, String str2){
        if(str== null || str2==null){
            return false;
        }

        String newArr[] = str.split(" ");

        for(int i = 0; i < newArr.length; i ++){
            if(str2.equalsIgnoreCase(newArr[i])){
                return true;
            }
        }
        return false;
    }
}