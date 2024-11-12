package HashingQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 12);
        map.put("d", 8);
        map.put("e", 50);
        map.put("f", 18);
        map.put("g", 21);
        map.put("h", 35);


        // Convert the map to a list of Map.Entry objects
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        // Sort the list based on values in descending order
        //entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));


        // Sort the list based on values in ascending order
        entryList.sort(Map.Entry.comparingByValue());
        // Create a LinkedHashMap to maintain insertion order after sorting
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        // Put the sorted entries back into the sortedMap
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        System.out.println(sortedMap);


        //by java 8

        Map<String, Integer> sortedMapByJava8 = map.entrySet().stream().
                sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        sortedMapByJava8.forEach((key, value) -> System.out.println(key + " " + value));

    }
}
