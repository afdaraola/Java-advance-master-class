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
class Demo extends Thread  {    
    
} 
class Quiz3   { 
  public static void main(String [] args)      {      
      Demo t = new Demo();         
      t.start();         
      System.out.print("one. ");         
      //t.start();         
      //System.out.print("two. ");     
  }   

  
  public void run()      {         
      System.out.print("Thread ");     
  } 
}
