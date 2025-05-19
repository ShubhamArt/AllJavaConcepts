package interviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class DeloitteQuestion {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Test", "XYZ", "Hello", "Java", "India");

        List<Optional<Character>> firstVowels = words.stream()
                .map(word -> word.chars()
                        .mapToObj(c -> (char) c)
                        .filter(c -> "aeiouAEIOU".indexOf(c) >= 0)
                        .findFirst()
                )
                .collect(Collectors.toList());

        // Print the results
        firstVowels.forEach(vowel -> System.out.println(vowel.orElse('-')));
    }

}
