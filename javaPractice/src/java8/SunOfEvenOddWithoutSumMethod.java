package java8;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SunOfEvenOddWithoutSumMethod {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().toList();

        // Sum of even numbers
        int evenSum = numbers.stream()
                .filter(n -> n % 2 == 0)  // Filter even numbers
                .reduce(0, (a, b) -> a + b);  // Accumulate sum without using sum()

        // Sum of odd numbers
        int oddSum = numbers.stream()
                .filter(n -> n % 2 != 0)  // Filter odd numbers
                .reduce(0, (a, b) -> a + b);  // Accumulate sum without using sum()

        // Print the results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
