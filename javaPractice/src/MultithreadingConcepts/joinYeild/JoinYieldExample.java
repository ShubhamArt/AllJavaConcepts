package MultithreadingConcepts.joinYeild;

public class JoinYieldExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        thread1.start();
        thread2.start();
        try {
            // Wait for thread1 to finish before continuing the main thread
            thread1.join();
            System.out.println("Thread 1 has finished, now Main thread continues.");

            // Wait for thread2 to finish before the main thread ends
            thread2.join();
            System.out.println("Thread 2 has finished, now Main thread ends.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
