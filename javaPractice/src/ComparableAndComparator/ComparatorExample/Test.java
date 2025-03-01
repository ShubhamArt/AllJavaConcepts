package ComparableAndComparator.ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tina", 30));
        students.add(new Student("Gita", 22));
        students.add(new Student("John", 20));
        students.add(new Student("Meena", 21));



        Collections.sort(students, new AgeComparator());
        System.out.println("Students sorted by age: " + students);


        Collections.sort(students, new NameComparator());
        System.out.println("Students sorted by name: " + students);
    }
}
