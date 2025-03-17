package TreeMapExample.usingComparableInterface;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Person implements Comparable<Person> {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implement compareTo for natural sorting based on age
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);  // Sorting by age
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }


    public static void main(String[] args) {
        TreeMap<Person, String> map = new TreeMap<>();

        map.put(new Person("Alice", 30), "Engineer");
        map.put(new Person("Bob", 25), "Doctor");
        map.put(new Person("Charlie", 35), "Teacher");

        String job = map.get(new Person("Alice", 30));
        System.out.println("Alice job : "+job);
        // Print the TreeMap, sorted by age (natural ordering)
        for (Map.Entry<Person, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}