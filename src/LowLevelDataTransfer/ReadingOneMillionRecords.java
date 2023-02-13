package LowLevelDataTransfer;

import java.util.ArrayList;
import java.util.List;

public class ReadingOneMillionRecords {



    static   List<String> Reading () {
        List<String> packets = new ArrayList<>();

        for (int i = 0; i <= 1000000; i++) {

            packets.add("Account " + i);
        }
        return  packets;
    }

    static void Inserting (List<String> packets){

        for (String packet : packets) {
            System.out.println("Inserting " + packet  + "  Into table B");

        }

    }


    public static void main(String[] args) {
        System.out.println("Stating .....");

        long st = System.currentTimeMillis();
        System.out.printf("start time : "+st);

        List<String> newAccount =  Reading();
        Inserting(newAccount);

        long ends = System.currentTimeMillis();
        System.out.printf("end time: " + ends +"\n" );

        System.out.printf("Time taken: " + (ends - st) );
    }
}
