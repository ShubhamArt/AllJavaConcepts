package java8;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//output should be "dba@get#fds"
public class ReversedString {
    public static void main(String[] args) {
        String str="sdf@teg#abd";
        // Step 1: Reverse non-special characters and collect them in a list
        List<Character> nonSpecialChars = str.chars()
                .filter(c -> c != '@' && c != '#')  // Filter out the special characters
                .mapToObj(c -> (char) c)  // Convert to Character
                .collect(Collectors.toList());

        // Reverse the list of non-special characters
        Collections.reverse(nonSpecialChars);

        // Step 2: Rebuild the string
        StringBuilder result = new StringBuilder();
        int nonSpecialIndex = 0;

        for (char c : str.toCharArray()) {
            if (c == '@' || c == '#') {
                result.append(c);  // Keep special characters in the same place
            } else {
                result.append(nonSpecialChars.get(nonSpecialIndex++));  // Place reversed non-special characters
            }
        }

        // Output the final result
        System.out.println(result.toString());
    }
}
