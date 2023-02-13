package JavaProgrammingMasterClass;

public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(20.2334, 3.2344));

    }
    public static boolean areEqualByThreeDecimalPlaces(double firstParameter, double secondParameter){



       String Deciplace = Double.toString(secondParameter).substring(Double.toString(secondParameter).indexOf('.')+1,Double.toString(secondParameter).length());


     String Decimaltwo = Double.toString(firstParameter).substring(Double.toString(firstParameter).indexOf('.')+1,Double.toString(firstParameter).length());

      if (  Deciplace.substring(0,3).equalsIgnoreCase(Decimaltwo.substring(0,3))){
          return  true;
      }else{
          return  false;
      }

     }

    }



