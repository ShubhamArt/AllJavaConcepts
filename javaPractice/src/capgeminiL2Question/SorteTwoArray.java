package capgeminiL2Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SorteTwoArray {
    public static void main(String[] args) {
        sort1();
        sort2();
    }

    private static void sort2() {
        Integer[] array1 = {3, 1, 4, 1, 5, 9};
        Integer[] array2 = {2, 6, 5, 3, 5, 8};

        // Combine, remove duplicates, sort and collect the result into a new list
        Integer[] result = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))  // Merge the arrays
                .distinct()                                     // Remove duplicates
                .sorted()                                       // Sort the stream
                .toArray(Integer[]::new);                       // Collect back into an array

        // Print the sorted array without duplicates
        System.out.println("In Ascending order sorder array :" + Arrays.toString(result));

        Integer[] result1 = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))  // Merge the arrays
                .distinct()                                     // Remove duplicates
                .sorted(Comparator.reverseOrder())                                       // Sort the stream
                .toArray(Integer[]::new);

        // Print the sorted array without duplicates
        System.out.println("In Descending order sorder array :" + Arrays.toString(result1));
    }

    private static void sort1() {
        int[] arr1 = {3, 1, 4, 1, 5, 9};
        int[] arr2 = {2, 6, 5, 3, 5, 8};

        // Merge, remove duplicates, sort, and collect the result into a new int array
        int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))  // Merge the arrays
                .distinct()                                     // Remove duplicates
                .sorted()                                       // Sort the stream
                .toArray();                                     // Collect back into an array

        // Print the sorted array without duplicates
        System.out.println(Arrays.toString(result));
    }
}
