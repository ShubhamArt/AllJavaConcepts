package capgeminiL2Question;

import java.util.Arrays;

public class DiffOfSumEvenOdd {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4, 7};

        // Calculate the sum of even and odd numbers using Streams
        int sumEven = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)  // Even numbers
                .sum();

        int sumOdd = Arrays.stream(arr)
                .filter(n -> n % 2 != 0)  // Odd numbers
                .sum();

        // Subtract sum of odd from sum of even
        int result = sumEven - sumOdd;

        System.out.println("Result: " + result);
    }
}
