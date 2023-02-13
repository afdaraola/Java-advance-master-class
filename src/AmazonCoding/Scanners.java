package AmazonCoding;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {

//        Scanner myObj  = new Scanner(System.in);
//
//
//        System.out.println("enter your name : ");
//        String name  =   myObj.nextLine();
//        System.out.println(name);
//
//        System.out.println("enter your age : ");
//        int age  =   myObj.nextInt();
//
//        System.out.println(age);

        createFile();
        System.out.println("===============================");
        FileWrite();
        System.out.println("============================");
        ReadFile();
        System.out.println("===============================");
        GetFileInfo();
        System.out.println("===============================");
        DeleteFile();

    }


    public static void createFile() {

        try {
            File file = new File("FirstText.txt");

            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File Already  Exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void FileWrite() {
        try {
            FileWriter fileWriter = new FileWriter("FirstText.txt");
            fileWriter.write("Write to file  is  fun but  very trick   \n ");
            fileWriter.append("End of  the  file ");
            fileWriter.close();
            System.out.println("Write to file is successful");
        } catch (Exception e) {
            System.out.println("IOException error Occur");
            e.printStackTrace();
        }
    }


    public static void ReadFile() {
        try {
            File myObj = new File("FirstText.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {

            System.out.println("Error Occur ");
            e.printStackTrace();
        }
    }

    public static void GetFileInfo(){
        try{
            File file = new File("FirstText.txt");
            if(file.exists()){
                System.out.println("Absolute  Path : " + file.getAbsolutePath());
                System.out.println("File exists :  " + file.exists());
                System.out.println("Readable : " + file.canRead());
                System.out.println("Writeable : " + file.canWrite());
                System.out.println("path : " + file.getPath());
                System.out.println("file Name  :  " + file.getName());
                System.out.println("The size  of the file: "+ file.length());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void DeleteFile(){
        try{
            File file = new File("FirstText.txt");
            if(file.delete()){
                System.out.println("file  deleted successfully: " + file.getName());
            }else{
                System.out.println("Failed  to delete");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
