package interviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


//find how many times this value appear
public class TIAAQuestion {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 1, 3, 2, 2, 3,4,6,6,5};
        Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);

        Map<Integer, Integer> map = new HashMap<>();
        for (int num:arr) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
        System.out.println(map);

    }

}
