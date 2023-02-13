/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LowLevelDataTransfer;


import java.util.List;

public class Data {
    private String packet;
     
    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;
  
    public synchronized void send(String packet) {
        while (!transfer) {
            try { 
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                e.printStackTrace();
            }
        }
        transfer = false;
         
        this.packet = packet;
        notifyAll();
    }
  
    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                e.printStackTrace(); 
            }
        }
        transfer = true;
 
        notifyAll();

        return packet;
    }
}
