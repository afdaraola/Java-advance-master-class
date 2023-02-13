package StartingThreads_1;

public class PrintNumberReverse {

    public static void main(String[] args) {
        Thread t1 = new Thread(new runnerRunables());
        Thread t2 = new Thread(new runnerRunables());
        Thread t3 = new Thread(new runnerRunables());

        t1.start();
        t2.start();
        t3.start();
    }
}


class runnerRunables implements Runnable{

    @Override
    public void run() {
        for( int i=20; i>0;  i -- ){
            System.out.println("Number : "+ i );
        }

        try {
            Thread.sleep(100);
        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}