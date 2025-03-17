package TreeMapExample.customComparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    public static void main(String[] args) {
        // Custom Comparator: Sort by name (ascending)
        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);  // Sorting by name
            }
        };

        // TreeMap with custom comparator
        TreeMap<Person, String> map = new TreeMap<>(nameComparator);

        map.put(new Person("Alice", 30), "Engineer");
        map.put(new Person("Bob", 25), "Doctor");
        map.put(new Person("Charlie", 35), "Teacher");

        // Print the TreeMap, sorted by name
        for (Map.Entry<Person, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
