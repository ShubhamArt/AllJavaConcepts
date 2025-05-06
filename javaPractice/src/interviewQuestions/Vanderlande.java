package interviewQuestions;

import java.util.*;
import java.util.stream.Collectors;
//input (list of string):
//["aa", "bbb", "cc", "d", "ppp"]
//expected output:
//{1=["d"], 2=["aa", "cc"], 3=["bbb", "ppp"]}

public class Vanderlande {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("aa", "bbb", "cc", "d", "ppp");

        Map<Integer, List<String>> result = input.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(result);


        Map<Integer, List<String>> result1 = new HashMap<>();

        for (String str : input) {
            int length = str.length();
            result1.computeIfAbsent(length, k -> new ArrayList<>()).add(str);
        }

        System.out.println(result1);
    }
}
