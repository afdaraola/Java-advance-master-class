package JavaProgrammingMasterClass;

public class MinutesToYearAndDays {
    public static void main(String[] args) {
        printYearAndDays(560000);
        printYearAndDays(1051200);
    }

    public static void printYearAndDays( long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        long hours = minutes/60;
        long days = hours/24;
        long years = days/365;
        long remainingDay = days%365;
        System.out.println(minutes +" minn = "+years+ " y and "+ remainingDay+" d");
    }

}
