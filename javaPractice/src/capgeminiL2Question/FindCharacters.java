package capgeminiL2Question;

import java.util.Arrays;
import java.util.List;

//output should be --> out: gh,ij
public class FindCharacters {

    public static void main(String[] args) {


        String str = "abc1def2gh3ij4lkm5";
        List<String> alphabetSequences = Arrays.stream(str.split("\\d+")) // Split by digits
                .filter(s -> !s.isEmpty()) // Remove any empty strings
                .toList();

        // Print the 3rd and 4th alphabetic sequences ("gh" and "ij")
        if (alphabetSequences.size() >= 4) {
            System.out.println(alphabetSequences.get(2) + " , " + alphabetSequences.get(3));
        }
    }
}
