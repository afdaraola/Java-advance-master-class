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
public class ThreadDemo implements Runnable  {  	
private int x=0;  	
private int y=0;  	
 public static void main(String [] args) 	{
 		ThreadDemo obj = new ThreadDemo(); 		
                (new Thread(obj)).start(); /*Line 8*/ 		
 } 	
 public synchronized void run () /*Line 11*/ 	{
 	  for (int i=0;i<10;i++) /*Line 13*/ { 		  
        x++; 		  
        y++; 		 
        System.out.println("x = " +x+" ; y = "+y); 		
     } 	
 } 
}

