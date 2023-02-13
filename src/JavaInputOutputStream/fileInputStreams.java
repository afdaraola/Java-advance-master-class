package JavaInputOutputStream;

import java.io.FileInputStream;
import java.io.InputStream;


public class fileInputStreams {
    public static void main(String[] args) {

        byte[] array = new byte[100];

        try {

            InputStream input = new FileInputStream("/Users/festusdaramola/Downloads/AdvanceJava-master/src/input.txt");


            System.out.println("check file available " + input.available());

            input.read(array);

            System.out.println("Read Data from the Stream");

            String data = new String(array);

            System.out.println(data);

            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


}
