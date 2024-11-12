package synchronizationAndLockconcept;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairNessLockExample {
    private Lock unfairLock = new ReentrantLock(true);

    public void accessResource() {
        unfairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "Acquired the lock ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            unfairLock.unlock();
            System.out.println(Thread.currentThread().getName() + "Release the lock ");
        }
    }

    public static void main(String[] args) {
        UnfairLockExample example = new UnfairLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
