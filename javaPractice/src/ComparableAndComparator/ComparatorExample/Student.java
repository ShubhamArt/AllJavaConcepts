package ComparableAndComparator.ComparatorExample;

public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Optional toString() for better readability
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
