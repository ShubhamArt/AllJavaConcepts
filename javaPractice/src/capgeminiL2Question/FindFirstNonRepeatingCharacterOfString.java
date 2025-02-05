package capgeminiL2Question;

import java.util.HashMap;

public class FindFirstNonRepeatingCharacterOfString {
    public static void main(String[] args) {
        String str = "Java articles are Awesome";
        System.out.println("First non-repeating character: " + findFirstNonRepeating(str));
    }

    public static char findFirstNonRepeating(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // First pass to count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {  // Ignore spaces
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(charCount);
        // Second pass to find the first character with count 1
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ' && charCount.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found
        return '-';
    }
}
