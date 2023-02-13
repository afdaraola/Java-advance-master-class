package MultiThreadingQuiz;

import java.util.LinkedList;
import java.util.Random;

public class Processors {

    private LinkedList<Integer> list = new LinkedList<>();

    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produces() throws InterruptedException {
//        int value = 0;
        while (true) {
            synchronized (lock) {
                //whenever the thread is notified starts again from the loop
                while (list.size() == LIMIT) {
                    lock.wait();// wait() is also true
                }

                for (int i=0; i< 1000; i++) {
//                    System.out.println((i));
                    list.add(i);
                }


                System.out.println("Producers added: " + list);
                lock.notify();
            }
        }
    }


    public void consumes() throws InterruptedException {
        Random random = new Random();
        while (true) {
            synchronized (lock) {
                while (list.size() == 0) {
                    lock.wait();
                }

                int value = list.removeFirst();
                System.out.print("Removed value by consumers is: " + value);
                System.out.println(" Now list size is: " + list.size());
                lock.notify();
            }
            Thread.sleep(random.nextInt(1000)); //force producer fill the queue to LIMIT_SIZE
        }
    }
}
