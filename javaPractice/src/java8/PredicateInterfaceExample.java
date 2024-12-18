package java8;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class PredicateInterfaceExample {
    public static void main(String[] args) {
        // List of numbers to be filtered
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Predicate for even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Predicate for odd numbers
        Predicate<Integer> isOdd = num -> num % 2 != 0;

        // Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Filter odd numbers
        List<Integer> oddNumbers = numbers.stream()
                .filter(isOdd)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddNumbers);
    }


}
