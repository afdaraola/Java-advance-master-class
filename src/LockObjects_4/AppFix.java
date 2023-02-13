package LockObjects_4;

public class AppFix {
    public static void main(String[] args) {
        System.out.println("Synchronized Methods : ");
        WorkerFix worker = new WorkerFix();
        worker.main();
        System.out.println("Synchronized Objects: ");
        WorkerMethodsSynchronizedFix worker2 = new WorkerMethodsSynchronizedFix();
        worker2.main();
    }
}
