package java8;


import java.util.*;
import java.util.stream.Collectors;

public class W3School {
    public static void main(String[] args) {

        //1. Write a Java program to calculate the average of a list of integers using streams.
        List<Integer> nums = Arrays.asList(2, 4, 5, 6, 4,6,2, 7, 8, 9);
        Double avg = nums.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("Average of integers " + avg);

        //2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
        List<String> strings = Arrays.asList("ram", "ujt", "irt", "iyt", "poi", "wer");
        List<String> upperStrs = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperStrs);

        //3. Write a Java program to count the number of strings in a list that start with a specific letter using streams(Starts with i)
        List<String> strWithi = strings.stream().filter(x -> x.startsWith("i")).collect(Collectors.toList());
        System.out.println(strWithi);

        //4. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> strAscOrder = strings.stream().sorted().collect(Collectors.toList());
        System.out.println(strAscOrder);
        List<String> strDscOrder = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(strDscOrder);

        //5. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

        int evenSum = nums.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(evenSum);
        int oddSum = nums.stream().filter(x -> x % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println(oddSum);

        //6. Write a Java program to remove all duplicate elements from a list using streams
        List<Integer> uniqueNumbr = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbr);

       //7. Write a Java program to print  all duplicate elements from a list using streams
        List<Integer> uniqueNumbrUsingFreq = nums.stream().filter(x -> Collections.frequency(nums, x) > 1).distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbrUsingFreq);

        //8.Write a Java program to find the maximum and minimum values in a list of integers using streams.
        Integer maxValue = nums.stream().max(Integer::compare).orElse(null);
        System.out.println("min = "+nums.stream().sorted().findFirst().get());
        System.out.println(maxValue);
        Integer minValue = nums.stream().min(Integer::compare).orElse(null);
       System.out.println("mAX = "+nums.stream().sorted(Comparator.reverseOrder()).findFirst().get());
        System.out.println(minValue);

        //9.Write a Java program to find the second smallest and largest elements in a list of integers using streams.

        Integer secondMin = nums.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        System.out.println(secondMin);
        Integer secondMax=nums.stream().distinct().sorted((a,b)->Integer.compare(b,a)).skip(1).findFirst().orElse(null);
        System.out.println(secondMax);

        //Get count, min, max, sum, and the average for numbers

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
        System.out.println(stats);
    }
}
