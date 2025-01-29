package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8Practice {
    public static void main(String[] args) {

        //parallel stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers.parallelStream().collect(Collectors.toList()));
        int sum = numbers.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //intermediate & terminal operations
        Integer reduceSum = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, Integer::sum);
        System.out.println(reduceSum);

        //count the occurance of each character in string
        String s = "ilovejavtatechie";
        String[] resultsString = s.split("");
        System.out.println(Arrays.toString(resultsString));
        Map<String, Long> map = Arrays.stream(resultsString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);



       //find duplicate element from a string
        List<String> duplicateList = Arrays.stream(resultsString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateList);

        //find average of even number
        List<Integer> arr=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        double avg = arr.stream().filter(n -> n % 2 == 0).mapToDouble(n -> n).average().orElseGet(() -> 0.0);
        System.out.println("Average of given number "+avg);

        //find the book  id from a map whose name is "java"
        Map<Integer,String> courseMap=new HashMap<>();
        courseMap.put(1,"java");
        courseMap.put(2,"c++");
        courseMap.put(3,"DSA");

        Set<Integer> courseId = courseMap.entrySet().stream().filter(c -> c.getValue().equalsIgnoreCase("java"))
                .map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println(courseId);


        //find even numbers from a list of integers and multiply with 2

        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> finalList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).collect(Collectors.toList());
        System.out.println(finalList);

        //counting empty string
        List<String> strList=Arrays.asList("abc","","bcd","","defg","hg");
        long count = strList.stream().filter(String::isEmpty).count();
        System.out.println(count);

        //count string whose length is more than 3
        long count1 = strList.stream().filter(x -> x.length() > 3).count();
        System.out.println(count1);

        //count number of string whose starts with A
        long countAstring = strList.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(countAstring);

        //remove all empty string from list
        List<String> collect = strList.stream().filter(x-> !x.isEmpty()).collect(Collectors.toList());
        System.out.println(collect);

        //create list of string with more than 2 character
        System.out.println(strList.stream().filter(x->x.length()>2).collect(Collectors.toList()));

        //convert string with uppercase and join them with comma

        String collect1 = strList.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println(collect1);

        //create a list of the square of all distinct numbers
        List<Integer> numbers1 = Arrays.asList(10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers1.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(distinct);

        //find second-highest numbers

        int[] num={5,9,11,2,8,21,1};
        Integer res = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(res);

       //find numbers starts with 1
        List<Integer> list1 = Arrays.asList(11,2,13,4,36,26);

        System.out.println("Numbers starts with 1 " + list1.stream().filter(n->n.toString().startsWith("1")).toList());


    }
}
