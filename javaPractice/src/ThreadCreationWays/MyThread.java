package ThreadCreationWays;

//extending Thread class and overriding run method
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running using Thread class");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
