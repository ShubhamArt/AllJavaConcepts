package java8;

import java.util.stream.IntStream;

public class IntStreamRanegExample {
    public static void main(String[] args) {
        // Generate a stream of integers from 1 to 5 (inclusive)
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);  // Print each number in the range
    }
}
