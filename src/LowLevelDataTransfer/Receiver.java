/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LowLevelDataTransfer;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author pearlsoft
 */
public class Receiver implements Runnable {
    private Data load;
  
    // standard constructors
  
    public Receiver() {
    }

    public Receiver(Data load) {
        this.load = load;
    }

    public void run() {
        //load.receive();
//       for(int i = 0; i < 1000000; i++){
    for(String receivedMessage = load.receive();

        !"Account 1000000".equals(receivedMessage);
         receivedMessage = load.receive()) {
        System.out.println("Inserting ");
        System.out.println(receivedMessage);
//

//
//            System.out.println(receivedMessage);
//
            // ...
//            try {
//                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//                e.printStackTrace();
//            }
        }
    }
}