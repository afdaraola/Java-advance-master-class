/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LowLevelDataTransfer;

/**
 * @author pearlsoft
 */
public class App {


    public static void main(String[] args) {
        System.out.println("Starting ...");
        long start = System.currentTimeMillis();

        Data data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread sender2 = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));
        Thread receiver2 = new Thread(new Receiver(data));

        sender.start();
        sender2.start();
        receiver.start();
        receiver2.start();


         try{
             sender.join();
             sender2.join();
             receiver.join();
             receiver.join();
         }catch (Exception ex){
             ex.printStackTrace();
         }

        long end = System.currentTimeMillis();

        System.out.println("Time taken : " + (end - start));

    }
}
