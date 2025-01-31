package flattenNestedArray;

import java.util.ArrayList;
import java.util.List;

public class FlattenArray {
    public static List<Object> flatten(List<Object> nestedArray) {
        List<Object> result = new ArrayList<>();

        for (Object item : nestedArray) {
            if (item instanceof List) {
                // Recursive call for nested list
                result.addAll(flatten((List<Object>) item));
            } else {
                // Directly add the integer if it is not a nested list
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test Input: [[[1],2],[3,4]]
        List<Object> nestedArray = new ArrayList<>();

        // Creating the nested list
        List<Object> firstLevel = new ArrayList<>();
        List<Object> secondLevel = new ArrayList<>();
        secondLevel.add(1);
        firstLevel.add(secondLevel);
        firstLevel.add(2);

        List<Object> thirdLevel = new ArrayList<>();
        thirdLevel.add(3);
        thirdLevel.add(4);

        nestedArray.add(firstLevel);
        nestedArray.add(thirdLevel);

        // Flattening the array
        List<Object> flatArray = flatten(nestedArray);

        // Output result
        System.out.println(flatArray); // Output: [1, 2, 3, 4]
    }
}
