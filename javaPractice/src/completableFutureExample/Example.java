package completableFutureExample;

import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 42;
        });
        // Once the task completes, we chain another task to process the result
        future.thenApply(result -> {
            System.out.println("Result: " + result);
            return result * 2;
        }).thenAccept(result->{
            System.out.println("Modified result :"+result);
        });
        // Block the main thread until all tasks are complete
        future.join();
    }
}
