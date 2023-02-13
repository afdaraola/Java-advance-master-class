/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartingThreads_1;


class Runner1 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<10;++i)
			System.out.println("Runner1: "+i);
	}
}

class Runner2 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<10;++i)
			System.out.println("Runner2: "+i);
	}
}

public class thread1 {

	public static void main(String[] args) {
		
		//Thread t1 = new Thread(new Runner1());
		//Thread t2 = new Thread(new Runner2());
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<1000;++i)
					System.out.println("Runner1: "+i);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<1000;++i)
					System.out.println("Runner2: "+i);
			}
		});
		
		t1.start();
		t2.start();
	}
}
