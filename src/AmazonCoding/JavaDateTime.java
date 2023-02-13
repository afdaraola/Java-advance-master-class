package AmazonCoding;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateTime {
    public static void main(String[] args) {

        System.out.println("==============");
        String dateString="ENG";
      //  System.out.println(findDay(3,21,2021));
       // System.out.println();
        try{
           // String  dob =   findDay(dateString);
            String form = formatDate(dateString);
         //   System.out.println(dob);
            System.out.println(form);
        }catch (Exception  e){
            e.printStackTrace();
        }
        System.out.println("==============");



    }


    public static String findDay(String dateString) throws ParseException {

//    ParseException    Calendar c =  Calendar.getInstance();
//        c.set(Calendar.MONTH,month-1);
//        c.set(Calendar.DAY_OF_MONTH, day);
//        c.set(Calendar.YEAR,year);
//
//        String dayOfWeek = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
//        return dayOfWeek;


        System.out.println(" dateString ++++ "+dateString);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(dateString);
        df = new SimpleDateFormat("dd-MMM-yyyy");

        System.out.println("Formated Date:"+df.format(date));

        return df.format(date);
    }


//     logger.info(" dateString ++++ " + dateString);
//    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//
//    Date date = df.parse(dateString);
//
//    df = new SimpleDateFormat("dd-MMM-yyyy");
//
//        logger.info("Formated Date:" + df.format(date));
//
//        return df.format(date);


    public static String formatDate(String dateString) throws Exception {

        String l_day, l_mon, l_year ,formatOutPut, ouput ;
        String concat = "-";
        ouput = dateString.substring(1,3);
        System.out.println(ouput);

//        l_year = dateString.substring(0,4);
//        System.out.println(l_year);
//        l_mon = dateString.substring(5,7);
//        System.out.println(l_mon);
//        l_day = dateString.substring(8,10);
//        System.out.println(l_day);
//
//        if ( Integer.parseInt(l_mon) > 12){
//            formatOutPut =  l_year+concat+l_day+concat+l_mon;
//
//        }else {
//            formatOutPut =  dateString;
//
//        }



        return ouput;
    }

}
