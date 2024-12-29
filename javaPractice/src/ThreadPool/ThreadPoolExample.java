package ThreadPool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with 2 core threads, a maximum of 4 threads,
        // and a 60-second timeout for idle threads.
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Submit 5 tasks (Runnable) to the thread pool
        for (int i = 0; i < 5; i++) {
            Runnable task = () -> {
                try {
                    System.out.println("Executing task by " + Thread.currentThread().getName());
                    Thread.sleep(2000); // Simulate some work with sleep
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            executor.submit(task); // Submit the task to the executor
        }

        // Gracefully shutdown the executor after all tasks are completed
        executor.shutdown();
    }
}
