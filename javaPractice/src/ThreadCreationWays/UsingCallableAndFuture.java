package ThreadCreationWays;

import java.util.concurrent.*;
//if we want thread returns a result create thread by callable and future
public class UsingCallableAndFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> "Thread running using Callable ";
        Future<String> future = executor.submit(task);
        System.out.println(future.get());
        executor.shutdown();

    }
}
