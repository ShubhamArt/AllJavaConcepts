package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TIAAQuestion {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 3};
        Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);


        Map<Integer, Integer> map = new HashMap<>();
        for (int num:arr) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
        System.out.println(map);

    }

}
