package MultithreadingConcepts.joinYeild;

public class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " is running. Iteration: " + i);
            try {
                Thread.sleep(500);  // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Yield to allow other threads to execute
            Thread.yield();
        }
    }
}
