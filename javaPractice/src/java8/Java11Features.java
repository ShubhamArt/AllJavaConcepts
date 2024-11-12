package java8;

import java.util.List;

import static java.nio.file.Files.lines;

public class Java11Features {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Using var in lambda parameter
        names.forEach((var name) -> {
            System.out.println(name);
        });


    }
}
