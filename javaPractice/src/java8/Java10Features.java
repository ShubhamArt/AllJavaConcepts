package java8;

import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.lines;

public class Java10Features {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Using var in lambda parameter
        names.forEach((var name) -> {
            System.out.println(name);
        });

        ///var help to provide type safety --This helps reduce boilerplate code by eliminating the need to
        // explicitly specify the type of the variable.
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");

        items.stream()
                .filter((var item) -> item.contains("a"))  // var is inferred as String here
                .forEach(System.out::println);
    }
}
