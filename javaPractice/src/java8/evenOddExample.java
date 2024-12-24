package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class evenOddExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));


        Map<Boolean, List<Integer>> grouped = numbers.stream().collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println("Even numbers: " + grouped.get(true));
        System.out.println("Odd numbers: " + grouped.get(false));
    }
}
