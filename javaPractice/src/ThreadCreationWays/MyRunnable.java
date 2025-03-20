package ThreadCreationWays;

//implementing runnable interface
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread runnung using Runnable interface ");
    }

    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t1 = new Thread(m);
        t1.start();
    }
}
