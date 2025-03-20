package ThreadCreationWays;

//using anonymous class
public class AnonymousClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running using anonymous class");
            }
        });
        t1.start();
    }
}
