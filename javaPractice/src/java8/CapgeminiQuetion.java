package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CapgeminiQuetion {
    public static void main(String[] args) {
        String[] strItems = {"apple", "apple", "banana","apple", "orange", "banana", "papaya"};

        System.out.println(Arrays.stream(strItems).filter(i->Collections.frequency(List.of(strItems),i)>1).distinct().collect(Collectors.toList()));

        List<String> items = Arrays.asList("apple", "apple", "banana","apple", "orange", "banana", "papaya");



        //find duplicate strings
        List<String> duplicateItems = items.stream().filter(x-> Collections.frequency(items,x)>1).distinct().collect(Collectors.toList());
        System.out.println(duplicateItems);
        //count the number of times each fruit appears in the list
        Map<String, Long> map = items.stream().collect(Collectors.groupingBy(fruit -> fruit, Collectors.counting()));
        System.out.println(map);
        //collect the unique fruits into a Set
        Set<String> collect = items.stream().collect(Collectors.toSet());
        System.out.println(collect);
        //convert all in upper case
        List<String> upperItems = items.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperItems);

        //find string whose length is more than 5
        List<String> lengthYitem = items.stream().filter(x -> x.length() > 5).distinct().collect(Collectors.toList());
        System.out.println(lengthYitem);



        //filter the list to only include fruits that start with the letter "a"?
        List<String> startsByA = items.stream().filter(x -> x.toLowerCase().startsWith("a")).collect(Collectors.toList());
        System.out.println(items.stream().filter(x -> x.length() > 0 && x.substring(0, 1).equalsIgnoreCase("a"))  // Case-insensitive check on first character
                .collect(Collectors.toList()));
        System.out.println(startsByA);

        //sort the list of fruits alphabetically
        List<String> sortedItems = items.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedItems);

        //sort the list of fruits alphabetically in reverse order
        List<String> reverseOrder = items.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrder);

        //find the first fruit in the list that contains the letter "p"
        Optional<String> firstFruitWithP  = items.stream().filter(x -> x.contains("p")).findFirst();
        firstFruitWithP.ifPresent(System.out::println);

       //join all the fruits into a single string, separated by commas
        //String collect1 = String.join(",", items);
        String collect1 = items.stream().collect(Collectors.joining(","));
        System.out.println(collect1);

        //create a list of lengths of each fruit name
        List<Integer> collect2 = items.stream().map(String::length).collect(Collectors.toList());
        System.out.println(collect2);

        //find the longest fruit name in the list
        //Optional<String> longestFruit = items.stream().max((fruit1, fruit2) -> Integer.compare(fruit1.length(), fruit2.length()));
        String s = items.stream().max(Comparator.comparing(String::length)).get();
        System.out.println("longest fruit name in the list :"+s);

        //check if the list contains any fruit that starts with "b"
        boolean containsFruitB = items.stream().anyMatch(f -> f.startsWith("b"));
        System.out.println(containsFruitB);

        //extract unique fruits and sort them in descending order
        List<String> distinct = items.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
        System.out.println(distinct);

        //count the total number of fruits in the list, including duplicates
        long count = items.size();
        System.out.println(count);

    }
}
