package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MissingInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12};
        int n = numbers[numbers.length - 1];
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(numbers).sum();
        int missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);

        //find the occurance of each character in string
        String str= "ilovejavatechie";
        String[] resultStr= str.split("");
        System.out.println(Arrays.toString(resultStr));
        Map<String, Long> eachChar = Arrays.stream(resultStr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(eachChar);

        List<String> collect = Arrays.stream(resultStr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

    }
}
