package capgeminiL2Question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/* find First Non-repeated character from the String
Ex:
Input : { "array", "apple", "rat"}

Output: y,a,r*/
public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        String[] words = {"array", "apple", "rat"};
        List<Character> result = Arrays.stream(words)
                .map(FindFirstNonRepeatingChar::findFirstNonRepeatedCharacter)  // For each word, find the first non-repeated character
                .toList();

        result.forEach(System.out::print);
    }

    private static Character findFirstNonRepeatedCharacter(String word) {
        // Use a map to count occurrences of each character in the word
        Map<Character, Long> charCount = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Find the first character that occurs exactly once
        return word.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> charCount.get(c) == 1)
                .findFirst()
                .orElse(null);  // Return null if no non-repeated character is found
    }
}
