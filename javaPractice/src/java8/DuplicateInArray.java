package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateInArray {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 5, 5, 6, 6, 5);
        int[] arr={1, 2, 3, 5, 5, 6, 6, 5};
        List<Integer> ans = list.stream().filter(n -> Collections.frequency(list, n) > 1).distinct().toList();
        System.out.println("Duplicate Using Frequency " + ans);

        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream().
                filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> duplicateElement = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println("Duplicate using grouping by "+duplicateElement);
    }
}
