package ComparableAndComparator.ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        if (age == o.age) {
            return 0;
        } else if (age > o.age) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        List<Testing.Student> students = new ArrayList<>();
        students.add(new Testing.Student("tina", 30));
        students.add(new Testing.Student("gita", 22));
        students.add(new Testing.Student("john", 20));
        students.add(new Testing.Student("meena", 21));
        Collections.sort(students);
        System.out.println(students);
    }


}