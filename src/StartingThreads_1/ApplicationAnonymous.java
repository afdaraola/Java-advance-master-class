package StartingThreads_1;

/**
 * Starting threads using the Thread constructor with anonymous classes
 */
public class ApplicationAnonymous {

    private static void increment() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        });

        //Thread thread1 = new Thread(() -> increment());
        thread1.start();
    }

}
