package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35, 40);

        // Predicate to check if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Predicate to check if a number is greater than 20
        Predicate<Integer> isGreaterThan20 = num -> num > 20;

        // Filter numbers using both predicates
        List<Integer> evenNumbers = filterNumbers(numbers, isEven);
        List<Integer> greaterThan20Numbers = filterNumbers(numbers, isGreaterThan20);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Numbers greater than 20: " + greaterThan20Numbers);
    }

    // Method to filter numbers based on a predicate
    public static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> condition) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (condition.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
