/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartingThreads_1;

import java.util.logging.Level;
import java.util.logging.Logger;


class RunnerA extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<100;++i){
			System.out.println("RunnerA: "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class RunnerB extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<100;++i){
			System.out.println("RunnerB: "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class thread2 {

	public static void main(String[] args) {
		
//		Thread t1 = new Thread(new Runner1());
//		Thread t2 = new Thread(new Runner2());
		
		RunnerA t1 = new RunnerA();
		RunnerB t2 = new RunnerB();
		
		t1.start();
		t2.start();
                
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
                System.out.println("All task has been completed");
	}
}
