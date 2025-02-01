package completableFutureExample;

import java.util.concurrent.CompletableFuture;

public class AsyncExample {
    public static void main(String[] args) {

        // Task 1: Simulate a task that takes time (like downloading a file)
        CompletableFuture<String> fileDownload = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);  // Simulate download time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "File downloaded!";
        });

        // Task 2: While downloading, print a message
        System.out.println("Downloading the file...");

        // When download is done, print the result
        // "File downloaded!"
        fileDownload.thenAccept(System.out::println);

        // Wait for the download to finish before the program ends (this is blocking, for demo purpose)
        fileDownload.join();
    }
}
