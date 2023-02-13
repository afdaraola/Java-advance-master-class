package Quiz;

import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MethodReference {

    List<Integer> number = Arrays.asList(2, 3, 4, 5);
    int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);


    int Sum;

    public void run() {
        synchronized (this) {
            int i = 0;
            while (i < 100000) {
                Sum += i;
                i++;
            }
            notify();
        }
    }


    public String reverse(String input) {

        if (input == null) {
            return input;
        }

        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }

        return output;
    }

    public String StringConcate() {

        String newLine = System.getProperty("line.separator");

//            return  "This is String ".concat(newLine).concat("OR").concat(newLine).concat("it is not string");
        return String.join(newLine, "This is testing firstline", "Second Line", "ThirdLine", "--- Finaly line");
    }

    public String ReadFile() throws IOException {

        return new String(Files.readAllBytes(Paths.get("Users/festusdaramola/Documents/textt.txt")));
    }




    public void initializeElements(int[][] multiDimensionArr) {
//        Scanner scanner = new Scanner(System.in);

        for (int outer = 0; outer < multiDimensionArr.length ; outer++) {

            System.out.println(Arrays.toString(multiDimensionArr[outer]));

//            for (int inner = 0; inner < multiDimensionArr[outer].length; inner++) {
//                multiDimensionArr[outer][inner] = scanner.nextInt();
            }
        }


    public void givenUsingCoreJava_whenMapValuesConvertedToArray_thenCorrect() {
        Map<Integer, String> sourceMap = createMap();

        Collection<String> values = sourceMap.values();
        String[] targetArray = values.toArray(new String[values.size()]);
    }



    private static Map<Integer, String> createMap() {

        return null;
    }



    public static void main(String[] args) {

        MethodReference thr = new MethodReference();
//        synchronized (thr) {
//            while (thr.Sum == 0) {
//                System.out.println("..waiting for thread B to complete..");
//                try {
//                    thr.wait();
//                } catch (Exception e) {
//
//                }
//
//            }
//            System.out.println("..Thread B has completed.." + "..Sum from that Thread " + thr.Sum);
//
//        }

//        System.out.println(thr.reverse("Festus"));

//       System.out.println(thr.StringConcate());
//        try{
//            System.out.println(thr.ReadFile());
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//     int[][] multiDimensiontest = new int[3][];
//
//        multiDimensiontest[0] = new int[] {1, 2};
//        multiDimensiontest[1] = new int[] {3, 4, 5};
//        multiDimensiontest[2] = new int[] {6, 7, 8, 9};
//
//        thr.initializeElements(multiDimensiontest);






    }


}