package java8practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIPractice {
    public static void main(String[] args) {
        findallDigitsFromString();
        reverseEachWordInString();
        findLongestWordInString();
        findCountsOFVowels();
        removeSpacesFromString();
        findFirstRepeatingCharacter();
        countOccuranceOfEachCharacter();
        convertFirstCharcacterOfStringTotitleCase();
        extractAllLetterStartingWithVowels();

    }

    private static void extractAllLetterStartingWithVowels() {
        String input = "apple orange banana umbrella";

        // Extract all words starting with a vowel using Stream API
        String result = Arrays.stream(input.split(" "))  // Split the string into words
                .filter(word -> !word.isEmpty() && "AEIOUaeiou".contains(String.valueOf(word.charAt(0))))  // Check if the word starts with a vowel
                .collect(Collectors.joining(", "));  // Join the words back with a comma and space

        // Output the result
        System.out.println(result);
    }

    private static void convertFirstCharcacterOfStringTotitleCase() {
        String input = "hello world, welcome to java!";

        // Convert the string to Title Case
        String result = Arrays.stream(input.split(" "))  // Split the string by spaces
                .map(word ->
                        word.isEmpty() ? word :
                                word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()) // If the word is not empty, we take the first character and convert it to uppercase, then append the rest of the word in lowercase (word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()). If the word is empty (like multiple spaces), it remains unchanged.
                .collect(java.util.stream.Collectors.joining(" "));  // Join words back with a space

        // Output the result
        System.out.println(result);
    }

    private static void countOccuranceOfEachCharacter() {
        //Count occurrences of each character in the String. Input: "banana" Output: b:1, a:3, n:2
        String st = "banana";
        Map<Character, Long> frequencyMap = st.chars()  // Convert the string to an IntStream of characters
                .mapToObj(c -> (char) c)  // Converts the IntStream of ASCII values into a Stream<Character>, where each element in the stream is a character
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));  // Group and count occurrences

        // Print the result
        frequencyMap.forEach((key, value) -> System.out.println(key + ":" + value));
    }

    private static void findFirstRepeatingCharacter() {
        //Find the first repeating character in the String. Input: "abcdabefg" Output: a
        String str ="abcdabefg";
        Optional<Character> result = str.chars()  // Convert the string to an IntStream of characters
                .mapToObj(c -> (char) c)  // Convert int to Character
                .toList()  // Collect to a List
                .stream()  // Create a Stream from the List
                .filter(c -> Collections.frequency(str.chars().mapToObj(c1 -> (char) c1).toList(), c) > 1)
                .findFirst();  // Find the first repeating character

        // If a repeating character is found, print it; otherwise, print "No repeating character"
        System.out.println(result.orElse(null));
    }

    private static void removeSpacesFromString() {
        //Remove all spaces from the String. Input: " Hello World " Output: "HelloWorld"
        String input = " Hello World ";
        //String result = input.replaceAll("\\s+", "");

    }

    private static void findCountsOFVowels() {
        //Find the count of vowels in the String. Input: "Hello, how are you?" Output: 7
        String input = "Hello, how are you?";
        long vowelCount = input.chars() // Convert the string to an IntStream of characters
                .filter(c -> "aeiouAEIOU".contains(String.valueOf((char) c))) // Check if character is a vowel
                .count(); // Count the vowels

        System.out.println(vowelCount);
    }

    private static void findLongestWordInString() {
        //Find the longest word in the String. Input: "I am learning JavaScript and Python" Output: JavaScript
        String str ="I am learning JavaScript and Python";
        String longestWord = Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(""); // In case the string is empty or has no words

        System.out.println(longestWord);
    }

    private static void reverseEachWordInString() {
        //Reverse each word in the String. Input: "Hello World, this is sky" Output: "olleH ,dlroW siht si yks"
        String st="Hello World, this is sky";
        String result = Arrays.stream(st.split(" ")) // Split the string by spaces
                .map(word -> new StringBuilder(word).reverse().toString()) // Reverse each word
                .collect(Collectors.joining(" ")); // Join the words back together

        System.out.println(result);

    }

    private static void findallDigitsFromString() {
        //Find all the digits from the given String. Input: "abc123def456gh7ij89kl0" Output: 1,2,3,4,5,6,7,8,9,0
        String input ="abc123def456gh7ij89kl0";
        String output=input.chars().filter(Character::isDigit).mapToObj(c->String.valueOf((char)c)).
                collect(Collectors.joining(","));
        System.out.println(output);
    }
}
