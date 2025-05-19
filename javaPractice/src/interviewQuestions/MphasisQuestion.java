package interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MphasisQuestion {
    public static void main(String[] args) {
        String input = "shubham shete";
        //output should be SHETE shubham

        String result= Arrays.stream(input.split(" "))
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return IntStream.range(0, list.size())
                            .mapToObj(i -> i == 0 ? list.get(i).toUpperCase() : list.get(i).toLowerCase())
                            .collect(Collectors.joining(" "));
                }));
        System.out.println(result);
    }
}
