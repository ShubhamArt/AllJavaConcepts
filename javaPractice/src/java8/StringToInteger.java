package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToInteger {
    public static void main(String[] args) {
        //program to convert string to ineteger
        String str = "12345";
        //without java API
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result = result * 10 +( str.charAt(i) - '0');        //substracting ASCI Value of 0
        }
        System.out.println("Without Stream API "+result);

        int number = Stream.of(str)
                .mapToInt(Integer::parseInt)
                .findFirst()
                .orElseThrow(NumberFormatException::new);

        System.out.println("Using Stream API "+number);

        //find the firat occurance of character in string

        String str1="Hello world";
        boolean first = str1.chars().filter(c -> c == 'w').findFirst().isPresent();
        System.out.println("count = "+Stream.of(str1).filter(c->c.contains("w")).count());
        System.out.println(first);
    }
}

