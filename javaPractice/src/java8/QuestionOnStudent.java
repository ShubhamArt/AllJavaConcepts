package java8;

import java.util.List;
import java.util.stream.Collectors;

public class QuestionOnStudent {
    public static void main(String[] args) {
        // Sample Data
        Subject maths = new Subject("Maths");
        Subject science = new Subject("Science");
        Subject english = new Subject("English");

        Student student1 = new Student(12, List.of(maths, science),"sham");
        Student student2 = new Student(8, List.of(english, science),"ram");
        Student student3 = new Student(15, List.of(maths, english),"john");
        Student student4 = new Student(10, List.of(science, english),"sonu");

        List<Student> students = List.of(student1, student2, student3, student4);

        // Filter students: age > 10 and has Maths in their subjects
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAge() > 10 &&
                        student.getSubjects().stream().anyMatch(subject -> subject.getName().equalsIgnoreCase("Maths")))
                .collect(Collectors.toList());

        // Output the filtered students
        filteredStudents.forEach(student -> System.out.println("Student Age: " + student.getAge() +" Student name: "+student.getStudentName()));
    }
}
