package flattenNestedArray;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlattenArrayByJava8 {
    public static List<Object> flatten(List<Object> nestedArray) {
        return nestedArray.stream()
                .flatMap(item -> item instanceof List
                        ? flatten((List<Object>) item).stream()  // Recursively flatten nested lists
                        : Stream.of(item))  // If it's not a list, wrap the item in a Stream
                .collect(Collectors.toList());  // Collect the flattened items into a list
    }

    public static void main(String[] args) {
        // Test Input: [[[1], 2], [3, 4]]
        List<Object> nestedArray = new ArrayList<>();

        // Creating the nested list structure: [[[1], 2], [3, 4]]
        List<Object> firstLevel = new ArrayList<>();
        List<Object> secondLevel = new ArrayList<>();
        secondLevel.add(1);
        firstLevel.add(secondLevel);  // Add the nested list [1]
        firstLevel.add(2);            // Add the number 2

        List<Object> thirdLevel = new ArrayList<>();
        thirdLevel.add(3);           // Add the number 3
        thirdLevel.add(4);           // Add the number 4

        nestedArray.add(firstLevel); // Add the first level [[1], 2]
        nestedArray.add(thirdLevel); // Add the second level [3, 4]

        // Flattening the array using streams
        List<Object> flatArray = flatten(nestedArray);

        // Output result
        System.out.println(flatArray); // Output: [1, 2, 3, 4]
    }
}
