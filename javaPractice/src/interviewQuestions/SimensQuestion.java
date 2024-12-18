package interviewQuestions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;

//String str[] = new String["34", "19", "0", "79", "11", "243"]   find max min and average of this array and
// write a function that will return this 3 at atime and user should be able to understand from answer which
// is max min and average without println just return
public class SimensQuestion {
    public static void main(String[] args) {
        String str[] = {"34", "19", "0", "79", "11", "243"};
        System.out.println(calculateByjavaStream(str));
        System.out.println(getMaxMinAvgBYstream(str));
        String result = getMaxMinAverage(str);
        System.out.println(result);
    }

    private static String getMaxMinAvgBYstream(String[] str) {
        // Convert the String array to an int stream
        int[] numbers = Arrays.stream(str)
                .mapToInt(Integer::parseInt)
                .toArray();

        // Find the max, min, and average using streams
        int max = Arrays.stream(numbers).max().orElseThrow();
        int min = Arrays.stream(numbers).min().orElseThrow();
        double avg = Arrays.stream(numbers).average().orElseThrow();

        return "Maximum: " + max + ", Minimum: " + min + ", Average: " + avg;
    }

    private static IntSummaryStatistics calculateByjavaStream(String[] str) {
        //System.out.println(Arrays.stream(str).mapToInt(Integer::parseInt).max().orElse(0));
       return Arrays.stream(str).mapToInt(Integer::parseInt).summaryStatistics();
    }

    // Function to calculate max, min, and average
    public static String getMaxMinAverage(String[] str) {
        // Convert String array to integer array
        int[] numbers = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }

        double average = (double) sum / numbers.length;

        // Return a formatted string with max, min, and average values
        return "Maximum: " + max + ", Minimum: " + min + ", Average: " + average;
    }

}
