package java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductOfList {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 5) // Example range from 1 to 5
                .boxed()
                .toList();

        // Calculate the product using reduce
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);  // Multiply elements, starting with initial value 1

        // Print the result
        System.out.println("Product of the list: " + product);
    }
}
