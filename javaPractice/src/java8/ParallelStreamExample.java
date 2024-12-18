package java8;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        System.out.println("Processing using sequential stream:");
        names.stream()
                .forEach(name -> System.out.println(Thread.currentThread().getName() + " - " + name));

        System.out.println("\nProcessing using parallel stream:");
        names.parallelStream()
                .forEach(name -> System.out.println(Thread.currentThread().getName() + " - " + name));
    }
}
