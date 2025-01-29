package capgeminiL2Question;

import java.util.function.Predicate;

public class numberGreaterThanN {
    public static void main(String[] args) {
        // Number to check
        int number = 18;

        // Predicate to check if the number is greater than 16
        Predicate<Integer> isGreaterThan16 = n -> n > 16;

        // Check using the Predicate
        if (isGreaterThan16.test(number)) {
            System.out.println(number + " is greater than 16.");
        } else {
            System.out.println(number + " is not greater than 16.");
        }
    }
}
