/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartingThreads_1;

/**
 *
 * @author pearlsoft
 */
class MyThread extends Thread  {      
   MyThread() {
   }      
   MyThread(Runnable r) { 
     super(r); 
   }      
   public void run()      {          
     System.out.print("Inside Thread ");     
   }  
}  
class RunnableDemo implements Runnable  {      
   public void run()      {          
    System.out.print(" Inside Runnable");      
   }  
}  
class ThreadDemo7  {       
   public static void main(String[] args)      {          
     new MyThread().start();          
     new MyThread(new RunnableDemo()).start();      
   }  
} 
