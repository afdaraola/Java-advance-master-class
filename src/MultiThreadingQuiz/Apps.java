package MultiThreadingQuiz;

import LowLevelProducerConsumer_9.Processor;

public class Apps {
    public static void main(String[] args) throws InterruptedException {
        final Processors processors = new Processors();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processors.produces();
                } catch (InterruptedException ignored) {}
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processors.consumes();
                } catch (InterruptedException ignored) {}
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // Pause for 30 seconds and force quitting the app (because we're
        // looping infinitely)
        Thread.sleep(30000);
        System.exit(0);
    }
}
