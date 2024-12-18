package interviewQuestions;

import java.util.Arrays;

public class SimensQuestion {
    public static String calculateMinMaxAverage(String[] str) {
        // Convert the string array to an int array
        int[] numbers = Arrays.stream(str)
                .mapToInt(Integer::parseInt)
                .toArray();

        // Calculate min, max, and average
        int min = Arrays.stream(numbers).min().orElseThrow();
        int max = Arrays.stream(numbers).max().orElseThrow();
        double average = Arrays.stream(numbers).average().orElseThrow();

        // Return the results as a formatted string
        return "Min: " + min + ", Max: " + max + ", Average: " + average;
    }
    public static void main(String[] args) {
        String[] str = {"34", "19", "0", "79", "11", "243"};

        // Call the function and store the result
        String result = calculateMinMaxAverage(str);

        // The result is now stored in 'result', and you can use it as needed
        // For example, returning the result in the method or passing it further.
    }
}
