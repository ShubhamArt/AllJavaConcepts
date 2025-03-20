package ThreadCreationWays;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutorService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> System.out.println("Thread running by executor service"));
        executor.shutdown();
    }
}
